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
import com.chbase.android.simplexml.things.types.basicdemographic.BasicDemographic;
import com.chbase.android.simplexml.things.types.basicdemographic.Language;
import com.chbase.android.simplexml.things.types.dates.DateTime;
import com.chbase.android.simplexml.things.types.types.Record;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class BasicDemographicCallback<Object> implements RequestCallback {

    public  static int Create=1;
    public  static int Get=2;
    public  static int Update=3;
    private final Activity activity;
    private final int mode;
    private final Record selectedRecord;
    private final ListView listView;
    private HealthVaultClient hvClient;
    @Override
    public void onError(HVException exception) {

    }
    public BasicDemographicCallback(HealthVaultClient hvClient,
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
                    selectedRecord.getThingsAsync(ThingRequestGroup2.thingTypeQuery(BasicDemographic.typeId)),
                    new BasicDemographicCallback(this.hvClient, this.selectedRecord, this.activity, this.listView, Get));
        }
        else if (mode==Update){
            ThingResponseGroup2 responseGroup2 = (ThingResponseGroup2) o;
            ThingKey key = null;
            if (!responseGroup2.getThing().isEmpty()) {
                key = responseGroup2.getThing().get(0).getThingId();
            }
            update(this.listView,this.activity,this.selectedRecord,this.hvClient,key);
        }
        else {
            ThingResponseGroup2 responseGroup2 = (ThingResponseGroup2) o;
            List<String> listData = new ArrayList<String>();
            for(Thing2 thing : responseGroup2.getThing()) {
                BasicDemographic basicDemographic = (BasicDemographic)thing.getData();
                listData.add(basicDemographic.getBirthyear().toString()+" "+basicDemographic.getGender());
            }

            this.listView.setAdapter(new ArrayAdapter<String>(
                    this.activity,
                    android.R.layout.simple_list_item_1,
                    listData));
            Toast.makeText(this.activity, "Read "+responseGroup2.getThing().size()+" items.", Toast.LENGTH_SHORT).show();
        }
    }
    private void update(ListView listView, Activity activity, Record selectedRecord, HealthVaultClient hvClient, ThingKey key) {
        final Thing2 thing = new Thing2();
        if (key!=null) {
            thing.setThingId(key);
        }
        BasicDemographic basicDemographic = new BasicDemographic();
        basicDemographic.setGender("m");
        int seconds = DateTime.fromCalendar(Calendar.getInstance()).getTime().getS();
        basicDemographic.setBirthyear(1940+seconds);
        basicDemographic.setCountry(new CodableValue("USA"));
        basicDemographic.setPostcode("11001");
        basicDemographic.setCity("Jacksonville");
        basicDemographic.setState(new CodableValue("FL"));
        basicDemographic.setFirstdow(3);

        Language language = new Language();
        language.setLanguage(new CodableValue("es-mx"));
        basicDemographic.getLanguage().add(language);
        basicDemographic.getLanguage().add(language);

        thing.setData(basicDemographic);

        hvClient.asyncRequest(
                selectedRecord.putThingAsync(thing),
                new BasicDemographicCallback(hvClient, selectedRecord,
                        activity,
                        listView,
                        BasicDemographicCallback.Create));
    }
    private static void put(ListView listView, Activity activity, Record selectedRecord, HealthVaultClient hvClient) {
        hvClient.asyncRequest(
                selectedRecord.getThingsAsync(ThingRequestGroup2.thingTypeQuery(BasicDemographic.typeId)),
                new BasicDemographicCallback(hvClient, selectedRecord, activity, listView, Update));
    }

    public static void handle(Button btn, ListView listView, Activity activity, Record selectedRecord, HealthVaultClient hvClient){
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                put(listView, activity,selectedRecord, hvClient);
            }
        });
    }
}
