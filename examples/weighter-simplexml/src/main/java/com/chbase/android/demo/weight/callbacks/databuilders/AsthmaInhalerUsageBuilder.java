package com.chbase.android.demo.weight.callbacks.databuilders;
import com.chbase.android.simplexml.things.types.asthmainhalerusage.AsthmaInhalerUsage;
import com.chbase.android.simplexml.things.types.base.CodableValue;
import com.chbase.android.simplexml.things.types.dates.DateTime;

import java.util.Calendar;


public class AsthmaInhalerUsageBuilder extends HealthDataBuilder<AsthmaInhalerUsage>  {

    @Override
    public String getTypeId() {
        return AsthmaInhalerUsage.typeId;
    }

    @Override
    public AsthmaInhalerUsage buildItem() {
        AsthmaInhalerUsage item = new AsthmaInhalerUsage();

        item.setDrug(new CodableValue("ventolin"));
        item.setStrength(new CodableValue("Micrograms (mcg)"));
        item.setStrength(new CodableValue("44 mcg / puff"));

        DateTime dt = DateTime.fromCalendar(Calendar.getInstance());
        item.setWhen(dt);

        item.setDoseCount(3);
        item.setDeviceId("1234");
        item.setDosePurpose(new CodableValue("prevention"));

        return item;
    }

    @Override
    public String getDisplayString(AsthmaInhalerUsage item) {
        return item.getDrug().getText()+ ", strength:"+item.getStrength().getText()+" when: "+item.getWhen();
    }
}
