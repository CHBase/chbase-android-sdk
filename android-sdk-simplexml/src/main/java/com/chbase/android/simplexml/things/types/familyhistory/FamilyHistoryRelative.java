package com.chbase.android.simplexml.things.types.familyhistory;

import com.chbase.android.simplexml.things.types.base.CodableValue;
import com.chbase.android.simplexml.things.types.base.Person;
import com.chbase.android.simplexml.things.types.dates.ApproxDate;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;

@Order(elements= { "relationship", "relative-name", "date-of-birth", "date-of-death",
        "region-of-origin" })
public class FamilyHistoryRelative {

    @Element(required = true)
    protected CodableValue relationship;
    @Element(name = "relative-name",required = false)
    protected Person relativeName;
    @Element(name = "date-of-birth",required = false)
    protected ApproxDate dateOfBirth;
    @Element(name = "date-of-death",required = false)
    protected ApproxDate dateOfDeath;
    @Element(name = "region-of-origin",required = false)
    protected CodableValue regionOfOrigin;

    /**
     * Gets the value of the relationship property.
     *
     * @return possible object is {@link CodableValue }
     *
     */
    public CodableValue getRelationship() {
        return relationship;
    }

    /**
     * Sets the value of the relationship property.
     *
     * @param value
     *            allowed object is {@link CodableValue }
     *
     */
    public void setRelationship(CodableValue value) {
        this.relationship = value;
    }

    /**
     * Gets the value of the relativeName property.
     *
     * @return possible object is {@link Person }
     *
     */
    public Person getRelativeName() {
        return relativeName;
    }

    /**
     * Sets the value of the relativeName property.
     *
     * @param value
     *            allowed object is {@link Person }
     *
     */
    public void setRelativeName(Person value) {
        this.relativeName = value;
    }

    /**
     * Gets the value of the dateOfBirth property.
     *
     * @return possible object is {@link ApproxDate }
     *
     */
    public ApproxDate getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     *
     * @param value
     *            allowed object is {@link ApproxDate }
     *
     */
    public void setDateOfBirth(ApproxDate value) {
        this.dateOfBirth = value;
    }

    /**
     * Gets the value of the dateOfDeath property.
     *
     * @return possible object is {@link ApproxDate }
     *
     */
    public ApproxDate getDateOfDeath() {
        return dateOfDeath;
    }

    /**
     * Sets the value of the dateOfDeath property.
     *
     * @param value
     *            allowed object is {@link ApproxDate }
     *
     */
    public void setDateOfDeath(ApproxDate value) {
        this.dateOfDeath = value;
    }

    /**
     * Gets the value of the regionOfOrigin property.
     *
     * @return possible object is {@link CodableValue }
     *
     */
    public CodableValue getRegionOfOrigin() {
        return regionOfOrigin;
    }

    /**
     * Sets the value of the regionOfOrigin property.
     *
     * @param value
     *            allowed object is {@link CodableValue }
     *
     */
    public void setRegionOfOrigin(CodableValue value) {
        this.regionOfOrigin = value;
    }

}
