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

import com.chbase.android.simplexml.CHBaseApp;
import com.chbase.android.simplexml.CHBaseInitializationHandler;
import com.chbase.android.simplexml.CHBaseSettings;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Welcome 
	extends Activity
	implements CHBaseInitializationHandler {

    private CHBaseApp service;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
        
        service = CHBaseApp.getInstance(this);
        
        Button go = (Button) findViewById(R.id.goButton);
        go.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
            	service.start(Welcome.this, Welcome.this);
            }
        });
        
        InitializeControls();
    }

    @Override
    protected void onResume() {
    	if (service.getConnectionStatus() == CHBaseApp.ConnectionStatus.Connected) {
    		onConnected();
    	}
    	else 
    	{
    		CHBaseSettings settings = service.getSettings();
    		settings.setMasterAppId("2de3518e-3756-4dd7-af2b-282728c228be");
		    settings.setServiceUrl("https://tbe000-chbase-platform.qas.chbase.com/platform/wildcat.ashx");
		    settings.setShellUrl("https://tbe000-chbase-shell.qas.chbase.com");
		    settings.setIsMultiInstanceAware(true);   
    	}
        super.onResume();
    }
    
    private void InitializeControls() {
        TextView msg = (TextView)findViewById(R.id.welcomeText);
        switch(service.getConnectionStatus()) {
        case Connected:
            msg.setText("Work With Your Weight");
            break;
        case NotConnected:
            msg.setText("Connect this application to CHBase");
            break;
        }
    }

	@Override
	public void onConnected() {
		Intent intent = new Intent(Welcome.this, WeightActivity.class);
        startActivity(intent);
        finish();
	}

	@Override
	public void onError(Exception e) {
		 Toast.makeText(
                 Welcome.this, 
                 e.getMessage(), 
                 Toast.LENGTH_LONG).show();
		
	}
}
