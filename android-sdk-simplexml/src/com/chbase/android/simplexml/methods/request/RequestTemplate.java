package com.chbase.android.simplexml.methods.request;

import java.io.InputStream;

import com.chbase.Connection;
import com.chbase.HVAccessor;
import com.chbase.HVException;
import com.chbase.Request;
import com.chbase.android.simplexml.XmlSerializer;

public class RequestTemplate {

	private String personId;
	private String recordId;
	private Connection connection;

	public RequestTemplate(Connection connection) {
		this(connection, null, null);
	}

	public RequestTemplate(Connection connection,
			String personId,
			String recordId) {
		this.connection = connection;
		this.recordId = recordId;
		this.personId = personId;
	}

	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public String getRecordId() {
		return recordId;
	}

	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	public <T> T makeRequest(HVRequestInfo info, Class<T> response) throws HVException
	{
		return makeRequest(new Request(), info, response);
	}

	public <T> T makeRequest(
			Request request, 
			HVRequestInfo requestInfo, 
			final Class<T> response) 
					throws HVException
					{
		populateRequest(request, requestInfo);

		return makeRequest(request, new RequestMarshaller<T>() {
			public T marshal(InputStream istream) throws Exception {
				return XmlSerializer.read(response, istream);
			}
		});
    }

	public <T> T makeRequest(Request request, RequestMarshaller<T> marshaller)
	{
		request.setTtl(3600 * 8 + 300); 
		if (personId != null) request.setOfflineUserId(personId);
		if (recordId != null) request.setRecordId(recordId);

		HVAccessor accessor = new HVAccessor();
		accessor.send(request, connection);

		try
		{
			InputStream istream = accessor.getResponse().getInputStream();
			try
			{
				return marshaller.marshal(istream);
			}
			finally
			{
				istream.close();
			}
		}
		catch(HVException e)
		{
			throw e;
		}
		catch(Exception e)
		{
			//TODO: need exception translator
			throw new HVException("Could not marshal response", e);
		}	

	}

	private void populateRequest(Request request, HVRequestInfo requestInfo) {
		if (!requestInfo.getClass().isAnnotationPresent(HVMethodRequest.class))
		{
			// TODO:  use subclass
			throw new HVException("Invalid request.  Expecting HVRequest");
		}

		HVMethodRequest hvRequest = requestInfo.getClass().getAnnotation(HVMethodRequest.class);

		request.setMethodName(hvRequest.methodName());
		request.setMethodVersion(hvRequest.methodVersion());
		request.setInfo(makeInfoString(requestInfo));
	}

	private String makeInfoString(HVRequestInfo requestInfo) {
		try {
			return XmlSerializer.write(requestInfo);
		}
		catch (Exception e)
		{
			throw new HVException("Could not serialize RequestInfo object", e);
		}
	}
}
