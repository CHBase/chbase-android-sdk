package com.chbase.android.demo.weight.callbacks.databuilders;
import com.chbase.android.simplexml.things.types.base.CodableValue;
import com.chbase.android.simplexml.things.types.base.DisplayValue;
import com.chbase.android.simplexml.things.types.bloodglucose.BloodGlucose;
import com.chbase.android.simplexml.things.types.bloodglucose.BloodGlucoseValue;
import com.chbase.android.simplexml.things.types.dates.DateTime;

import java.util.Calendar;


public class BloodGlucoseBuilder extends HealthDataBuilder<BloodGlucose>  {

    @Override
    public String getTypeId() {
        return BloodGlucose.typeId;
    }

    @Override
    public BloodGlucose buildItem() {
        BloodGlucose item = new BloodGlucose();
        item.setGlucoseMeasurementType(new CodableValue("Whole blood"));
        item.setWhen(DateTime.fromCalendar(Calendar.getInstance()));
        item.setNormalcy(1);
        item.setMeasurementContext(new CodableValue("Before meal"));
        BloodGlucoseValue val = new BloodGlucoseValue();
        val.setMmolPerL(7.444444);
        DisplayValue displayValue= new DisplayValue();
        displayValue.setText("7.444444 mmol/L");
        displayValue.setUnits("mmolPerL");
        val.setDisplay(displayValue);
        item.setValue(val);
        item.setIsControlTest(false);
        item.setOutsideOperatingTemp(true);
        return item;
    }

    @Override
    public String getDisplayString(BloodGlucose thing) {
        return thing.getWhen().toString()+" - "+thing.getValue().getDisplay().getText();
    }

}
