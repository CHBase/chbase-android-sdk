package com.chbase.android.simplexml.things.types.labresult;

import com.chbase.android.simplexml.things.types.base.CodableValue;
import com.chbase.android.simplexml.things.types.dates.ApproxDateTime;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

@Order( elements = { "when", "name", "substance", "collection-method", "clinical-code",
        "value", "status", "note" })
public class LabTestResultType {
    @Element(name = "when",required = false)
    protected ApproxDateTime when;
    @Element(name = "name",required = false)
    protected String name;
    @Element(name = "substance",required = false)
    protected CodableValue substance;
    @Element(name = "collection-method" ,required = false)
    protected CodableValue collectionMethod;
    @Element(name = "clinical-code",required = false)
    protected CodableValue clinicalCode;

    @Element(name = "value",required = false)
    protected LabTestResultValueType value;

    @Element(name = "status",required = false)
    protected CodableValue status;

    @Element(name = "note",required = false)
    protected String note;

    /**
     * Gets the value of the when property.
     *
     * @return possible object is {@link ApproxDateTime }
     *
     */
    public ApproxDateTime getWhen() {
        return when;
    }

    /**
     * Sets the value of the when property.
     *
     * @param value
     *            allowed object is {@link ApproxDateTime }
     *
     */
    public void setWhen(ApproxDateTime value) {
        this.when = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the substance property.
     *
     * @return possible object is {@link CodableValue }
     *
     */
    public CodableValue getSubstance() {
        return substance;
    }

    /**
     * Sets the value of the substance property.
     *
     * @param value
     *            allowed object is {@link CodableValue }
     *
     */
    public void setSubstance(CodableValue value) {
        this.substance = value;
    }

    /**
     * Gets the value of the collectionMethod property.
     *
     * @return possible object is {@link CodableValue }
     *
     */
    public CodableValue getCollectionMethod() {
        return collectionMethod;
    }

    /**
     * Sets the value of the collectionMethod property.
     *
     * @param value
     *            allowed object is {@link CodableValue }
     *
     */
    public void setCollectionMethod(CodableValue value) {
        this.collectionMethod = value;
    }

    /**
     * Gets the value of the clinicalCode property.
     *
     * @return possible object is {@link CodableValue }
     *
     */
    public CodableValue getClinicalCode() {
        return clinicalCode;
    }

    /**
     * Sets the value of the clinicalCode property.
     *
     * @param value
     *            allowed object is {@link CodableValue }
     *
     */
    public void setClinicalCode(CodableValue value) {
        this.clinicalCode = value;
    }

    /**
     * Gets the value of the value property.
     *
     * @return possible object is {@link LabTestResultValueType }
     *
     */
    public LabTestResultValueType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     *
     * @param value
     *            allowed object is {@link LabTestResultValueType }
     *
     */
    public void setValue(LabTestResultValueType value) {
        this.value = value;
    }

    /**
     * Gets the value of the status property.
     *
     * @return possible object is {@link CodableValue }
     *
     */
    public CodableValue getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     *
     * @param value
     *            allowed object is {@link CodableValue }
     *
     */
    public void setStatus(CodableValue value) {
        this.status = value;
    }

    /**
     * Gets the value of the note property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setNote(String value) {
        this.note = value;
    }

}

