package com.chbase.android.simplexml.things.types.bloodglucose;

import com.chbase.android.simplexml.things.types.base.DisplayValue;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;

@Order(elements = { "mmolPerL", "display" })
public class BloodGlucoseValue {
    @Element
    protected double mmolPerL;
    @Element(required = false)
    protected DisplayValue display;

    /**
     * Gets the value of the mmolPerL property.
     *
     */
    public double getMmolPerL() {
        return mmolPerL;
    }

    /**
     * Sets the value of the mmolPerL property.
     *
     */
    public void setMmolPerL(double value) {
        this.mmolPerL = value;
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
