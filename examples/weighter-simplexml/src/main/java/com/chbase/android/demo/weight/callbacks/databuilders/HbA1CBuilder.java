package com.chbase.android.demo.weight.callbacks.databuilders;
import com.chbase.android.simplexml.things.types.base.CodableValue;
import com.chbase.android.simplexml.things.types.base.DisplayValue;
import com.chbase.android.simplexml.things.types.dates.DateTime;
import com.chbase.android.simplexml.things.types.hba1c.HbA1C;
import com.chbase.android.simplexml.things.types.hba1c.HbA1CValue;

import java.util.Calendar;


public class HbA1CBuilder extends HealthDataBuilder<HbA1C>  {

    @Override
    public String getTypeId() {
        return HbA1C.typeId;
    }

    @Override
    public HbA1C buildItem() {
        HbA1C item = new HbA1C();
        item.setHbA1CAssayMethod(new CodableValue("National Glycohemoglobin Standardization Program"));
        item.setWhen(DateTime.fromCalendar(Calendar.getInstance()));
        item.setDeviceId("12345");

        HbA1CValue val = new HbA1CValue();
        val.setMmolPerMol(7.444444);
        DisplayValue displayValue= new DisplayValue();
        displayValue.setText("7.444444 mmol/L");
        displayValue.setUnits("mmolPerL");
        val.setDisplay(displayValue);
        item.setValue(val);
        return item;
    }

    @Override
    public String getDisplayString(HbA1C thing) {
        return thing.getWhen().toString()+" - "+thing.getValue().getDisplay().getText();
    }

}
