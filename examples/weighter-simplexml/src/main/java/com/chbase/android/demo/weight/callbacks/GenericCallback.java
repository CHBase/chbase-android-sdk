package com.chbase.android.demo.weight.callbacks;


import android.app.Activity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.chbase.HVException;
import com.chbase.android.demo.weight.callbacks.databuilders.HealthDataBuilder;
import com.chbase.android.simplexml.client.HealthVaultClient;
import com.chbase.android.simplexml.client.RequestCallback;
import com.chbase.android.simplexml.methods.getthings3.request.ThingRequestGroup2;
import com.chbase.android.simplexml.methods.getthings3.response.ThingResponseGroup2;
import com.chbase.android.simplexml.things.thing.Thing2;
import com.chbase.android.simplexml.things.thing.ThingKey;
import com.chbase.android.simplexml.things.types.types.Record;

import java.util.ArrayList;
import java.util.List;

public class GenericCallback<Object> implements RequestCallback {

    public  static int Create=1;
    public  static int Get=2;
    private final Activity activity;
    private final int mode;
    private final Record selectedRecord;
    private final ListView listView;
    private final HealthVaultClient hvClient;
    private final HealthDataBuilder builder;

    @Override
    public void onError(HVException exception) {

    }
    public GenericCallback(HealthVaultClient hvClient,
                           Record selectedRecord,
                           Activity activity,
                           ListView listView,
                           int mode,
                           HealthDataBuilder builder){
        this.activity=activity;
        this.mode = mode;
        this.hvClient=hvClient;
        this.selectedRecord=selectedRecord;
        this.listView=listView;
        this.builder=builder;
    }

    @Override
    public void onSuccess(java.lang.Object o) {
        if(mode==Create) {
            ThingKey key = (ThingKey) o;
            Toast.makeText(this.activity, "Created item with key "+key.getValue(), Toast.LENGTH_SHORT).show();
            hvClient.asyncRequest(
                    selectedRecord.getThingsAsync(ThingRequestGroup2.thingTypeQuery(builder.getTypeId())),
                    new GenericCallback(this.hvClient, this.selectedRecord, this.activity, this.listView, Get, this.builder));
        }
        else {
            ThingResponseGroup2 responseGroup2 = (ThingResponseGroup2) o;
            List<String> listData = new ArrayList<String>();
            for(Thing2 thing : responseGroup2.getThing()) {
                listData.add(this.builder.getDisplayString(thing.getData()));
            }

            this.listView.setAdapter(new ArrayAdapter<String>(
                    this.activity,
                    android.R.layout.simple_list_item_1,
                    listData));
        }
    }

    private static void put(ListView listView, Activity activity, Record selectedRecord, HealthVaultClient hvClient,HealthDataBuilder builder) {
        final Thing2 thing = new Thing2();
        thing.setData(builder.buildItem());
        hvClient.asyncRequest(
                selectedRecord.putThingAsync(thing),
                new GenericCallback(hvClient, selectedRecord,
                        activity,
                        listView,
                        GenericCallback.Create,
                        builder));


    }

    public static void handle(Button btn, ListView listView, Activity activity, Record selectedRecord, HealthVaultClient hvClient,HealthDataBuilder builder){
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                put(listView, activity,selectedRecord, hvClient,builder);
            }
        });
    }
}
