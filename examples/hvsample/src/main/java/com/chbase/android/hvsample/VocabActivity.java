package com.chbase.android.hvsample;

import com.chbase.android.simplexml.client.HealthVaultClient;
import com.chbase.android.simplexml.things.types.base.VocabFamily;
import com.chbase.android.simplexml.things.types.base.VocabName;
import com.chbase.android.simplexml.vocabs.types.VocabIdentifier;

import android.app.Activity;
import android.os.Bundle;
import android.widget.AutoCompleteTextView;

public class VocabActivity extends Activity {

	private HealthVaultClient hvClient;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_vocab);
		
		hvClient = new HealthVaultClient();
		
		init();
	}
	
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		hvClient.start();
	}
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		
		init();
	}

	@Override
	protected void onStop() {
		hvClient.stop();
		super.onStop();
	}

	private void init() {
		// Get a reference to the AutoCompleteTextView in the layout
		AutoCompleteTextView autoCompView = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView1);
		autoCompView.setAdapter(
				new VocabAutoCompleteAdapter(this, 
						R.layout.list_item, 
						new VocabIdentifier(VocabFamily.USDA, VocabName.FoodDescription),
						hvClient));
		autoCompView.setThreshold(3);
	}
}
