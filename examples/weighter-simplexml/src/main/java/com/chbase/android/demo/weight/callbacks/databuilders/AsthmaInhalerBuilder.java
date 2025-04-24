package com.chbase.android.demo.weight.callbacks.databuilders;
import com.chbase.android.simplexml.things.types.asthmainhaler.Alert;
import com.chbase.android.simplexml.things.types.asthmainhaler.AsthmaInhaler;
import com.chbase.android.simplexml.things.types.base.CodableValue;
import com.chbase.android.simplexml.things.types.dates.ApproxDate;
import com.chbase.android.simplexml.things.types.dates.ApproxDateTime;
import com.chbase.android.simplexml.things.types.dates.DateTime;
import com.chbase.android.simplexml.things.types.dates.StructuredApproxDate;
import com.chbase.android.simplexml.things.types.dates.Time;

import java.util.Calendar;


public class AsthmaInhalerBuilder extends HealthDataBuilder<AsthmaInhaler>  {

    @Override
    public String getTypeId() {
        return AsthmaInhaler.typeId;
    }

    @Override
    public AsthmaInhaler buildItem() {
        AsthmaInhaler item = new AsthmaInhaler();

        item.setDrug(new CodableValue("ventolin"));
        item.setStrength(new CodableValue("Micrograms (mcg)"));
        item.setPurpose("Combination");

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

        item.setStartDate(approxDt);
        item.setStopDate(approxDt);
        item.setExpirationDate(approxDt);

        item.setDeviceId("1234");
        item.setInitialDoses(3);
        item.setMinDailyDoses(3);
        item.setMaxDailyDoses(5);
        item.setCanAlert(true);

        Alert alert= new Alert();
        alert.getDow().add(1);
        alert.getDow().add(2);
        alert.getDow().add(7);
        alert.getTime().add(dt.getTime());
        alert.getTime().add(dt.getTime());
        alert.getTime().add(dt.getTime());

        item.getAlert().add(alert);

        return item;
    }

    @Override
    public String getDisplayString(AsthmaInhaler item) {
        String dt = item.getStartDate().getStructured().getDate().getY()
                +"-"+item.getStartDate().getStructured().getDate().getM()
                +"-"+item.getStartDate().getStructured().getDate().getD()
                +"T"+item.getStartDate().getStructured().getTime().getH()
                +":"+item.getStartDate().getStructured().getTime().getM()
                +":"+item.getStartDate().getStructured().getTime().getS();
        return item.getDrug().getText()+" datestarted: "+dt;
    }
}
