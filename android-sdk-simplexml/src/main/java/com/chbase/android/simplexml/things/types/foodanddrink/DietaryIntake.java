package com.chbase.android.simplexml.things.types.foodanddrink;

import com.chbase.android.simplexml.things.thing.AbstractThing;
import com.chbase.android.simplexml.things.types.base.CodableValue;
import com.chbase.android.simplexml.things.types.base.WeightValue;
import com.chbase.android.simplexml.things.types.dates.DateTime;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;

@Order(elements = {"food-item",
        "serving-size",
        "servings-consumed",
        "meal",
        "when",
        "energy",
        "energy-from-fat",
        "total-fat",
        "saturated-fat",
        "trans-fat",
        "monounsaturated-fat",
        "polyunsaturated-fat",
        "protein",
        "carbohydrates",
        "dietary-fiber",
        "sugars",
        "sodium",
        "cholesterol",
        "calcium",
        "iron",
        "magnesium",
        "phosphorus",
        "potassium",
        "zinc",
        "vitamin-A-RAE",
        "vitamin-E",
        "vitamin-D",
        "vitamin-C",
        "thiamin",
        "riboflavin",
        "niacin",
        "vitamin-B-6",
        "folate-DFE",
        "vitamin-B-12",
        "vitamin-K",
        "additional-nutrition-facts"
})
public class DietaryIntake extends AbstractThing {
    public static String typeId = "089646a6-7e25-4495-ad15-3e28d4c1a71d";
    @Element(name = "food-item", required = true)
    protected CodableValue foodItem;
    @Element(name = "serving-size", required = false)
    protected CodableValue servingSize;
    @Element(name = "servings-consumed", required = false)
    protected Double servingsConsumed;
    @Element(required = false)
    protected CodableValue meal;
    @Element(required = false)
    protected DateTime when;
    @Element(required = false)
    protected FoodEnergyValue energy;
    @Element(name = "energy-from-fat", required = false)
    protected FoodEnergyValue energyFromFat;
    @Element(name = "total-fat", required = false)
    protected WeightValue totalFat;
    @Element(name = "saturated-fat", required = false)
    protected WeightValue saturatedFat;
    @Element(name = "trans-fat", required = false)
    protected WeightValue transFat;
    @Element(name = "monounsaturated-fat", required = false)
    protected WeightValue monounsaturatedFat;
    @Element(name = "polyunsaturated-fat", required = false)
    protected WeightValue polyunsaturatedFat;
    @Element(required = false)
    protected WeightValue protein;
    @Element(required = false)
    protected WeightValue carbohydrates;
    @Element(name = "dietary-fiber", required = false)
    protected WeightValue dietaryFiber;
    @Element(required = false)
    protected WeightValue sugars;
    @Element(required = false)
    protected WeightValue sodium;
    @Element(required = false)
    protected WeightValue cholesterol;
    @Element(required = false)
    protected WeightValue calcium;
    @Element(required = false)
    protected WeightValue iron;
    @Element(required = false)
    protected WeightValue magnesium;
    @Element(required = false)
    protected WeightValue phosphorus;
    @Element(required = false)
    protected WeightValue potassium;
    @Element(required = false)
    protected WeightValue zinc;
    @Element(name = "vitamin-A-RAE", required = false)
    protected WeightValue vitaminARAE;
    @Element(name = "vitamin-E", required = false)
    protected WeightValue vitaminE;
    @Element(name = "vitamin-D", required = false)
    protected WeightValue vitaminD;
    @Element(name = "vitamin-C", required = false)
    protected WeightValue vitaminC;
    @Element(required = false)
    protected WeightValue thiamin;
    @Element(required = false)
    protected WeightValue riboflavin;
    @Element(required = false)
    protected WeightValue niacin;
    @Element(name = "vitamin-B-6", required = false)
    protected WeightValue vitaminB6;
    @Element(name = "folate-DFE", required = false)
    protected WeightValue folateDFE;
    @Element(name = "vitamin-B-12", required = false)
    protected WeightValue vitaminB12;
    @Element(name = "vitamin-K", required = false)
    protected WeightValue vitaminK;
    @Element(name = "additional-nutrition-facts", required = false)
    protected AdditionalNutritionFacts additionalNutritionFacts;

    /**
     * Gets the value of the foodItem property.
     *
     * @return possible object is {@link CodableValue }
     */
    public CodableValue getFoodItem() {
        return foodItem;
    }

    /**
     * Sets the value of the foodItem property.
     *
     * @param value allowed object is {@link CodableValue }
     */
    public void setFoodItem(CodableValue value) {
        this.foodItem = value;
    }

