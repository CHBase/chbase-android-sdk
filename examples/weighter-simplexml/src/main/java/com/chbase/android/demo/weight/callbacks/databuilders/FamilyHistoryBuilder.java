package com.chbase.android.demo.weight.callbacks.databuilders;
import com.chbase.android.simplexml.things.types.base.CodableValue;
import com.chbase.android.simplexml.things.types.base.CodedValue;
import com.chbase.android.simplexml.things.types.base.Name;
import com.chbase.android.simplexml.things.types.base.Person;
import com.chbase.android.simplexml.things.types.base.StructuredMeasurement;
import com.chbase.android.simplexml.things.types.dates.ApproxDate;
import com.chbase.android.simplexml.things.types.dates.ApproxDateTime;
import com.chbase.android.simplexml.things.types.dates.DateTime;
import com.chbase.android.simplexml.things.types.dates.StructuredApproxDate;
import com.chbase.android.simplexml.things.types.dates.Time;
import com.chbase.android.simplexml.things.types.familyhistory.Condition;
import com.chbase.android.simplexml.things.types.familyhistory.FamilyHistory;
import com.chbase.android.simplexml.things.types.familyhistory.FamilyHistoryRelative;

import java.util.Calendar;


public class FamilyHistoryBuilder extends HealthDataBuilder<FamilyHistory>  {

    @Override
    public String getTypeId() {
        return FamilyHistory.typeId;
    }

    @Override
    public FamilyHistory buildItem() {
        FamilyHistory item = new FamilyHistory();

        Condition condition = new Condition();
        condition.setName(new CodableValue("COVID 19"));

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
        condition.setOnsetDate(approxDt.getStructured().getDate());
        condition.setResolutionDate(approxDt.getStructured().getDate());
        condition.setResolution("Cured");
        condition.setOccurrence(new CodableValue("Once in a while, acute"));
        condition.setSeverity(new CodableValue("Severe"));
        item.getCondition().add(condition);

        FamilyHistoryRelative relative =  new FamilyHistoryRelative();
        relative.setRelationship(new CodableValue("Uncle"));
        Person person = new Person();
        Name name = new Name();
        name.setFull("Jhon Doe");
        person.setName(name);
        relative.setRelativeName(person);
        relative.setDateOfBirth(approxDt.getStructured().getDate());
        relative.setDateOfDeath(approxDt.getStructured().getDate());
        relative.setRegionOfOrigin(new CodableValue("USA"));
        item.setRelative(relative);

        return item;
    }

    @Override
    public String getDisplayString(FamilyHistory item) {
        return  item.getRelative().getRelativeName().getName().getFull() + " "+ item.getCondition().get(0).getName().getText();
    }
}
