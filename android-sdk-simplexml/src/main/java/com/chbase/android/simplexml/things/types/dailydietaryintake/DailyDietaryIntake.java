package com.chbase.android.simplexml.things.types.dailydietaryintake;

import com.chbase.android.simplexml.things.thing.AbstractThing;
import com.chbase.android.simplexml.things.types.base.WeightValue;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

import com.chbase.android.simplexml.things.types.dates.Date;

@Order(elements = { "when", "calories", "total-fat", "saturated-fat", "trans-fat", "protein",
        "total-carbohydrates", "dietary-fiber", "sugars", "sodium", "cholesterol" })
@Root(name = "dietary-intake-daily")
public class DailyDietaryIntake extends AbstractThing {
    public static String typeId = "9c29c6b9-f40e-44ff-b24e-fba6f3074638";

    @Element(required = true)
    protected Date when;
    @Element(required = false)
    protected Integer calories;
    @Element(name = "total-fat",required = false)
    protected WeightValue totalFat;
    @Element(name = "saturated-fat",required = false)
    protected WeightValue saturatedFat;
    @Element(name = "trans-fat",required = false)
    protected WeightValue transFat;
    @Element(required = false)
    protected WeightValue protein;
    @Element(name = "total-carbohydrates",required = false)
    protected WeightValue totalCarbohydrates;
    @Element(name = "dietary-fiber",required = false)
    protected WeightValue dietaryFiber;
    @Element(required = false)
    protected WeightValue sugars;
    @Element(required = false)
    protected WeightValue sodium;
    @Element(required = false)
    protected WeightValue cholesterol;

    /**
     * Gets the value of the when property.
     *
     * @return possible object is {@link Date }
     *
     */
    public Date getWhen() {
        return when;
    }

    /**
     * Sets the value of the when property.
     *
     * @param value
     *            allowed object is {@link Date }
     *
     */
    public void setWhen(Date value) {
        this.when = value;
    }

    /**
     * Gets the value of the calories property.
     *
     * @return possible object is {@link Integer }
     *
     */
    public Integer getCalories() {
        return calories;
    }

    /**
     * Sets the value of the calories property.
     *
     * @param value
     *            allowed object is {@link Integer }
     *
     */
    public void setCalories(Integer value) {
        this.calories = value;
    }

    /**
     * Gets the value of the totalFat property.
     *
     * @return possible object is {@link WeightValue }
     *
     */
    public WeightValue getTotalFat() {
        return totalFat;
    }

    /**
     * Sets the value of the totalFat property.
     *
     * @param value
     *            allowed object is {@link WeightValue }
     *
     */
    public void setTotalFat(WeightValue value) {
        this.totalFat = value;
    }

    /**
     * Gets the value of the saturatedFat property.
     *
     * @return possible object is {@link WeightValue }
     *
     */
    public WeightValue getSaturatedFat() {
        return saturatedFat;
    }

    /**
     * Sets the value of the saturatedFat property.
     *
     * @param value
     *            allowed object is {@link WeightValue }
     *
     */
    public void setSaturatedFat(WeightValue value) {
        this.saturatedFat = value;
    }

    /**
     * Gets the value of the transFat property.
     *
     * @return possible object is {@link WeightValue }
     *
     */
    public WeightValue getTransFat() {
        return transFat;
    }

    /**
     * Sets the value of the transFat property.
     *
     * @param value
     *            allowed object is {@link WeightValue }
     *
     */
    public void setTransFat(WeightValue value) {
        this.transFat = value;
    }

    /**
     * Gets the value of the protein property.
     *
     * @return possible object is {@link WeightValue }
     *
     */
    public WeightValue getProtein() {
        return protein;
    }

    /**
     * Sets the value of the protein property.
     *
     * @param value
     *            allowed object is {@link WeightValue }
     *
     */
    public void setProtein(WeightValue value) {
        this.protein = value;
    }

    /**
     * Gets the value of the totalCarbohydrates property.
     *
     * @return possible object is {@link WeightValue }
     *
     */
    public WeightValue getTotalCarbohydrates() {
        return totalCarbohydrates;
    }

    /**
     * Sets the value of the totalCarbohydrates property.
     *
     * @param value
     *            allowed object is {@link WeightValue }
     *
     */
    public void setTotalCarbohydrates(WeightValue value) {
        this.totalCarbohydrates = value;
    }

    /**
     * Gets the value of the dietaryFiber property.
     *
     * @return possible object is {@link WeightValue }
     *
     */
    public WeightValue getDietaryFiber() {
        return dietaryFiber;
    }

    /**
     * Sets the value of the dietaryFiber property.
     *
     * @param value
     *            allowed object is {@link WeightValue }
     *
     */
    public void setDietaryFiber(WeightValue value) {
        this.dietaryFiber = value;
    }

    /**
     * Gets the value of the sugars property.
     *
     * @return possible object is {@link WeightValue }
     *
     */
    public WeightValue getSugars() {
        return sugars;
    }

    /**
     * Sets the value of the sugars property.
     *
     * @param value
     *            allowed object is {@link WeightValue }
     *
     */
    public void setSugars(WeightValue value) {
        this.sugars = value;
    }

    /**
     * Gets the value of the sodium property.
     *
     * @return possible object is {@link WeightValue }
     *
     */
    public WeightValue getSodium() {
        return sodium;
    }

    /**
     * Sets the value of the sodium property.
     *
     * @param value
     *            allowed object is {@link WeightValue }
     *
     */
    public void setSodium(WeightValue value) {
        this.sodium = value;
    }

    /**
     * Gets the value of the cholesterol property.
     *
     * @return possible object is {@link WeightValue }
     *
     */
    public WeightValue getCholesterol() {
        return cholesterol;
    }

    /**
     * Sets the value of the cholesterol property.
     *
     * @param value
     *            allowed object is {@link WeightValue }
     *
     */
    public void setCholesterol(WeightValue value) {
        this.cholesterol = value;
    }

    @Override
    public String getThingType() {
        return typeId;
    }
}
