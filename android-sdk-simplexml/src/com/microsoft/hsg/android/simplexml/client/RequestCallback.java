package com.microsoft.hsg.android.simplexml.client;

import com.chbase.HVException;

public interface RequestCallback<T> {

    void onError(HVException exception);

    void onSuccess(T t);
}
