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
import com.chbase.android.simplexml.things.types.dates.DateTime;
import com.chbase.android.simplexml.things.types.sleepsessionv2.Awakening;
import com.chbase.android.simplexml.things.types.sleepsessionv2.Level;
import com.chbase.android.simplexml.things.types.sleepsessionv2.SleepSessionV2;
import com.chbase.android.simplexml.things.types.types.Record;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class SleepSessionCallback<Object> implements RequestCallback {

    public  static int Create=1;
    public  static int Get=2;
    private final Activity activity;
    private final int mode;
    private final Record selectedRecord;
    private final ListView listView;
    private HealthVaultClient hvClient;
    @Override
    public void onError(HVException exception) {

    }
    public SleepSessionCallback(HealthVaultClient hvClient,
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
                    selectedRecord.getThingsAsync(ThingRequestGroup2.thingTypeQuery(SleepSessionV2.typeId)),
                    new SleepSessionCallback(this.hvClient, this.selectedRecord, this.activity, this.listView, Get));
        }
        else {
            ThingResponseGroup2 responseGroup2 = (ThingResponseGroup2) o;
            List<String> listData = new ArrayList<String>();
            for(Thing2 thing : responseGroup2.getThing()) {
                SleepSessionV2 item = (SleepSessionV2)thing.getData();
                listData.add(item.getBedTime().getH()+":"+item.getBedTime().getM()+" to "+item.getWakeTime().getH()+":"+item.getWakeTime().getM()+", "+item.getWhen().toString());
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
        SleepSessionV2 sleepSession = new SleepSessionV2();
        sleepSession.setWhen(DateTime.fromCalendar(Calendar.getInstance()));
        sleepSession.setBedTime(DateTime.fromCalendar(Calendar.getInstance()).getTime());
        sleepSession.setWakeTime(DateTime.fromCalendar(Calendar.getInstance()).getTime());
        sleepSession.setSleepMinutes(10);
        sleepSession.setSettlingMinutes(10);

        Awakening awakening = new Awakening();
        awakening.setMinutes(10);
        awakening.setWhen(DateTime.fromCalendar(Calendar.getInstance()).getTime());
        sleepSession.getAwakening().add(awakening);

        sleepSession.setMedications(new CodableValue("paracetamol"));
        sleepSession.setWakeState(2);
        sleepSession.setLightSleepDuration(2);
        sleepSession.setDeepSleepDuration(2);
        sleepSession.setRemSleepDuration(2);
        sleepSession.setAwakeDuration(2);
        sleepSession.setWakeupDuration(2);

        Level level = new Level();
        level.setStartTime(DateTime.fromCalendar(Calendar.getInstance()).getTime());
        level.setMinutes(5);
        level.setState(new CodableValue("good"));
        sleepSession.getLevel().add(level);

        sleepSession.setTimesWokenUp(2);
        sleepSession.setAverageRestingHr(2);
        sleepSession.setCaloriesBurned(2);
        thing.setData(sleepSession);

        hvClient.asyncRequest(
                selectedRecord.putThingAsync(thing),
                new SleepSessionCallback(hvClient, selectedRecord,
                        activity,
                        listView,
                        SleepSessionCallback.Create));


    }

    public static void handle(Button btn, ListView listView, Activity activity, Record selectedRecord, HealthVaultClient hvClient){
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                put(listView, activity,selectedRecord, hvClient);
            }
        });
    }
}
