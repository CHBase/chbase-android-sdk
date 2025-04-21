package com.chbase.android.simplexml.things.types.bloodoxygensaturation;

import com.chbase.android.simplexml.things.thing.AbstractThing;
import com.chbase.android.simplexml.things.types.base.CodableValue;
import com.chbase.android.simplexml.things.types.dates.DateTime;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;


@Order(elements = { "when", "value", "measurement-method", "measurement-flags" })
@Root(name = "blood-oxygen-saturation")
public class BloodOxygenSaturation extends AbstractThing {
    public static String typeId = "3a54f95f-03d8-4f62-815f-f691fc94a500";

    @Element(required = true)
    protected DateTime when;
    @Element(required = true)
    protected double value;
    @Element(name = "measurement-method", required = false)
    protected CodableValue measurementMethod;
    @Element(name = "measurement-flags", required = false)
    protected CodableValue measurementFlags;

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
     */
    public double getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     *
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * Gets the value of the measurementMethod property.
     *
     * @return possible object is {@link CodableValue }
     *
     */
    public CodableValue getMeasurementMethod() {
        return measurementMethod;
    }

    /**
     * Sets the value of the measurementMethod property.
     *
     * @param value
     *            allowed object is {@link CodableValue }
     *
     */
    public void setMeasurementMethod(CodableValue value) {
        this.measurementMethod = value;
    }

    /**
     * Gets the value of the measurementFlags property.
     *
     * @return possible object is {@link CodableValue }
     *
     */
    public CodableValue getMeasurementFlags() {
        return measurementFlags;
    }

    /**
     * Sets the value of the measurementFlags property.
     *
     * @param value
     *            allowed object is {@link CodableValue }
     *
     */
    public void setMeasurementFlags(CodableValue value) {
        this.measurementFlags = value;
    }

    @Override
    public String getThingType() {
        return  typeId;
    }
}
