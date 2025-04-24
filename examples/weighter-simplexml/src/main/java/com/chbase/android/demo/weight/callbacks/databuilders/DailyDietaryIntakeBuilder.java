package com.chbase.android.demo.weight.callbacks.databuilders;
import com.chbase.android.simplexml.things.types.base.DisplayValue;
import com.chbase.android.simplexml.things.types.base.WeightValue;
import com.chbase.android.simplexml.things.types.dailydietaryintake.DailyDietaryIntake;
import com.chbase.android.simplexml.things.types.dates.DateTime;

import java.util.Calendar;


public class DailyDietaryIntakeBuilder extends HealthDataBuilder<DailyDietaryIntake>  {

    @Override
    public String getTypeId() {
        return DailyDietaryIntake.typeId;
    }

    @Override
    public DailyDietaryIntake buildItem() {
        DailyDietaryIntake item = new DailyDietaryIntake();

        item.setWhen(DateTime.fromCalendar(Calendar.getInstance()).getDate());
        item.setCalories(100);

        WeightValue val = new WeightValue();
        val.setKg(0.05);
        DisplayValue dv = new DisplayValue();
        dv.setText("50g");
        dv.setUnits("g");
        dv.setValue(50);
        val.setDisplay(dv);

        item.setTotalFat(val);
        item.setSaturatedFat(val);
        item.setTransFat(val);
        item.setProtein(val);
        item.setTotalCarbohydrates(val);
        item.setDietaryFiber(val);
        item.setSugars(val);
        item.setSodium(val);
        item.setCholesterol(val);

        return item;
    }

    @Override
    public String getDisplayString(DailyDietaryIntake item) {
        return item.getWhen().getY()+"-"+item.getWhen().getM()+"-"+item.getWhen().getD()+ " - "+item.getCalories()+", total fat: "+item.getTotalFat().getDisplay().getText();
    }
}
