package com.chbase.android.simplexml.test;

import com.chbase.Connection;
import com.chbase.android.simplexml.HealthVaultApp;
import com.chbase.android.simplexml.methods.getauthorizedpeople.request.GetAuthorizedPeopleParameters;
import com.chbase.android.simplexml.methods.getauthorizedpeople.request.GetAuthorizedPeopleRequest;
import com.chbase.android.simplexml.methods.getauthorizedpeople.response.GetAuthorizedPeopleResponse;
import com.chbase.android.simplexml.methods.request.RequestTemplate;

import junit.framework.TestCase;

public class GetAuthorizedPeopleTest extends TestCase {

	private Connection connection;
	
	public GetAuthorizedPeopleTest() {
	}
	
	public void setUp()
	{
        HVSettings settings = new HVSettings();
        settings.setAppId("90976b0c-e0c2-467e-b65c-ed9117aa94e9");
        settings.setAuthenticationSecret("JpGYZ54MRAhy2Gw9uoWCfxTG97ufR3v7kZ/i2JG+Utw=");
		HealthVaultApp app = new HealthVaultApp(settings);
		HealthVaultApp.setInstance(app);
	}

	public void testGetAuthorizedPeople() {
		RequestTemplate requestTemplate = new RequestTemplate(
				HealthVaultApp.getInstance().getConnection());
		
		GetAuthorizedPeopleRequest request = new GetAuthorizedPeopleRequest(
				new GetAuthorizedPeopleParameters());
		
		GetAuthorizedPeopleResponse response = requestTemplate.makeRequest(
				request, 
				GetAuthorizedPeopleResponse.class);
	}
}
