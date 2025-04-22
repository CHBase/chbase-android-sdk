package com.chbase.android.simplexml.things.types.hba1c;


import com.chbase.android.simplexml.things.thing.AbstractThing;
import com.chbase.android.simplexml.things.types.base.CodableValue;
import com.chbase.android.simplexml.things.types.dates.DateTime;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

@Order(elements = {
        "when",
        "value",
        "HbA1C-assay-method",
        "device-id"
})
@Root(name = "HbA1C")
public class HbA1C extends AbstractThing {
    public static String typeId = "62160199-b80f-4905-a55a-ac4ba825ceae";
    @Element(required = true)
    protected DateTime when;
    @Element(required = true)
    protected HbA1CValue value;
    @Element(name = "HbA1C-assay-method", required = false)
    protected CodableValue hbA1CAssayMethod;
    @Element(name = "device-id", required = false)
    protected String deviceId;

    /**
     * Gets the value of the when property.
     *
     * @return
     *     possible object is
     *     {@link DateTime }
     *
     */
    public DateTime getWhen() {
        return when;
    }

    /**
     * Sets the value of the when property.
     *
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *
     */
    public void setWhen(DateTime value) {
        this.when = value;
    }

    /**
     * Gets the value of the value property.
     *
     * @return
     *     possible object is
     *     {@link HbA1CValue }
     *
     */
    public HbA1CValue getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     *
     * @param value
     *     allowed object is
     *     {@link HbA1CValue }
     *
     */
    public void setValue(HbA1CValue value) {
        this.value = value;
    }

    /**
     * Gets the value of the hbA1CAssayMethod property.
     *
     * @return
     *     possible object is
     *     {@link CodableValue }
     *
     */
    public CodableValue getHbA1CAssayMethod() {
        return hbA1CAssayMethod;
    }

    /**
     * Sets the value of the hbA1CAssayMethod property.
     *
     * @param value
     *     allowed object is
     *     {@link CodableValue }
     *
     */
    public void setHbA1CAssayMethod(CodableValue value) {
        this.hbA1CAssayMethod = value;
    }

    /**
     * Gets the value of the deviceId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * Sets the value of the deviceId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDeviceId(String value) {
        this.deviceId = value;
    }

    @Override
    public String getThingType() {
        return typeId;
    }
}
