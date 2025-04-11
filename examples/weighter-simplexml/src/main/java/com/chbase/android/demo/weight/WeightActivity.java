/*
 * Copyright 2011 Microsoft Corp.
 * 
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.chbase.android.demo.weight;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import com.chbase.HVException;
import com.chbase.android.demo.weight.callbacks.AdvanceDirectiveCallback;
import com.chbase.android.demo.weight.callbacks.BmiCallback;
import com.chbase.android.demo.weight.callbacks.SleepSessionCallback;
import com.chbase.android.simplexml.CHBaseApp;
import com.chbase.android.simplexml.ShellActivity;
import com.chbase.android.simplexml.client.HealthVaultClient;
import com.chbase.android.simplexml.client.RequestCallback;
import com.chbase.android.simplexml.things.types.types.PersonInfo;
import com.chbase.android.simplexml.things.types.types.Record;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class WeightActivity extends Activity {

	private CHBaseApp service;
    private HealthVaultClient hvClient;
    private Record selectedRecord;
    
    public class WeightCallback<Object> implements RequestCallback {

    	public final static int UpdateRecords = 2;

    	private int event;

    	public WeightCallback(int event) {
            WeightActivity.this.setProgressBarIndeterminateVisibility(true);
    		this.event = event;
    	}

        @Override
        public void onError(HVException exception) {
            WeightActivity.this.setProgressBarIndeterminateVisibility(false);
            Toast.makeText(
                WeightActivity.this,
                "An error occurred.  " + exception.getMessage(),
                Toast.LENGTH_LONG).show();
        }

		@Override
		public void onSuccess(java.lang.Object obj) {
            WeightActivity.this.setProgressBarIndeterminateVisibility(false);
            switch(event) {

            case UpdateRecords:
                updateRecords((List<Record>)obj);
                break;
            }
        }
    }

   
    private void updateRecords(List<Record> records) {
        Spinner s = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<Record> adapter = new ArrayAdapter<Record>(
            WeightActivity.this, 
            android.R.layout.simple_spinner_item,
            records);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter);
    }

    /**
     * Called when the activity is first created.
     *
     * @param savedInstanceState the saved instance state
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS);
        setContentView(R.layout.weight);
        service = CHBaseApp.getInstance();
        hvClient = new HealthVaultClient();

        Button startAuth = (Button) findViewById(R.id.auth);
        startAuth.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                startActivity(ShellActivity.createAppAuthIntent(
                    WeightActivity.this, service.getAppId()));
            }
        });

        Button newApp = (Button) findViewById(R.id.newapp);
        newApp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                service.reset();
                Intent i = new Intent(WeightActivity.this, Welcome.class);
                startActivity(i);
                finish();
            }
        });


        Spinner s = (Spinner) findViewById(R.id.spinner);
        s.setOnItemSelectedListener( new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent,
                View view, int pos, long id) {
                selectedRecord = (Record)parent.getItemAtPosition(pos);
                List<String> emptylist = new ArrayList<String>();
                ((ListView) findViewById(R.id.dataList)).setAdapter(
                        new ArrayAdapter<String>(
                                WeightActivity.this,
                                android.R.layout.simple_list_item_1,
                                emptylist));

                AdvanceDirectiveCallback.HandleAdvanceDirective((Button)findViewById(R.id.btnPutAdvDirective), (ListView)findViewById(R.id.dataList), WeightActivity.this, selectedRecord, hvClient );
                BmiCallback.HandleBmi((Button)findViewById(R.id.btnPutBmi), (ListView)findViewById(R.id.dataList), WeightActivity.this, selectedRecord, hvClient );
                SleepSessionCallback.handle((Button)findViewById(R.id.btnSleepSession), (ListView)findViewById(R.id.dataList), WeightActivity.this, selectedRecord, hvClient );;
            }

            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });
    }



    @Override
	protected void onStart() {
		hvClient.start();
		super.onStart();
	}   
    
    @Override
    protected void onResume()
    {
    	InitializeControls();
        super.onResume();
    }
    
    private void InitializeControls() {
    	getRecords();
    }
    
    private void getRecords() {
    	hvClient.asyncRequest(new Callable<List<Record>>() {
    		public List<Record> call() {
                ArrayList<Record> records = new ArrayList<Record>();
                List<PersonInfo> personInfos = service.getPersonInfoList();
                for (PersonInfo personInfo : personInfos) {
                    for (Record record : personInfo.getRecords()) {
                        records.add(record);
                    }
                }
                
                if (records.size() > 0) {
                    selectedRecord = records.get(0);
                }
                
                return records;
    		}
    	}, 
    	new WeightCallback(WeightCallback.UpdateRecords));
    }


    @Override
	protected void onStop() {
    	hvClient.stop();
		super.onStop();
	}
}
