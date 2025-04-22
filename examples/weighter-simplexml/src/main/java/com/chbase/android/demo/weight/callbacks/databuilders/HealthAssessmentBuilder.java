package com.chbase.android.demo.weight.callbacks.databuilders;
import com.chbase.android.simplexml.things.types.base.CodableValue;
import com.chbase.android.simplexml.things.types.base.CodedValue;
import com.chbase.android.simplexml.things.types.dates.DateTime;
import com.chbase.android.simplexml.things.types.healthassessment.Assessment;
import com.chbase.android.simplexml.things.types.healthassessment.HealthAssessment;
import com.chbase.android.simplexml.things.types.insulininjection.InsulinInjectionValue;
import com.chbase.android.simplexml.things.types.insulininjectionusage.InsulinInjectionUsage;

import java.util.Calendar;


public class HealthAssessmentBuilder extends HealthDataBuilder<HealthAssessment>  {

    @Override
    public String getTypeId() {
        return HealthAssessment.typeId;
    }

    @Override
    public HealthAssessment buildItem() {
        HealthAssessment item = new HealthAssessment();
        item.setWhen(DateTime.fromCalendar(Calendar.getInstance()));
        item.setName("Annual Wellness Checkup");
        item.setCategory(new CodableValue("General Health Assessment"));
        Assessment assessment= new Assessment();
        assessment.setName(new CodableValue("Blood Pressure"));
        assessment.getValue().add(new CodableValue("120/80 mmHg"));
        assessment.setGroup(new CodableValue("Anthropometric Measurements"));
        item.getResult().add(assessment);
        return item;
    }

    @Override
    public String getDisplayString(HealthAssessment thing) {
        return thing.getWhen().toString()+" - "+thing.getName()+", "+thing.getResult().get(0).getName().getText()+" : "+thing.getResult().get(0).getValue().get(0).getText();
    }

}
