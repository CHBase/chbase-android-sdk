package com.chbase.android.demo.weight.callbacks.databuilders;
import com.chbase.android.simplexml.things.types.base.CodableValue;
import com.chbase.android.simplexml.things.types.base.DisplayValue;
import com.chbase.android.simplexml.things.types.base.GeneralMeasurement;
import com.chbase.android.simplexml.things.types.base.WeightValue;
import com.chbase.android.simplexml.things.types.dates.DateTime;
import com.chbase.android.simplexml.things.types.foodanddrink.AdditionalNutritionFacts;
import com.chbase.android.simplexml.things.types.foodanddrink.DietaryIntake;
import com.chbase.android.simplexml.things.types.foodanddrink.FoodEnergyValue;
import com.chbase.android.simplexml.things.types.foodanddrink.NutritionFact;

import java.util.Calendar;


public class FoodAndDrinkBuilder extends HealthDataBuilder<DietaryIntake>  {

    @Override
    public String getTypeId() {
        return DietaryIntake.typeId;
    }

    @Override
    public DietaryIntake buildItem() {
        DietaryIntake item = new DietaryIntake();

        WeightValue val = new WeightValue();
        val.setKg(0.05);
        DisplayValue dv = new DisplayValue();
        dv.setText("50g");
        dv.setUnits("g");
        dv.setValue(50);
        val.setDisplay(dv);

        FoodEnergyValue fev = new FoodEnergyValue();
        fev.setCalories(500.0);
        DisplayValue displayValue = new DisplayValue();
        displayValue.setText("500 kcal");
        displayValue.setUnits("kcal");
        fev.setDisplay(displayValue);


        item.setFoodItem(new CodableValue("Rice"));
        item.setServingSize(new CodableValue("1 Bowl"));
        item.setServingsConsumed(1.5);
        item.setMeal(new CodableValue("lunch"));
        item.setWhen(DateTime.fromCalendar(Calendar.getInstance()));
        item.setEnergy(fev);
        item.setEnergyFromFat(fev);
        item.setTotalFat(val);
        item.setSaturatedFat(val);
        item.setTransFat(val);
        item.setMonounsaturatedFat(val);
        item.setPolyunsaturatedFat(val);
        item.setProtein(val);
        item.setCarbohydrates(val);
        item.setDietaryFiber(val);
        item.setSugars(val);
        item.setSodium(val);
        item.setCholesterol(val);
        item.setCalcium(val);
        item.setIron(val);
        item.setMagnesium(val);
        item.setPhosphorus(val);
        item.setPotassium(val);
        item.setZinc(val);
        item.setVitaminARAE(val);
        item.setVitaminE(val);
        item.setVitaminD(val);
        item.setVitaminC(val);
        item.setThiamin(val);
        item.setRiboflavin(val);
        item.setNiacin(val);
        item.setVitaminB6(val);
        item.setFolateDFE(val);
        item.setVitaminB12(val);
        item.setVitaminK(val);

        AdditionalNutritionFacts anf = new AdditionalNutritionFacts();
        NutritionFact fact = new NutritionFact();
        fact.setName(new CodableValue("Spice"));
        GeneralMeasurement measurement = new GeneralMeasurement();
        measurement.setDisplay("23000 SHU");
        fact.setFact(measurement);
        anf.getNutritionFact().add(fact);
        item.setAdditionalNutritionFacts(anf);


        return item;
    }

    @Override
    public String getDisplayString(DietaryIntake item) {
        return item.getFoodItem().getText()+", "+item.getServingSize().getText()+", Servings, "+item.getMeal().getText()+", "+item.getWhen().toString();
    }
}
