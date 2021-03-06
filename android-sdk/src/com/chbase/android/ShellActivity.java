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
package com.chbase.android;

import java.net.URLEncoder;

import com.chbase.Connection;
import com.chbase.HVInstance;
import com.chbase.HVInstanceResolver;
import com.chbase.android.CHBaseService.ConnectionStatus;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

// TODO: Auto-generated Javadoc
/**
 * The Class ShellActivity.
 */
public class ShellActivity extends Activity {

    /** The web view. */
    private WebView webView;
    
    /**
     * Creates the app auth intent.
     * 
     * @param ctx the ctx
     * @param appId the app id
     * 
     * @return the intent
     */
    public static Intent createAppAuthIntent(Activity ctx, String appId) {
    	String qs = "appid=" + appId;
        String url = 
            CHBaseService.getInstance().getSettings().getShellUrl()
             + "/redirect.aspx?target=APPAUTH&targetqs=" 
             + URLEncoder.encode(qs);
         
        Intent intent = new Intent(ctx, ShellActivity.class);
        intent.putExtra("url", url);         
        
        return intent;
    }
    
    /**
     * Creates the create application intent.
     * 
     * @param ctx the ctx
     * @param appToken the app token
     * @param appId the app id
     * 
     * @return the intent
     */
    public static Intent createCreateApplicationIntent(
            Context ctx,
            String appToken,
            String appId) {
        String queryString = String.format(
             "?appCreationToken=%s&instanceName=%s&aib=%s",
             URLEncoder.encode(appToken),
             URLEncoder.encode("Android Phone"),
             CHBaseService.getInstance().getSettings().getIsMultiInstanceAware());  //TODO: phone name
         queryString = 
             CHBaseService.getInstance().getSettings().getShellUrl() 
             + "/redirect.aspx?target=CREATEAPPLICATION&targetqs=" 
             + URLEncoder.encode(queryString);
             
         Intent intent = new Intent(ctx, ShellActivity.class);
         intent.putExtra("url", queryString);
         
         return intent;
    }
    
    /**
     * Called when the activity is first created.
     * 
     * @param savedInstanceState the saved instance state
     */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().requestFeature(Window.FEATURE_PROGRESS);
         
        // Makes Progress bar Visible
        getWindow().setFeatureInt(Window.FEATURE_PROGRESS, Window.PROGRESS_VISIBILITY_ON);
        
        webView = new WebView(this);
        
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSupportZoom(true);
        //settings.setBuiltInZoomControls(true); 
        
        webView.setWebViewClient(new ShellWebViewClient());
        webView.setWebChromeClient(new WebChromeClient() {
            public void onProgressChanged(WebView view, int progress)  {
                setProgress(progress * 100); 
            }
            
            @Override
            public void onReceivedTitle(WebView view, String title) {
                setTitle(title);
                super.onReceivedTitle(view, title);
            }
        });
        CookieManager.getInstance().removeAllCookie();
        
        setContentView(webView);
        Intent intent = getIntent();
        webView.loadUrl(intent.getStringExtra("url"));
    }
    
    /* (non-Javadoc)
     * @see android.app.Activity#onKeyDown(int, android.view.KeyEvent)
     */
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && webView.canGoBack()) {
            webView.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
    
    /* (non-Javadoc)
     * @see android.app.Activity#onDestroy()
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
    
    /**
     * The Class ShellWebViewClient.
     */
    private class ShellWebViewClient extends WebViewClient {
        /* (non-Javadoc)
         * @see android.webkit.WebViewClient#onPageFinished(android.webkit.WebView, java.lang.String)
         */
        @Override
        public void onPageFinished(WebView view, String url) {
            if (url.indexOf("complete") > 0) {
            	Uri uri = Uri.parse(url);
            	final String instanceId = uri.getQueryParameter("instanceid");
            	
            	new AsyncTask<Void, Void, Void>() {
                    protected Void doInBackground(Void... v) {
                        resolveInstance(instanceId);
                        return null;
                   }
                   
                   @Override
                   protected void onPostExecute(Void v) {
                      finish();
                   }
                }.execute();
            }
            super.onPageFinished(view, url);
        }
        
        private void resolveInstance(String instanceId) {
    		Connection connection = ConnectionFactory.getUnauthenticatedConnection();
    		connection.setAppId(CHBaseService.getInstance().getSettings().getMasterAppId());
    		HVInstance instance = new HVInstanceResolver(connection)
    				.getInstanceForId(instanceId);	
    		CHBaseSettings settings = CHBaseService.getInstance().getSettings();
    		settings.setServiceUrl(instance.getPlatformUri().toString());
    		settings.setShellUrl(instance.getShellUri().toString());
    		settings.setConnectionStatus(ConnectionStatus.Connected);
    		settings.save();
        }
        
        /* (non-Javadoc)
         * @see android.webkit.WebViewClient#shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String)
         */
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            
            return true;
        }
    }
}
