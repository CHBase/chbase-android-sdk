package com.chbase.android.simplexml.methods.beginputblob.request;

import org.simpleframework.xml.Root;

import com.chbase.android.simplexml.methods.request.HVMethodRequest;
import com.chbase.android.simplexml.methods.request.HVRequestInfo;

@Root(name = "info")
@HVMethodRequest(methodName="BeginPutBlob", methodVersion="1")
public class BeginPutBlobRequest implements HVRequestInfo{
}
