package com.chbase.android.simplexml.things.types.familyhistory;

import com.chbase.android.simplexml.things.types.base.CodableValue;
import com.chbase.android.simplexml.things.types.dates.ApproxDate;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;

@Order(elements = { "name", "onset-date", "resolution-date", "resolution", "occurrence",
        "severity" })
public class Condition {

    @Element(required = true)
    protected CodableValue name;
    @Element(name = "onset-date",required = false)
    protected ApproxDate onsetDate;
    @Element(name = "resolution-date",required = false)
    protected ApproxDate resolutionDate;
    @Element(required = false)
    protected String resolution;
    @Element(required = false)
    protected CodableValue occurrence;
    @Element(required = false)
    protected CodableValue severity;

    /**
     * Gets the value of the name property.
     *
     * @return possible object is {@link CodableValue }
     *
     */
    public CodableValue getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *            allowed object is {@link CodableValue }
     *
     */
    public void setName(CodableValue value) {
        this.name = value;
    }

    /**
     * Gets the value of the onsetDate property.
     *
     * @return possible object is {@link ApproxDate }
     *
     */
    public ApproxDate getOnsetDate() {
        return onsetDate;
    }

    /**
     * Sets the value of the onsetDate property.
     *
     * @param value
     *            allowed object is {@link ApproxDate }
     *
     */
    public void setOnsetDate(ApproxDate value) {
        this.onsetDate = value;
    }

    /**
     * Gets the value of the resolutionDate property.
     *
     * @return possible object is {@link ApproxDate }
     *
     */
    public ApproxDate getResolutionDate() {
        return resolutionDate;
    }

    /**
     * Sets the value of the resolutionDate property.
     *
     * @param value
     *            allowed object is {@link ApproxDate }
     *
     */
    public void setResolutionDate(ApproxDate value) {
        this.resolutionDate = value;
    }

    /**
     * Gets the value of the resolution property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getResolution() {
        return resolution;
    }

    /**
     * Sets the value of the resolution property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setResolution(String value) {
        this.resolution = value;
    }

    /**
     * Gets the value of the occurrence property.
     *
     * @return possible object is {@link CodableValue }
     *
     */
    public CodableValue getOccurrence() {
        return occurrence;
    }

    /**
     * Sets the value of the occurrence property.
     *
     * @param value
     *            allowed object is {@link CodableValue }
     *
     */
    public void setOccurrence(CodableValue value) {
        this.occurrence = value;
    }

    /**
     * Gets the value of the severity property.
     *
     * @return possible object is {@link CodableValue }
     *
     */
    public CodableValue getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     *
     * @param value
     *            allowed object is {@link CodableValue }
     *
     */
    public void setSeverity(CodableValue value) {
        this.severity = value;
    }

}
