package com.chbase.android.simplexml.things.types.vitalsigns;

import com.chbase.android.simplexml.things.types.base.CodableValue;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;

@Order(elements = { "title", "value", "unit", "reference-minimum",
        "reference-maximum", "text-value", "flag" })
public class VitalSignResultType {

    @Element(required = true)
    protected CodableValue title;
    @Element(required = false)
    protected Double value;
    @Element(required = false)
    protected CodableValue unit;
    @Element(name = "reference-minimum",required = false)
    protected Double referenceMinimum;
    @Element(name = "reference-maximum",required = false)
    protected Double referenceMaximum;
    @Element(name = "text-value",required = false)
    protected String textValue;
    @Element(required = false)
    protected CodableValue flag;

    /**
     * Gets the value of the title property.
     *
     * @return possible object is {@link CodableValue }
     *
     */
    public CodableValue getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     *
     * @param value
     *            allowed object is {@link CodableValue }
     *
     */
    public void setTitle(CodableValue value) {
        this.title = value;
    }

    /**
     * Gets the value of the value property.
     *
     * @return possible object is {@link Double }
     *
     */
    public Double getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     *
     * @param value
     *            allowed object is {@link Double }
     *
     */
    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * Gets the value of the unit property.
     *
     * @return possible object is {@link CodableValue }
     *
     */
    public CodableValue getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     *
     * @param value
     *            allowed object is {@link CodableValue }
     *
     */
    public void setUnit(CodableValue value) {
        this.unit = value;
    }

    /**
     * Gets the value of the referenceMinimum property.
     *
     * @return possible object is {@link Double }
     *
     */
    public Double getReferenceMinimum() {
        return referenceMinimum;
    }

    /**
     * Sets the value of the referenceMinimum property.
     *
     * @param value
     *            allowed object is {@link Double }
     *
     */
    public void setReferenceMinimum(Double value) {
        this.referenceMinimum = value;
    }

    /**
     * Gets the value of the referenceMaximum property.
     *
     * @return possible object is {@link Double }
     *
     */
    public Double getReferenceMaximum() {
        return referenceMaximum;
    }

    /**
     * Sets the value of the referenceMaximum property.
     *
     * @param value
     *            allowed object is {@link Double }
     *
     */
    public void setReferenceMaximum(Double value) {
        this.referenceMaximum = value;
    }

    /**
     * Gets the value of the textValue property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getTextValue() {
        return textValue;
    }

    /**
     * Sets the value of the textValue property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setTextValue(String value) {
        this.textValue = value;
    }

    /**
     * Gets the value of the flag property.
     *
     * @return possible object is {@link CodableValue }
     *
     */
    public CodableValue getFlag() {
        return flag;
    }

    /**
     * Sets the value of the flag property.
     *
     * @param value
     *            allowed object is {@link CodableValue }
     *
     */
    public void setFlag(CodableValue value) {
        this.flag = value;
    }

}