    /**
     * Gets the value of the servingSize property.
     *
     * @return possible object is {@link CodableValue }
     */
    public CodableValue getServingSize() {
        return servingSize;
    }

    /**
     * Sets the value of the servingSize property.
     *
     * @param value allowed object is {@link CodableValue }
     */
    public void setServingSize(CodableValue value) {
        this.servingSize = value;
    }

    /**
     * Gets the value of the servingsConsumed property.
     *
     * @return possible object is {@link Double }
     */
    public Double getServingsConsumed() {
        return servingsConsumed;
    }

    /**
     * Sets the value of the servingsConsumed property.
     *
     * @param value allowed object is {@link Double }
     */
    public void setServingsConsumed(Double value) {
        this.servingsConsumed = value;
    }

    /**
     * Gets the value of the meal property.
     *
     * @return possible object is {@link CodableValue }
     */
    public CodableValue getMeal() {
        return meal;
    }

    /**
     * Sets the value of the meal property.
     *
     * @param value allowed object is {@link CodableValue }
     */
    public void setMeal(CodableValue value) {
        this.meal = value;
    }

    /**
     * Gets the value of the when property.
     *
     * @return possible object is {@link DateTime }
     */
    public DateTime getWhen() {
        return when;
    }

    /**
     * Sets the value of the when property.
     *
     * @param value allowed object is {@link DateTime }
     */
    public void setWhen(DateTime value) {
        this.when = value;
    }

    /**
     * Gets the value of the energy property.
     *
     * @return possible object is {@link FoodEnergyValue }
     */
    public FoodEnergyValue getEnergy() {
        return energy;
    }

    /**
     * Sets the value of the energy property.
     *
     * @param value allowed object is {@link FoodEnergyValue }
     */
    public void setEnergy(FoodEnergyValue value) {
        this.energy = value;
    }

    /**
     * Gets the value of the energyFromFat property.
     *
     * @return possible object is {@link FoodEnergyValue }
     */
    public FoodEnergyValue getEnergyFromFat() {
        return energyFromFat;
    }

    /**
     * Sets the value of the energyFromFat property.
     *
     * @param value allowed object is {@link FoodEnergyValue }
     */
    public void setEnergyFromFat(FoodEnergyValue value) {
        this.energyFromFat = value;
    }

    /**
     * Gets the value of the totalFat property.
     *
     * @return possible object is {@link WeightValue }
     */
    public WeightValue getTotalFat() {
        return totalFat;
    }

    /**
     * Sets the value of the totalFat property.
     *
     * @param value allowed object is {@link WeightValue }
     */
    public void setTotalFat(WeightValue value) {
        this.totalFat = value;
    }

    /**
     * Gets the value of the saturatedFat property.
     *
     * @return possible object is {@link WeightValue }
     */
    public WeightValue getSaturatedFat() {
        return saturatedFat;
    }

    /**
     * Sets the value of the saturatedFat property.
     *
     * @param value allowed object is {@link WeightValue }
     */
    public void setSaturatedFat(WeightValue value) {
        this.saturatedFat = value;
    }

    /**
     * Gets the value of the transFat property.
     *
     * @return possible object is {@link WeightValue }
     */
    public WeightValue getTransFat() {
        return transFat;
    }

    /**
     * Sets the value of the transFat property.
     *
     * @param value allowed object is {@link WeightValue }
     */
    public void setTransFat(WeightValue value) {
        this.transFat = value;
    }

    /**
     * Gets the value of the monounsaturatedFat property.
     *
     * @return possible object is {@link WeightValue }
     */
    public WeightValue getMonounsaturatedFat() {
        return monounsaturatedFat;
    }

    /**
     * Sets the value of the monounsaturatedFat property.
     *
     * @param value allowed object is {@link WeightValue }
     */
    public void setMonounsaturatedFat(WeightValue value) {
        this.monounsaturatedFat = value;
    }

    /**
     * Gets the value of the polyunsaturatedFat property.
     *
     * @return possible object is {@link WeightValue }
     */
    public WeightValue getPolyunsaturatedFat() {
        return polyunsaturatedFat;
    }

    /**
     * Sets the value of the polyunsaturatedFat property.
     *
     * @param value allowed object is {@link WeightValue }
     */
    public void setPolyunsaturatedFat(WeightValue value) {
        this.polyunsaturatedFat = value;
    }

    /**
     * Gets the value of the protein property.
     *
     * @return possible object is {@link WeightValue }
     */
    public WeightValue getProtein() {
        return protein;
    }

