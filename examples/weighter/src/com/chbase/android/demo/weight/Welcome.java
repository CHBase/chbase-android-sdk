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

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.chbase.ApplicationConfig;
import com.chbase.android.CHBaseFileSettings;
import com.chbase.android.CHBaseInitializationHandler;
import com.chbase.android.CHBaseService;
import com.chbase.android.CHBaseSettings;

public class Welcome 
	extends Activity
	implements CHBaseInitializationHandler {

    private CHBaseService service;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
        
        service = CHBaseService.initialize(this);
        CHBaseSettings settings = service.getSettings();
        
        if (settings.getConnectionStatus() == CHBaseService.ConnectionStatus.Connected)
        {
        	OnConnected();
        }
        else
        {
        	settings.setMasterAppId("4f44350e-fa2b-49b9-b1c6-6f97a3baa331");
		    settings.setServiceUrl("http://chbaseplatform-ppev2.dev.grcdemo.com/platform/wildcat.ashx");
		    settings.setShellUrl("http://chbase-ppev2.dev.grcdemo.com");
		    settings.setIsMultiInstanceAware(true);   
        }
        
        
        Button go = (Button) findViewById(R.id.goButton);
        go.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
            	service.connect(Welcome.this, Welcome.this);
            }
        });
    }

    @Override
    protected void onResume() {
    	if (service.getSettings().getConnectionStatus() == CHBaseService.ConnectionStatus.Connected) {
        	OnConnected();
        }
    	
        InitializeControls();
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
	public void OnConnected() {
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
