package com.chbase.android.demo.weight.callbacks.databuilders;
import com.chbase.android.simplexml.things.types.base.CodableValue;
import com.chbase.android.simplexml.things.types.dates.DateTime;
import com.chbase.android.simplexml.things.types.vitalsigns.VitalSignResultType;
import com.chbase.android.simplexml.things.types.vitalsigns.VitalSigns;

import java.util.Calendar;


public class VitalsBuilder extends HealthDataBuilder<VitalSigns>  {

    @Override
    public String getTypeId() {
        return VitalSigns.typeId;
    }

    @Override
    public VitalSigns buildItem() {
        VitalSigns item = new VitalSigns();

        item.setWhen(DateTime.fromCalendar(Calendar.getInstance()));
        item.setSite("oral");
        item.setPosition("sitting");

        VitalSignResultType result = new VitalSignResultType();
        result.setTitle(new CodableValue("Temperature"));
        result.setValue(37.1);
        result.setUnit(new CodableValue("Celcius"));
        result.setReferenceMinimum(36.1);
        result.setReferenceMaximum(37.8);
        result.setTextValue("Normal body temperature");

        item.getVitalSignsResults().add(result);
        item.getVitalSignsResults().add(result);
        return item;
    }

    @Override
    public String getDisplayString(VitalSigns item) {
        VitalSignResultType result = item.getVitalSignsResults().get(0);
        String resultString = result.getTitle().getText()+" "+result.getValue()+" "+result.getUnit().getText();
        return item.getWhen().toString()+" - "+resultString;
    }
}