    /**
     * Sets the value of the protein property.
     *
     * @param value allowed object is {@link WeightValue }
     */
    public void setProtein(WeightValue value) {
        this.protein = value;
    }

    /**
     * Gets the value of the carbohydrates property.
     *
     * @return possible object is {@link WeightValue }
     */
    public WeightValue getCarbohydrates() {
        return carbohydrates;
    }

    /**
     * Sets the value of the carbohydrates property.
     *
     * @param value allowed object is {@link WeightValue }
     */
    public void setCarbohydrates(WeightValue value) {
        this.carbohydrates = value;
    }

    /**
     * Gets the value of the dietaryFiber property.
     *
     * @return possible object is {@link WeightValue }
     */
    public WeightValue getDietaryFiber() {
        return dietaryFiber;
    }

    /**
     * Sets the value of the dietaryFiber property.
     *
     * @param value allowed object is {@link WeightValue }
     */
    public void setDietaryFiber(WeightValue value) {
        this.dietaryFiber = value;
    }

    /**
     * Gets the value of the sugars property.
     *
     * @return possible object is {@link WeightValue }
     */
    public WeightValue getSugars() {
        return sugars;
    }

    /**
     * Sets the value of the sugars property.
     *
     * @param value allowed object is {@link WeightValue }
     */
    public void setSugars(WeightValue value) {
        this.sugars = value;
    }

    /**
     * Gets the value of the sodium property.
     *
     * @return possible object is {@link WeightValue }
     */
    public WeightValue getSodium() {
        return sodium;
    }

    /**
     * Sets the value of the sodium property.
     *
     * @param value allowed object is {@link WeightValue }
     */
    public void setSodium(WeightValue value) {
        this.sodium = value;
    }

    /**
     * Gets the value of the cholesterol property.
     *
     * @return possible object is {@link WeightValue }
     */
    public WeightValue getCholesterol() {
        return cholesterol;
    }

    /**
     * Sets the value of the cholesterol property.
     *
     * @param value allowed object is {@link WeightValue }
     */
    public void setCholesterol(WeightValue value) {
        this.cholesterol = value;
    }

    /**
     * Gets the value of the calcium property.
     *
     * @return possible object is {@link WeightValue }
     */
    public WeightValue getCalcium() {
        return calcium;
    }

    /**
     * Sets the value of the calcium property.
     *
     * @param value allowed object is {@link WeightValue }
     */
    public void setCalcium(WeightValue value) {
        this.calcium = value;
    }

    /**
     * Gets the value of the iron property.
     *
     * @return possible object is {@link WeightValue }
     */
    public WeightValue getIron() {
        return iron;
    }

    /**
     * Sets the value of the iron property.
     *
     * @param value allowed object is {@link WeightValue }
     */
    public void setIron(WeightValue value) {
        this.iron = value;
    }

    /**
     * Gets the value of the magnesium property.
     *
     * @return possible object is {@link WeightValue }
     */
    public WeightValue getMagnesium() {
        return magnesium;
    }

    /**
     * Sets the value of the magnesium property.
     *
     * @param value allowed object is {@link WeightValue }
     */
    public void setMagnesium(WeightValue value) {
        this.magnesium = value;
    }

    /**
     * Gets the value of the phosphorus property.
     *
     * @return possible object is {@link WeightValue }
     */
    public WeightValue getPhosphorus() {
        return phosphorus;
    }

    /**
     * Sets the value of the phosphorus property.
     *
     * @param value allowed object is {@link WeightValue }
     */
    public void setPhosphorus(WeightValue value) {
        this.phosphorus = value;
    }

    /**
     * Gets the value of the potassium property.
     *
     * @return possible object is {@link WeightValue }
     */
    public WeightValue getPotassium() {
        return potassium;
    }

    /**
     * Sets the value of the potassium property.
     *
     * @param value allowed object is {@link WeightValue }
     */
    public void setPotassium(WeightValue value) {
        this.potassium = value;
    }

    /**
     * Gets the value of the zinc property.
     *
     * @return possible object is {@link WeightValue }
     */
    public WeightValue getZinc() {
        return zinc;
    }

    /**
     * Sets the value of the zinc property.
     *
     * @param value allowed object is {@link WeightValue }
     */
    public void setZinc(WeightValue value) {
        this.zinc = value;
    }

    /**
     * Gets the value of the vitaminARAE property.
     *
     * @return possible object is {@link WeightValue }
     */
    public WeightValue getVitaminARAE() {
        return vitaminARAE;
    }

    /**
     * Sets the value of the vitaminARAE property.
     *
     * @param value allowed object is {@link WeightValue }
     */
    public void setVitaminARAE(WeightValue value) {
        this.vitaminARAE = value;
    }

