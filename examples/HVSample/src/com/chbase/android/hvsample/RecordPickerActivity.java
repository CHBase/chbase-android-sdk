package com.chbase.android.hvsample;

import com.chbase.android.simplexml.CHBaseApp;
import com.chbase.android.simplexml.client.HealthVaultClient;

import android.app.ListActivity;
import android.os.Bundle;

public class RecordPickerActivity extends ListActivity {
	
	private HealthVaultClient hvclient;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recordpicker);
        
        hvclient = new HealthVaultClient();
        
        RecordPickerArrayAdapter adapter = 
	            new RecordPickerArrayAdapter(this, 
	            		CHBaseApp.getInstance().getRecordList(),
	            		hvclient);
        
		setListAdapter(adapter);
    }
	
	@Override
	protected void onStart() {
		super.onStart();
		hvclient.start();
	}
	
	@Override
	protected void onResume() {
		super.onResume();
	}

	@Override
	protected void onStop() {
		hvclient.stop();
		super.onStop();
	}
}
