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
import com.chbase.android.simplexml.things.types.comment.Comment;
import com.chbase.android.simplexml.things.types.dates.ApproxDate;
import com.chbase.android.simplexml.things.types.dates.ApproxDateTime;
import com.chbase.android.simplexml.things.types.dates.DateTime;
import com.chbase.android.simplexml.things.types.dates.StructuredApproxDate;
import com.chbase.android.simplexml.things.types.dates.Time;
import com.chbase.android.simplexml.things.types.types.Record;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class CommentCallback<Object> implements RequestCallback {

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
    public CommentCallback(HealthVaultClient hvClient,
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
                    selectedRecord.getThingsAsync(ThingRequestGroup2.thingTypeQuery(Comment.typeId)),
                    new CommentCallback(this.hvClient, this.selectedRecord, this.activity, this.listView, Get));
        }
        else {
            ThingResponseGroup2 responseGroup2 = (ThingResponseGroup2) o;
            List<String> listData = new ArrayList<String>();
            for(Thing2 thing : responseGroup2.getThing()) {
                Comment item = (Comment) thing.getData();
                String dt = item.getWhen().getStructured().getDate().getY()
                        +"-"+item.getWhen().getStructured().getDate().getM()
                        +"-"+item.getWhen().getStructured().getDate().getD()
                        +"T"+item.getWhen().getStructured().getTime().getH()
                +":"+item.getWhen().getStructured().getTime().getM()
                +":"+item.getWhen().getStructured().getTime().getS();
                listData.add(item.getContent()+", "+dt);
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
        Comment comment = new Comment();

        comment.setCategory(new CodableValue("Some code"));
        DateTime dt = DateTime.fromCalendar(Calendar.getInstance());
        ApproxDateTime approxDt= new ApproxDateTime();

        StructuredApproxDate structuredApproxDate= new StructuredApproxDate();

        ApproxDate approxDate= new ApproxDate();
        approxDate.setD(dt.getDate().getD());
        approxDate.setM(dt.getDate().getM());
        approxDate.setY(dt.getDate().getY());

        Time time = new Time();
        time.setH(dt.getTime().getH());
        time.setM(dt.getTime().getM());
        time.setS(dt.getTime().getS());

        structuredApproxDate.setDate(approxDate);
        structuredApproxDate.setTime(time);

        approxDt.setStructured(structuredApproxDate);

        comment.setWhen(approxDt);
        comment.setContent("Comment content");
        thing.setData(comment);

        hvClient.asyncRequest(
                selectedRecord.putThingAsync(thing),
                new CommentCallback(hvClient, selectedRecord,
                        activity,
                        listView,
                        CommentCallback.Create));


    }

    public static void handle(Button btn, ListView listView, Activity activity, Record selectedRecord, HealthVaultClient hvClient){
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                put(listView, activity,selectedRecord, hvClient);
            }
        });
    }
}
