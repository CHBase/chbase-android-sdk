package com.chbase.android.simplexml.client;

import com.chbase.HVException;

import android.os.Handler;

public class AsyncCallbackHandler<T> implements RequestCallback<T> {
	
	private RequestCallback<T> delegate;
	private Handler responseHandler;
	
	public AsyncCallbackHandler(Handler responseHandler, RequestCallback<T> delegate) {
		this.delegate = delegate;
		this.responseHandler = responseHandler;
	}
	
	@Override
	public void onError(final HVException exception) {
		responseHandler.post( new Runnable() {
			public void run() {
				if (delegate != null) {
                    delegate.onError(exception);
				}
			}
		});
	}

	@Override
	public void onSuccess(final T t) {
		responseHandler.post( new Runnable() {
			public void run() {
				if (delegate != null) {
					delegate.onSuccess(t);
				}
			}
		});
	}
}