    /**
     * Gets the value of the vitaminE property.
     *
     * @return possible object is {@link WeightValue }
     */
    public WeightValue getVitaminE() {
        return vitaminE;
    }

    /**
     * Sets the value of the vitaminE property.
     *
     * @param value allowed object is {@link WeightValue }
     */
    public void setVitaminE(WeightValue value) {
        this.vitaminE = value;
    }

    /**
     * Gets the value of the vitaminD property.
     *
     * @return possible object is {@link WeightValue }
     */
    public WeightValue getVitaminD() {
        return vitaminD;
    }

    /**
     * Sets the value of the vitaminD property.
     *
     * @param value allowed object is {@link WeightValue }
     */
    public void setVitaminD(WeightValue value) {
        this.vitaminD = value;
    }

    /**
     * Gets the value of the vitaminC property.
     *
     * @return possible object is {@link WeightValue }
     */
    public WeightValue getVitaminC() {
        return vitaminC;
    }

    /**
     * Sets the value of the vitaminC property.
     *
     * @param value allowed object is {@link WeightValue }
     */
    public void setVitaminC(WeightValue value) {
        this.vitaminC = value;
    }

    /**
     * Gets the value of the thiamin property.
     *
     * @return possible object is {@link WeightValue }
     */
    public WeightValue getThiamin() {
        return thiamin;
    }

    /**
     * Sets the value of the thiamin property.
     *
     * @param value allowed object is {@link WeightValue }
     */
    public void setThiamin(WeightValue value) {
        this.thiamin = value;
    }

    /**
     * Gets the value of the riboflavin property.
     *
     * @return possible object is {@link WeightValue }
     */
    public WeightValue getRiboflavin() {
        return riboflavin;
    }

    /**
     * Sets the value of the riboflavin property.
     *
     * @param value allowed object is {@link WeightValue }
     */
    public void setRiboflavin(WeightValue value) {
        this.riboflavin = value;
    }

    /**
     * Gets the value of the niacin property.
     *
     * @return possible object is {@link WeightValue }
     */
    public WeightValue getNiacin() {
        return niacin;
    }

    /**
     * Sets the value of the niacin property.
     *
     * @param value allowed object is {@link WeightValue }
     */
    public void setNiacin(WeightValue value) {
        this.niacin = value;
    }

    /**
     * Gets the value of the vitaminB6 property.
     *
     * @return possible object is {@link WeightValue }
     */
    public WeightValue getVitaminB6() {
        return vitaminB6;
    }

    /**
     * Sets the value of the vitaminB6 property.
     *
     * @param value allowed object is {@link WeightValue }
     */
    public void setVitaminB6(WeightValue value) {
        this.vitaminB6 = value;
    }

    /**
     * Gets the value of the folateDFE property.
     *
     * @return possible object is {@link WeightValue }
     */
    public WeightValue getFolateDFE() {
        return folateDFE;
    }

    /**
     * Sets the value of the folateDFE property.
     *
     * @param value allowed object is {@link WeightValue }
     */
    public void setFolateDFE(WeightValue value) {
        this.folateDFE = value;
    }

    /**
     * Gets the value of the vitaminB12 property.
     *
     * @return possible object is {@link WeightValue }
     */
    public WeightValue getVitaminB12() {
        return vitaminB12;
    }

    /**
     * Sets the value of the vitaminB12 property.
     *
     * @param value allowed object is {@link WeightValue }
     */
    public void setVitaminB12(WeightValue value) {
        this.vitaminB12 = value;
    }

    /**
     * Gets the value of the vitaminK property.
     *
     * @return possible object is {@link WeightValue }
     */
    public WeightValue getVitaminK() {
        return vitaminK;
    }

    /**
     * Sets the value of the vitaminK property.
     *
     * @param value allowed object is {@link WeightValue }
     */
    public void setVitaminK(WeightValue value) {
        this.vitaminK = value;
    }

    /**
     * Gets the value of the additionalNutritionFacts property.
     *
     * @return possible object is {@link AdditionalNutritionFacts }
     */
    public AdditionalNutritionFacts getAdditionalNutritionFacts() {
        return additionalNutritionFacts;
    }

    /**
     * Sets the value of the additionalNutritionFacts property.
     *
     * @param value allowed object is {@link AdditionalNutritionFacts }
     */
    public void setAdditionalNutritionFacts(AdditionalNutritionFacts value) {
        this.additionalNutritionFacts = value;
    }

    @Override
    public String getThingType() {
        return typeId;
    }
}
