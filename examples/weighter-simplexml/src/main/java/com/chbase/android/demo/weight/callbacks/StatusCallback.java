package com.chbase.android.demo.weight.callbacks;


import android.app.Activity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.chbase.HVException;
import com.chbase.android.simplexml.client.HealthVaultClient;
import com.chbase.android.simplexml.client.RequestCallback;
import com.chbase.android.simplexml.methods.getthings3.request.ThingRequestGroup2;
import com.chbase.android.simplexml.methods.getthings3.response.ThingResponseGroup2;
import com.chbase.android.simplexml.things.thing.Thing2;
import com.chbase.android.simplexml.things.thing.ThingKey;
import com.chbase.android.simplexml.things.types.base.CodableValue;
import com.chbase.android.simplexml.things.types.status.Status;
import com.chbase.android.simplexml.things.types.types.Record;
import java.util.ArrayList;
import java.util.List;

public class StatusCallback<Object> implements RequestCallback {

    public  static int Create=1;
    public  static int Get=2;
    private final Activity activity;
    private final int mode;
    private final Record selectedRecord;
    private final ListView listView;
    private final HealthVaultClient hvClient;
    @Override
    public void onError(HVException exception) {

    }
    public StatusCallback(HealthVaultClient hvClient,
                          Record selectedRecord,
                          Activity activity,
                          ListView listView, int mode){
        this.activity=activity;
        this.mode = mode;
        this.hvClient=hvClient;
        this.selectedRecord=selectedRecord;
        this.listView=listView;
    }

    @Override
    public void onSuccess(java.lang.Object o) {
        if(mode==Create) {
            ThingKey key = (ThingKey) o;
            Toast.makeText(this.activity, "Created item with key "+key.getValue(), Toast.LENGTH_SHORT).show();
            hvClient.asyncRequest(
                    selectedRecord.getThingsAsync(ThingRequestGroup2.thingTypeQuery(Status.typeId)),
                    new StatusCallback(this.hvClient, this.selectedRecord, this.activity, this.listView, Get));
        }
        else {
            ThingResponseGroup2 responseGroup2 = (ThingResponseGroup2) o;
            List<String> listData = new ArrayList<String>();
            for(Thing2 thing : responseGroup2.getThing()) {
                Status item = (Status) thing.getData();
                listData.add(item.getText()+","+item.getStatusType().getText());
            }

            this.listView.setAdapter(new ArrayAdapter<String>(
                    this.activity,
                    android.R.layout.simple_list_item_1,
                    listData));
            Toast.makeText(this.activity, "Read "+responseGroup2.getThing().size()+" items.", Toast.LENGTH_SHORT).show();
        }
    }

    private static void put(ListView listView, Activity activity, Record selectedRecord, HealthVaultClient hvClient) {
        final Thing2 thing = new Thing2();
        Status status = new Status();

        status.setStatusType(new CodableValue("Some code"));
        status.setText("Some random chbase status");
        thing.setData(status);

        hvClient.asyncRequest(
                selectedRecord.putThingAsync(thing),
                new StatusCallback(hvClient, selectedRecord,
                        activity,
                        listView,
                        StatusCallback.Create));


    }

    public static void handle(Button btn, ListView listView, Activity activity, Record selectedRecord, HealthVaultClient hvClient){
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                put(listView, activity,selectedRecord, hvClient);
            }
        });
    }
}
