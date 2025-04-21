package com.chbase.android.demo.weight.callbacks.databuilders;
import com.chbase.android.simplexml.things.types.base.CodableValue;
import com.chbase.android.simplexml.things.types.bloodoxygensaturation.BloodOxygenSaturation;
import com.chbase.android.simplexml.things.types.dates.DateTime;
import com.chbase.android.simplexml.things.types.insulininjection.InsulinInjectionValue;
import com.chbase.android.simplexml.things.types.insulininjectionusage.InsulinInjectionUsage;

import java.util.Calendar;


public class InsulinInjectionUsageBuilder extends HealthDataBuilder<InsulinInjectionUsage>  {

    @Override
    public String getTypeId() {
        return InsulinInjectionUsage.typeId;
    }

    @Override
    public InsulinInjectionUsage buildItem() {
        InsulinInjectionUsage item = new InsulinInjectionUsage();
        item.setWhen(DateTime.fromCalendar(Calendar.getInstance()));
        item.setType(new CodableValue("Analoga"));
        InsulinInjectionValue value = new InsulinInjectionValue();
        value.setIE(0.2);
        item.setAmount( value);
        item.setDeviceId("184166be-8adb-4d9c-8162-c403040e31ad");
        return item;
    }

    @Override
    public String getDisplayString(InsulinInjectionUsage thing) {
        return thing.getWhen().toString()+" - "+thing.getAmount().getIE()+"IE - "+thing.getType().getText();
    }

}
