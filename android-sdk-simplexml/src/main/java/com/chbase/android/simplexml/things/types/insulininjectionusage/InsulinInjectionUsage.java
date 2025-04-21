package com.chbase.android.simplexml.things.types.insulininjectionusage;


import com.chbase.android.simplexml.things.thing.AbstractThing;
import com.chbase.android.simplexml.things.types.base.CodableValue;
import com.chbase.android.simplexml.things.types.dates.DateTime;
import com.chbase.android.simplexml.things.types.insulininjection.InsulinInjectionValue;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

@Order(elements = { "when", "type", "amount", "device-id" })
@Root(name = "diabetes-insulin-injection-use")
public class InsulinInjectionUsage extends AbstractThing {

    public static String typeId = "184166BE-8ADB-4D9C-8162-C403040E31AD";

    @Element(required = true)
    protected DateTime when;
    @Element(required = true)
    protected CodableValue type;
    @Element(required = true)
    protected InsulinInjectionValue amount;
    @Element(name = "device-id",required = false)
    protected String deviceId;

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
     * Gets the value of the type property.
     *
     * @return possible object is {@link CodableValue }
     *
     */
    public CodableValue getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value
     *            allowed object is {@link CodableValue }
     *
     */
    public void setType(CodableValue value) {
        this.type = value;
    }

    /**
     * Gets the value of the amount property.
     *
     * @return possible object is {@link InsulinInjectionValue }
     *
     */
    public InsulinInjectionValue getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     *
     * @param value
     *            allowed object is {@link InsulinInjectionValue }
     *
     */
    public void setAmount(InsulinInjectionValue value) {
        this.amount = value;
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

    @Override
    public String getThingType() {
        return typeId;
    }
}
