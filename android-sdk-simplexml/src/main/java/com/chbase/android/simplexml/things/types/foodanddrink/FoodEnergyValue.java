package com.chbase.android.simplexml.things.types.foodanddrink;

import com.chbase.android.simplexml.things.types.base.DisplayValue;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;

@Order(elements = { "calories", "display" })
public class FoodEnergyValue {
    @Element(required = false)
    protected double calories;
    @Element(required = false)
    protected DisplayValue display;

    /**
     * Gets the value of the calories property.
     *
     */
    public double getCalories() {
        return calories;
    }

    /**
     * Sets the value of the calories property.
     *
     */
    public void setCalories(double value) {
        this.calories = value;
    }

    /**
     * Gets the value of the display property.
     *
     * @return possible object is {@link DisplayValue }
     *
     */
    public DisplayValue getDisplay() {
        return display;
    }

    /**
     * Sets the value of the display property.
     *
     * @param value
     *            allowed object is {@link DisplayValue }
     *
     */
    public void setDisplay(DisplayValue value) {
        this.display = value;
    }

}
