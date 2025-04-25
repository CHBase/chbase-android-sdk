package com.chbase.android.demo.weight.callbacks.databuilders;
import com.chbase.android.simplexml.things.types.base.CodableValue;
import com.chbase.android.simplexml.things.types.base.CodedValue;
import com.chbase.android.simplexml.things.types.base.StructuredMeasurement;
import com.chbase.android.simplexml.things.types.dates.ApproxDate;
import com.chbase.android.simplexml.things.types.dates.ApproxDateTime;
import com.chbase.android.simplexml.things.types.dates.DateTime;
import com.chbase.android.simplexml.things.types.dates.StructuredApproxDate;
import com.chbase.android.simplexml.things.types.dates.Time;
import com.chbase.android.simplexml.things.types.exercise.Exercise;
import com.chbase.android.simplexml.things.types.exercise.ExerciseSegment;
import com.chbase.android.simplexml.things.types.exercise.StructuredNameValue;
import com.chbase.android.simplexml.things.types.height.HeightValue;

import java.util.Calendar;


public class ExerciseBuilder extends HealthDataBuilder<Exercise>  {

    @Override
    public String getTypeId() {
        return Exercise.typeId;
    }

    @Override
    public Exercise buildItem() {
        Exercise item = new Exercise();

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
        item.setWhen(approxDt);

        item.setActivity(new CodableValue("Swimming"));
        item.setTitle("Swimming");
        HeightValue value = new HeightValue();
        value.setM(500);
        item.setDistance(value);
        item.setDuration(40.0);
        StructuredNameValue nameValue = new StructuredNameValue();
        nameValue.setName(new CodedValue("swimming", "wc","exercise-activities","1"));
        nameValue.setValue(new StructuredMeasurement(500, new CodableValue("kcal")));
        item.getDetail().add(nameValue);
        item.getDetail().add(nameValue);
        ExerciseSegment segment = new ExerciseSegment();
        segment.setActivity(new CodableValue("swimming"));
        segment.setDistance(value);
        segment.setDuration(40.0);
        segment.setTitle("Swimming");
        segment.setOffset(10.0);
        segment.getDetail().add(nameValue);
        segment.getDetail().add(nameValue);
        item.getSegment().add(segment);

        return item;
    }

    @Override
    public String getDisplayString(Exercise item) {
        String dt = item.getWhen().getStructured().getDate().getY()
                +"-"+item.getWhen().getStructured().getDate().getM()
                +"-"+item.getWhen().getStructured().getDate().getD()
                +"T"+item.getWhen().getStructured().getTime().getH()
                +":"+item.getWhen().getStructured().getTime().getM()
                +":"+item.getWhen().getStructured().getTime().getS();
        return dt+" - "+item.getActivity().getText()+" - "+item.getDistance().getM()+"m - "+item.getDuration();
    }
}
