package com.chbase.android.demo.weight.callbacks;

import android.app.Activity;
import android.util.Log;
import android.widget.Toast;


import com.chbase.HVException;
import com.chbase.android.simplexml.client.HealthVaultClient;
import com.chbase.android.simplexml.client.RequestCallback;
import com.chbase.android.simplexml.methods.getthings3.request.ThingRequestGroup2;
import com.chbase.android.simplexml.methods.getthings3.response.ThingResponseGroup2;
import com.chbase.android.simplexml.things.thing.ThingKey;
import com.chbase.android.simplexml.things.types.advancedirectivev2.AdvanceDirectiveV2;
import com.chbase.android.simplexml.things.types.types.Record;

public class AdvanceDirectiveCallback <Object> implements RequestCallback {

    public  static int Create=1;
    public  static int Get=2;
    private final Activity activity;
    private final int mode;
    private final Record selectedRecord;
    private HealthVaultClient hvClient;
    @Override
    public void onError(HVException exception) {

    }
    public AdvanceDirectiveCallback(HealthVaultClient hvClient,
                                    Record selectedRecord,
                                    Activity activity,
                                    int mode){
        this.activity=activity;
        this.mode = mode;
        this.hvClient=hvClient;
        this.selectedRecord=selectedRecord;
    }

    @Override
    public void onSuccess(java.lang.Object o) {
        if(mode==Create) {
            ThingKey key = (ThingKey) o;
            Toast.makeText(this.activity, "Created item with key "+key.getValue(), Toast.LENGTH_SHORT).show();
            hvClient.asyncRequest(
                    selectedRecord.getThingsAsync(ThingRequestGroup2.thingTypeQuery(AdvanceDirectiveV2.typeId)),
                    new AdvanceDirectiveCallback(this.hvClient, this.selectedRecord, this.activity, Get));
        }
        else {
            ThingResponseGroup2 responseGroup2 = (ThingResponseGroup2) o;
            Toast.makeText(this.activity, "Read "+responseGroup2.getThing().size()+" AdvanceDirective items.", Toast.LENGTH_SHORT).show();
        }
    }
}
