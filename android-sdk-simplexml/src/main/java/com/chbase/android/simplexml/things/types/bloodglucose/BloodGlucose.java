package com.chbase.android.simplexml.things.types.bloodglucose;

import com.chbase.android.simplexml.things.thing.AbstractThing;
import com.chbase.android.simplexml.things.types.base.CodableValue;
import com.chbase.android.simplexml.things.types.dates.DateTime;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

@Order(elements = {"when", "value", "glucose-measurement-type", "outside-operating-temp", "is-control-test",
        "normalcy", "measurement-context" })
@Root(name = "blood-glucose")
public class BloodGlucose extends AbstractThing {
    public static String typeId = "879e7c04-4e8a-4707-9ad3-b054df467ce4";

    @Element(required = true)
    protected DateTime when;
    @Element(required = true)
    protected BloodGlucoseValue value;
    @Element(name = "glucose-measurement-type", required = true)
    protected CodableValue glucoseMeasurementType;
    @Element(name = "outside-operating-temp", required = false)
    protected Boolean outsideOperatingTemp;
    @Element(name = "is-control-test", required = false)
    protected Boolean isControlTest;
    @Element(required = false)
    protected Integer normalcy;
    @Element(name = "measurement-context", required = false)
    protected CodableValue measurementContext;

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
     * Gets the value of the value property.
     *
     * @return possible object is {@link BloodGlucoseValue }
     *
     */
    public BloodGlucoseValue getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     *
     * @param value
     *            allowed object is {@link BloodGlucoseValue }
     *
     */
    public void setValue(BloodGlucoseValue value) {
        this.value = value;
    }

    /**
     * Gets the value of the glucoseMeasurementType property.
     *
     * @return possible object is {@link CodableValue }
     *
     */
    public CodableValue getGlucoseMeasurementType() {
        return glucoseMeasurementType;
    }

    /**
     * Sets the value of the glucoseMeasurementType property.
     *
     * @param value
     *            allowed object is {@link CodableValue }
     *
     */
    public void setGlucoseMeasurementType(CodableValue value) {
        this.glucoseMeasurementType = value;
    }

    /**
     * Gets the value of the outsideOperatingTemp property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isOutsideOperatingTemp() {
        return outsideOperatingTemp;
    }

    /**
     * Sets the value of the outsideOperatingTemp property.
     *
     * @param value
     *            allowed object is {@link Boolean }
     *
     */
    public void setOutsideOperatingTemp(Boolean value) {
        this.outsideOperatingTemp = value;
    }

    /**
     * Gets the value of the isControlTest property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isIsControlTest() {
        return isControlTest;
    }

    /**
     * Sets the value of the isControlTest property.
     *
     * @param value
     *            allowed object is {@link Boolean }
     *
     */
    public void setIsControlTest(Boolean value) {
        this.isControlTest = value;
    }

    /**
     * Gets the value of the normalcy property.
     *
     * @return possible object is {@link Integer }
     *
     */
    public Integer getNormalcy() {
        return normalcy;
    }

    /**
     * Sets the value of the normalcy property.
     *
     * @param value
     *            allowed object is {@link Integer }
     *
     */
    public void setNormalcy(Integer value) {
        this.normalcy = value;
    }

    /**
     * Gets the value of the measurementContext property.
     *
     * @return possible object is {@link CodableValue }
     *
     */
    public CodableValue getMeasurementContext() {
        return measurementContext;
    }

    /**
     * Sets the value of the measurementContext property.
     *
     * @param value
     *            allowed object is {@link CodableValue }
     *
     */
    public void setMeasurementContext(CodableValue value) {
        this.measurementContext = value;
    }

    @Override
    public String getThingType() {
        return typeId;
    }
}

