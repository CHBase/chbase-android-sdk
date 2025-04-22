package com.chbase.android.simplexml.things.types.peakflow;

import com.chbase.android.simplexml.things.types.base.DisplayValue;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;

@Order(elements = { "liters", "display" })
public class VolumeValue {

    @Element
    protected double liters;
    @Element(required = false)
    protected DisplayValue display;

    /**
     * Gets the value of the liters property.
     *
     */
    public double getLiters() {
        return liters;
    }

    /**
     * Sets the value of the liters property.
     *
     */
    public void setLiters(double value) {
        this.liters = value;
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
