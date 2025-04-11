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
import com.chbase.android.simplexml.things.types.base.DisplayValue;
import com.chbase.android.simplexml.things.types.base.WeightValue;
import com.chbase.android.simplexml.things.types.bmi.Bmi;
import com.chbase.android.simplexml.things.types.bmi.BmiValue;
import com.chbase.android.simplexml.things.types.dates.DateTime;
import com.chbase.android.simplexml.things.types.height.HeightValue;
import com.chbase.android.simplexml.things.types.types.Record;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class BmiCallback<Object> implements RequestCallback {

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
    public BmiCallback(HealthVaultClient hvClient,
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
                    selectedRecord.getThingsAsync(ThingRequestGroup2.thingTypeQuery(Bmi.typeId)),
                    new BmiCallback(this.hvClient, this.selectedRecord, this.activity, this.listView, Get));
        }
        else {
            ThingResponseGroup2 responseGroup2 = (ThingResponseGroup2) o;
            List<String> listData = new ArrayList<String>();
            for(Thing2 thing : responseGroup2.getThing()) {
                Bmi bmi = (Bmi)thing.getData();
                listData.add(bmi.getValue().getKgm2()+" kgm2, "+bmi.getWhen().toString());
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
        Bmi bmi = new Bmi();
        bmi.setWhen(DateTime.fromCalendar(Calendar.getInstance()));

        HeightValue height = new HeightValue();
        height.setM(1.83);
        DisplayValue heightDisplayValue = new DisplayValue();
        heightDisplayValue.setText("1.83 meters");
        heightDisplayValue.setUnits("m");
        height.setDisplay(heightDisplayValue);
        bmi.setHeight(height);

        WeightValue weight = new WeightValue();
        weight.setKg(75);
        DisplayValue weightDisplayValue = new DisplayValue();
        weightDisplayValue.setText("75 kgs");
        weightDisplayValue.setUnits("kg");
        weight.setDisplay(weightDisplayValue);
        bmi.setWeight(weight);

        BmiValue bmiValue = new BmiValue();
        bmiValue.setKgm2(22.4);
        DisplayValue bmiDisplayValue = new DisplayValue();
        bmiDisplayValue.setText("22.4 kg/m²");
        bmiDisplayValue.setUnits("kg/m²");
        bmiValue.setDisplay(bmiDisplayValue);
        bmi.setValue(bmiValue);

        thing.setData(bmi);

        hvClient.asyncRequest(
                selectedRecord.putThingAsync(thing),
                new BmiCallback(hvClient, selectedRecord,
                        activity,
                        listView,
                        BmiCallback.Create));


    }

    public static void HandleBmi(Button btn, ListView listView, Activity activity, Record selectedRecord, HealthVaultClient hvClient){
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                put(listView, activity,selectedRecord, hvClient);
            }
        });
    }
}
