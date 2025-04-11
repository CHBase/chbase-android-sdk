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
import com.chbase.android.simplexml.things.types.advancedirectivev2.AdvanceDirectiveContactType;
import com.chbase.android.simplexml.things.types.advancedirectivev2.AdvanceDirectiveV2;
import com.chbase.android.simplexml.things.types.base.CodableValue;
import com.chbase.android.simplexml.things.types.base.Contact;
import com.chbase.android.simplexml.things.types.base.Name;
import com.chbase.android.simplexml.things.types.dates.DateTime;
import com.chbase.android.simplexml.things.types.types.Record;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class AdvanceDirectiveCallback <Object> implements RequestCallback {

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
    public AdvanceDirectiveCallback(HealthVaultClient hvClient,
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
                    selectedRecord.getThingsAsync(ThingRequestGroup2.thingTypeQuery(AdvanceDirectiveV2.typeId)),
                    new AdvanceDirectiveCallback(this.hvClient, this.selectedRecord, this.activity, this.listView, Get));
        }
        else {
            ThingResponseGroup2 responseGroup2 = (ThingResponseGroup2) o;
            List<String> advanceDirectives = new ArrayList<String>();
            for(Thing2 thing : responseGroup2.getThing()) {
                AdvanceDirectiveV2 directiveV2 = (AdvanceDirectiveV2)thing.getData();
                advanceDirectives.add(directiveV2.getName()+" "+directiveV2.getWhen().toString());
            }

            this.listView.setAdapter(new ArrayAdapter<String>(
                    this.activity,
                    android.R.layout.simple_list_item_1,
                    advanceDirectives));
            Toast.makeText(this.activity, "Read "+responseGroup2.getThing().size()+" AdvanceDirective items.", Toast.LENGTH_SHORT).show();
        }
    }

    private static void putAdvDirectiveEntry(ListView listView, Activity activity, Record selectedRecord, HealthVaultClient hvClient) {
        final Thing2 thing = new Thing2();
        AdvanceDirectiveV2 directive = new AdvanceDirectiveV2();
        directive.setWhen(DateTime.fromCalendar(Calendar.getInstance()));
        directive.setName("Test Advance Directive");

        Name name = new Name();
        name.setFull("John Doe");

        AdvanceDirectiveContactType contactInfo = new AdvanceDirectiveContactType();
        contactInfo.setName(name);
        contactInfo.setId("12345");
        contactInfo.setContactInfo(new Contact());

        contactInfo.setRelationship(new CodableValue("Family"));
        contactInfo.setIsPrimary(true);

        directive.getContact().add(contactInfo);
        thing.setData(directive);

        hvClient.asyncRequest(
                selectedRecord.putThingAsync(thing),
                new AdvanceDirectiveCallback(hvClient, selectedRecord,
                        activity,
                        listView,
                        AdvanceDirectiveCallback.Create));


    }

    public static void HandleAdvanceDirective(Button btnPutAdvDirective,ListView listView, Activity activity, Record selectedRecord, HealthVaultClient hvClient){
        btnPutAdvDirective.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                putAdvDirectiveEntry(listView, activity,selectedRecord, hvClient);
            }
        });
    }
}
