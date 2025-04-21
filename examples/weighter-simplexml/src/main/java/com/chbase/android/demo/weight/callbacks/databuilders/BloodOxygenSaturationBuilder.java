package com.chbase.android.demo.weight.callbacks.databuilders;
import com.chbase.android.simplexml.things.types.base.CodableValue;
import com.chbase.android.simplexml.things.types.base.DisplayValue;
import com.chbase.android.simplexml.things.types.bloodglucose.BloodGlucose;
import com.chbase.android.simplexml.things.types.bloodglucose.BloodGlucoseValue;
import com.chbase.android.simplexml.things.types.bloodoxygensaturation.BloodOxygenSaturation;
import com.chbase.android.simplexml.things.types.dates.DateTime;

import java.util.Calendar;


public class BloodOxygenSaturationBuilder extends HealthDataBuilder<BloodOxygenSaturation>  {

    @Override
    public String getTypeId() {
        return BloodOxygenSaturation.typeId;
    }

    @Override
    public BloodOxygenSaturation buildItem() {
        BloodOxygenSaturation item = new BloodOxygenSaturation();
        item.setWhen(DateTime.fromCalendar(Calendar.getInstance()));
        item.setValue(.991);
        item.setMeasurementMethod(new CodableValue("Pulse Oximetry"));
        item.setMeasurementFlags(new CodableValue("Pulse Oximetry"));
        return item;
    }

    @Override
    public String getDisplayString(BloodOxygenSaturation thing) {
        return thing.getWhen().toString()+" - "+thing.getValue()*100+"% - "+thing.getMeasurementMethod().getText();
    }

}
