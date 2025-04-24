package com.chbase.android.simplexml.things.types.asthmainhaler;

import com.chbase.android.simplexml.things.thing.AbstractThing;
import com.chbase.android.simplexml.things.types.base.CodableValue;
import com.chbase.android.simplexml.things.types.dates.ApproxDateTime;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

import java.util.List;
import java.util.ArrayList;

@Order(elements = { "drug", "strength", "purpose", "start-date", "stop-date", "expiration-date", "device-id",
        "initial-doses", "min-daily-doses", "max-daily-doses", "can-alert", "alert" })
@Root(name = "asthma-inhaler")
public class AsthmaInhaler extends AbstractThing {
    public static String typeId = "ff9ce191-2096-47d8-9300-5469a9883746";

    @Element(required = true)
    protected CodableValue drug;
    @Element(required = false)
    protected CodableValue strength;
    @Element(required = false)
    protected String  purpose;
    @Element(name = "start-date", required = true)
    protected ApproxDateTime startDate;
    @Element(name = "stop-date",required = false)
    protected ApproxDateTime stopDate;
    @Element(name = "expiration-date",required = false)
    protected ApproxDateTime expirationDate;
    @Element(name = "device-id",required = false)
    protected String deviceId;
    @Element(name = "initial-doses",required = false)
    protected Integer initialDoses;
    @Element(name = "min-daily-doses",required = false)
    protected Integer minDailyDoses;
    @Element(name = "max-daily-doses",required = false)
    protected Integer maxDailyDoses;
    @Element(name = "can-alert",required = false)
    protected Boolean canAlert;
    @ElementList(entry = "alert", inline = true,required = false)
    protected List<Alert> alert;

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
     * Gets the value of the purpose property.
     *
     * @return possible object is {@link String  }
     *
     */
    public String  getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     *
     * @param value
     *            allowed object is {@link String  }
     *
     */
    public void setPurpose(String  value) {
        this.purpose = value;
    }

    /**
     * Gets the value of the startDate property.
     *
     * @return possible object is {@link ApproxDateTime }
     *
     */
    public ApproxDateTime getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     *
     * @param value
     *            allowed object is {@link ApproxDateTime }
     *
     */
    public void setStartDate(ApproxDateTime value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the stopDate property.
     *
     * @return possible object is {@link ApproxDateTime }
     *
     */
    public ApproxDateTime getStopDate() {
        return stopDate;
    }

    /**
     * Sets the value of the stopDate property.
     *
     * @param value
     *            allowed object is {@link ApproxDateTime }
     *
     */
    public void setStopDate(ApproxDateTime value) {
        this.stopDate = value;
    }

    /**
     * Gets the value of the expirationDate property.
     *
     * @return possible object is {@link ApproxDateTime }
     *
     */
    public ApproxDateTime getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     *
     * @param value
     *            allowed object is {@link ApproxDateTime }
     *
     */
    public void setExpirationDate(ApproxDateTime value) {
        this.expirationDate = value;
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
     * Gets the value of the initialDoses property.
     *
     * @return possible object is {@link Integer }
     *
     */
    public Integer getInitialDoses() {
        return initialDoses;
    }

    /**
     * Sets the value of the initialDoses property.
     *
     * @param value
     *            allowed object is {@link Integer }
     *
     */
    public void setInitialDoses(Integer value) {
        this.initialDoses = value;
    }

    /**
     * Gets the value of the minDailyDoses property.
     *
     * @return possible object is {@link Integer }
     *
     */
    public Integer getMinDailyDoses() {
        return minDailyDoses;
    }

    /**
     * Sets the value of the minDailyDoses property.
     *
     * @param value
     *            allowed object is {@link Integer }
     *
     */
    public void setMinDailyDoses(Integer value) {
        this.minDailyDoses = value;
    }

    /**
     * Gets the value of the maxDailyDoses property.
     *
     * @return possible object is {@link Integer }
     *
     */
    public Integer getMaxDailyDoses() {
        return maxDailyDoses;
    }

    /**
     * Sets the value of the maxDailyDoses property.
     *
     * @param value
     *            allowed object is {@link Integer }
     *
     */
    public void setMaxDailyDoses(Integer value) {
        this.maxDailyDoses = value;
    }

    /**
     * Gets the value of the canAlert property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isCanAlert() {
        return canAlert;
    }

    /**
     * Sets the value of the canAlert property.
     *
     * @param value
     *            allowed object is {@link Boolean }
     *
     */
    public void setCanAlert(Boolean value) {
        this.canAlert = value;
    }

    /**
     * Gets the value of the alert property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the alert property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getAlert().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Alert }
     *
     *
     */
    public List<Alert> getAlert() {
        if (alert == null) {
            alert = new ArrayList<Alert>();
        }
        return this.alert;
    }

    @Override
    public String getThingType() {
        return typeId;
    }
}
