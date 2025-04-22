package com.chbase.android.simplexml.things.types.hba1c;

import com.chbase.android.simplexml.things.types.base.DisplayValue;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;


@Order(elements = {
        "mmol-per-mol",
        "display"
})
public class HbA1CValue {

    @Element(name = "mmol-per-mol")
    protected double mmolPerMol;
    @Element(name = "display", required = false)
    protected DisplayValue display;

    /**
     * Gets the value of the mmolPerMol property.
     *
     */
    public double getMmolPerMol() {
        return mmolPerMol;
    }

    /**
     * Sets the value of the mmolPerMol property.
     *
     */
    public void setMmolPerMol(double value) {
        this.mmolPerMol = value;
    }

    /**
     * Gets the value of the display property.
     *
     * @return
     *     possible object is
     *     {@link DisplayValue }
     *
     */
    public DisplayValue getDisplay() {
        return display;
    }

    /**
     * Sets the value of the display property.
     *
     * @param value
     *     allowed object is
     *     {@link DisplayValue }
     *
     */
    public void setDisplay(DisplayValue value) {
        this.display = value;
    }

}
