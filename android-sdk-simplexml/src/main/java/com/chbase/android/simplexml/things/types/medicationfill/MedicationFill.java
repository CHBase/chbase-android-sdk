package com.chbase.android.simplexml.things.types.medicationfill;

import com.chbase.android.simplexml.things.thing.AbstractThing;
import com.chbase.android.simplexml.things.types.base.CodableValue;
import com.chbase.android.simplexml.things.types.dates.ApproxDateTime;
import com.chbase.android.simplexml.things.types.dates.Date;
import com.chbase.android.simplexml.things.types.labresult.Organization;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;


@Order(elements = { "name", "date-filled", "days-supply", "next-refill-date", "refills-left", "pharmacy",
        "prescription-number", "lot-number" })
@Root(name = "medication-fill")
public class MedicationFill extends AbstractThing {
    public static String typeId = "167ecf6b-bb54-43f9-a473-507b334907e0";

    @Element(required = true)
    protected CodableValue name;
    @Element(name = "date-filled",required = false)
    protected ApproxDateTime dateFilled;
    @Element(name = "days-supply",required = false)
    protected Integer daysSupply;
    @Element(name = "next-refill-date",required = false)
    protected Date nextRefillDate;
    @Element(name = "refills-left",required = false)
    protected Integer refillsLeft;
    @Element(name = "pharmacy",required = false)
    protected Organization pharmacy;
    @Element(name = "prescription-number",required = false)
    protected String prescriptionNumber;
    @Element(name = "lot-number",required = false)
    protected String lotNumber;

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
     * Gets the value of the dateFilled property.
     *
     * @return possible object is {@link ApproxDateTime }
     *
     */
    public ApproxDateTime getDateFilled() {
        return dateFilled;
    }

    /**
     * Sets the value of the dateFilled property.
     *
     * @param value
     *            allowed object is {@link ApproxDateTime }
     *
     */
    public void setDateFilled(ApproxDateTime value) {
        this.dateFilled = value;
    }

    /**
     * Gets the value of the daysSupply property.
     *
     * @return possible object is {@link Integer }
     *
     */
    public Integer getDaysSupply() {
        return daysSupply;
    }

    /**
     * Sets the value of the daysSupply property.
     *
     * @param value
     *            allowed object is {@link Integer }
     *
     */
    public void setDaysSupply(Integer value) {
        this.daysSupply = value;
    }

    /**
     * Gets the value of the nextRefillDate property.
     *
     * @return possible object is {@link Date }
     *
     */
    public Date getNextRefillDate() {
        return nextRefillDate;
    }

    /**
     * Sets the value of the nextRefillDate property.
     *
     * @param value
     *            allowed object is {@link Date }
     *
     */
    public void setNextRefillDate(Date value) {
        this.nextRefillDate = value;
    }

    /**
     * Gets the value of the refillsLeft property.
     *
     * @return possible object is {@link Integer }
     *
     */
    public Integer getRefillsLeft() {
        return refillsLeft;
    }

    /**
     * Sets the value of the refillsLeft property.
     *
     * @param value
     *            allowed object is {@link Integer }
     *
     */
    public void setRefillsLeft(Integer value) {
        this.refillsLeft = value;
    }

    /**
     * Gets the value of the pharmacy property.
     *
     * @return possible object is {@link Organization }
     *
     */
    public Organization getPharmacy() {
        return pharmacy;
    }

    /**
     * Sets the value of the pharmacy property.
     *
     * @param value
     *            allowed object is {@link Organization }
     *
     */
    public void setPharmacy(Organization value) {
        this.pharmacy = value;
    }

    /**
     * Gets the value of the prescriptionNumber property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getPrescriptionNumber() {
        return prescriptionNumber;
    }

    /**
     * Sets the value of the prescriptionNumber property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setPrescriptionNumber(String value) {
        this.prescriptionNumber = value;
    }

    /**
     * Gets the value of the lotNumber property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getLotNumber() {
        return lotNumber;
    }

    /**
     * Sets the value of the lotNumber property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setLotNumber(String value) {
        this.lotNumber = value;
    }

    @Override
    public String getThingType() {
        return typeId;
    }
}
