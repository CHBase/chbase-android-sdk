package com.chbase.android.simplexml.methods.removeapplicationauthorization.request;

import org.simpleframework.xml.Root;

import com.chbase.android.simplexml.methods.request.HVMethodRequest;
import com.chbase.android.simplexml.methods.request.HVRequestInfo;

@Root(name = "info")
@HVMethodRequest(methodName="RemoveApplicationAuthorization", methodVersion="1")
public class RemoveApplicationAuthorizationRequest implements HVRequestInfo {
}
