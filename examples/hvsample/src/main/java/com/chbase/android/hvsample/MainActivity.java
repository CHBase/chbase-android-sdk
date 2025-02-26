package com.chbase.android.hvsample;

import java.io.FileOutputStream;

import com.chbase.HVException;
import com.chbase.android.simplexml.CHBaseApp;
import com.chbase.android.simplexml.CHBaseInitializationHandler;
import com.chbase.android.simplexml.CHBaseSettings;
import com.chbase.android.simplexml.client.HealthVaultClient;
import com.chbase.android.simplexml.client.RequestCallback;

import android.annotation.SuppressLint;
import android.app.ListActivity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;

public class MainActivity 
	extends ListActivity
	implements CHBaseInitializationHandler {

	private CHBaseApp service;
	private HealthVaultClient hvClient;
	
	private ProgressDialog connectProgressDialog;
	
	String[] tests = {
            "WeightPutGet",
            "VocabTest",
            "LocalVault"
    };
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		service = CHBaseApp.getInstance(this);
		if (service.isAppConnected()) {
			service.start(this, this);
		}

		hvClient = new HealthVaultClient();

		ListView listView = getListView();

		listView.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, tests));
		Button clickButton = (Button) findViewById(R.id.connect_button);
		clickButton.setOnClickListener( new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				doConnect();
			}
		});
	}
	
	@Override
	protected void onStart() {
		super.onStart();
		hvClient.start();
	}
	
	@Override
    protected void onResume()
    {
		super.onResume();
    }
	
    @Override
	protected void onStop() {
		super.onStop();
		if(connectProgressDialog != null) {
			connectProgressDialog.dismiss();
		}
		
		hvClient.stop();
	}
	public void onConnected() {
	}

	public void onError(Exception e) {
		Toast.makeText(
                MainActivity.this, 
                e.getMessage(), 
                Toast.LENGTH_LONG).show();
	}

	
    @Override
	public boolean onOptionsItemSelected(MenuItem item) {
	        if( item.getItemId() ==R.id.action_connect) {
				doConnect();
				return true;
			}
			return super.onOptionsItemSelected(item);
	}
	
	private void doConnect() {
		if (!service.isAppConnected()) {
			connectProgressDialog = ProgressDialog.show(
                    MainActivity.this,
                    "",
                    "Please wait...", 
                    true);
			
			CHBaseSettings settings = service.getSettings();
			settings.setMasterAppId("2de3518e-3756-4dd7-af2b-282728c228be");
		    settings.setServiceUrl("https://tbe000-chbase-platform.qas.chbase.com/platform/wildcat.ashx");
		    settings.setShellUrl("https://tbe000-chbase-shell.qas.chbase.com");
			settings.setIsMultiInstanceAware(true);
			settings.setIsMRA(true);
			service.start(MainActivity.this, MainActivity.this);
    	}
		else {
			Toast.makeText(
	                MainActivity.this, 
	                "App is already connected", 
	                Toast.LENGTH_LONG).show();
		}
	}
	
	public void onListItemClick(ListView parent, View v, int position, long id) {
        TextView item = (TextView) v;
        Intent intent = null;
        if (service.isAppConnected()) {
	        switch(position) {
	        case 0: 
        		intent = new Intent(MainActivity.this, WeightActivity.class);
	        	break;
	        case 1:
	        	intent = new Intent(MainActivity.this, FileUploadActivity.class);
	        	break;
	        case 2:
	        	intent = new Intent(MainActivity.this, FileDownloadActivity.class);
	        	break;
	        case 3:
	        	intent = new Intent(MainActivity.this, VocabActivity.class);
	        	break;
	        case 4:
	        	intent = new Intent(MainActivity.this, LocalVaultActivity.class);
	        }
        }
        
        if(intent != null) {
        	startActivity(intent);
        }
    }


	private String writeFile() {
		String filename = "writefile" + System.currentTimeMillis()  + ".txt";
		String string = "This is from file upload";
		FileOutputStream outputStream;

		try {
		  outputStream = openFileOutput(filename, Context.MODE_PRIVATE);
		  outputStream.write(string.getBytes());
		  outputStream.close();
		  
		  return filename;
		} catch (Exception e) {
			Log.e("MainActivity", "Error opening file " + filename, e);
		}
		
		return null;
	}

	private class HVConnect extends AsyncTask<Void, Void, Void> {
		
		private ProgressDialog progressDialog;
        
        public HVConnect() {
            progressDialog = ProgressDialog.show(
                    MainActivity.this,
                    "",
                    "Please wait...", 
                    true);
        }

		@Override
		protected Void doInBackground(Void... arg0) {
			
			CHBaseSettings settings = service.getSettings();
			settings.setMasterAppId("2de3518e-3756-4dd7-af2b-282728c228be");
		    settings.setServiceUrl("https://tbe000-chbase-platform.qas.chbase.com/platform/wildcat.ashx");
		    settings.setShellUrl("https://tbe000-chbase-shell.qas.chbase.com");
			settings.setIsMultiInstanceAware(true);
			
			service.start(MainActivity.this, MainActivity.this);
			
			return null;
		}
		
		@Override
        protected void onPostExecute(Void result) {
            progressDialog.dismiss();
        }
	}
	
	public class MainActivityCallback<Object> implements RequestCallback {
    	public final static int UpdateRecords = 0;
    
    	private int event;
    	
    	public MainActivityCallback(int event) {
    		MainActivity.this.setProgressBarIndeterminateVisibility(true);
    		this.event = event;
    	}

        @Override
        public void onError(HVException exception) {
        	MainActivity.this.setProgressBarIndeterminateVisibility(false);
            Toast.makeText(
    		MainActivity.this, 
                "An error occurred.  " + exception.getMessage(), 
                Toast.LENGTH_LONG).show();
        }

		@Override
		public void onSuccess(java.lang.Object obj) {
			MainActivity.this.setProgressBarIndeterminateVisibility(false);
            switch(event) {
            case UpdateRecords:
                // updateRecords((List<Record>)obj);
                break;
            }
        }
    }
}
