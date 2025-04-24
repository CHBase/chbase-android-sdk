package com.chbase.android.simplexml.things.types.asthmainhalerusage;

import com.chbase.android.simplexml.things.thing.AbstractThing;
import com.chbase.android.simplexml.things.types.base.CodableValue;
import com.chbase.android.simplexml.things.types.dates.DateTime;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

@Order(elements = { "when", "drug", "strength", "dose-count", "device-id", "dose-purpose" })
@Root(name = "asthma-inhaler-use")
public class AsthmaInhalerUsage extends AbstractThing {
    public static String typeId = "03efe378-976a-42f8-ae1e-507c497a8c6d";

    @Element(required = true)
    protected DateTime when;
    @Element(required = true)
    protected CodableValue drug;
    @Element(required = false)
    protected CodableValue strength;
    @Element(name = "dose-count", required = false)
    protected Integer doseCount;
    @Element(name = "device-id", required = false)
    protected String deviceId;
    @Element(name = "dose-purpose",required = false)
    protected CodableValue dosePurpose;

    /**
     * Gets the value of the when property.
     *
     * @return possible object is {@link DateTime }
     *
     */
    public DateTime getWhen() {
        return when;
    }

    /**
     * Sets the value of the when property.
     *
     * @param value
     *            allowed object is {@link DateTime }
     *
     */
    public void setWhen(DateTime value) {
        this.when = value;
    }

    /**
     * Gets the value of the drug property.
     *
     * @return possible object is {@link CodableValue }
     *
     */
    public CodableValue getDrug() {
        return drug;
    }

    /**
     * Sets the value of the drug property.
     *
     * @param value
     *            allowed object is {@link CodableValue }
     *
     */
    public void setDrug(CodableValue value) {
        this.drug = value;
    }

    /**
     * Gets the value of the strength property.
     *
     * @return possible object is {@link CodableValue }
     *
     */
    public CodableValue getStrength() {
        return strength;
    }

    /**
     * Sets the value of the strength property.
     *
     * @param value
     *            allowed object is {@link CodableValue }
     *
     */
    public void setStrength(CodableValue value) {
        this.strength = value;
    }

    /**
     * Gets the value of the doseCount property.
     *
     * @return possible object is {@link Integer }
     *
     */
    public Integer getDoseCount() {
        return doseCount;
    }

    /**
     * Sets the value of the doseCount property.
     *
     * @param value
     *            allowed object is {@link Integer }
     *
     */
    public void setDoseCount(Integer value) {
        this.doseCount = value;
    }

    /**
     * Gets the value of the deviceId property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * Sets the value of the deviceId property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setDeviceId(String value) {
        this.deviceId = value;
    }

    /**
     * Gets the value of the dosePurpose property.
     *
     * @return possible object is {@link CodableValue }
     *
     */
    public CodableValue getDosePurpose() {
        return dosePurpose;
    }

    /**
     * Sets the value of the dosePurpose property.
     *
     * @param value
     *            allowed object is {@link CodableValue }
     *
     */
    public void setDosePurpose(CodableValue value) {
        this.dosePurpose = value;
    }

    @Override
    public String getThingType() {
        return typeId;
    }
}
