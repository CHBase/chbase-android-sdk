package com.chbase.android.demo.weight.callbacks.databuilders;
import com.chbase.android.simplexml.things.types.appspecific.AppSpecific;
import com.chbase.android.simplexml.things.types.dates.DateTime;


import java.util.Calendar;


public class AppSpecificBuilder extends HealthDataBuilder<AppSpecific>  {

    @Override
    public String getTypeId() {
        return AppSpecific.typeId;
    }

    @Override
    public AppSpecific buildItem() {
        AppSpecific item = new AppSpecific();

        item.setFormatAppid("MyAppName");
        item.setFormatTag("MyAppName tag");

        item.setSummary("Some random xmls");

        DateTime dt = DateTime.fromCalendar(Calendar.getInstance());
        item.setWhen(dt);

        item.getAny().add("<custom-tag-1 />");
        item.getAny().add("<custom-tag-2 />");
        item.getAny().add("<custom-tag-3>Hello</custom-tag-3>");
        item.getAny().add("<custom-tag-3><nested>Hello</nested></custom-tag-3>");
        return item;
    }

    @Override
    public String getDisplayString(AppSpecific item) {
        return item.getSummary()+ " "+item.getWhen()+" "+item.getAny().get(0);
    }
}
