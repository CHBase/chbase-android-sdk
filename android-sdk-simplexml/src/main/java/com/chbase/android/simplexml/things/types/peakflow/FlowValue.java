package com.chbase.android.simplexml.things.types.peakflow;

import com.chbase.android.simplexml.things.types.base.DisplayValue;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;

@Order(elements = { "liters-per-second", "display" })
public class FlowValue {

    @Element(name = "liters-per-second")
    protected double litersPerSecond;
    @Element(required = false)
    protected DisplayValue display;

    /**
     * Gets the value of the litersPerSecond property.
     *
     */
    public double getLitersPerSecond() {
        return litersPerSecond;
    }

    /**
     * Sets the value of the litersPerSecond property.
     *
     */
    public void setLitersPerSecond(double value) {
        this.litersPerSecond = value;
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
