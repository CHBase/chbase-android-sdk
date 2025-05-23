package com.chbase.android.simplexml.things.types.insulininjection;

import com.chbase.android.simplexml.things.thing.AbstractThing;
import com.chbase.android.simplexml.things.types.base.CodableValue;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/**
 *
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:insulin="urn:com.microsoft.wc.thing.insulin" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;
 *                         Any insulin injection used to treat diabetes.
 *                     &lt;/summary&gt;
 * </pre>
 *
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:insulin="urn:com.microsoft.wc.thing.insulin" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;
 *                         The injection may or may not have a device component.
 *                         Each new injection package should have a new insulin-injection thing, even
 *                         if there is a containing device that is reusable.
 *                         Changes in regimen (min/max doses per day) should also
 *                         cause a new thing to be created.
 *                     &lt;/remarks&gt;
 * </pre>
 *
 *
 * <p>
 * Java class for anonymous complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{urn:com.microsoft.wc.thing.types}codable-value"/>
 *         &lt;element name="amount" type="{urn:com.microsoft.wc.thing.types}insulin-injection-value"/>
 *         &lt;element name="device-id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */

@Order(elements = { "type", "amount", "device-id" })
@Root(name = "insulin-injection")
public class InsulinInjection extends AbstractThing {
    public static String typeId = "3B3C053B-B1FE-4E11-9E22-D4B480DE74E8";

    @Element(required = true)
    protected CodableValue type;
    @Element(required = true)
    protected InsulinInjectionValue amount;
    @Element(name = "device-id")
    protected String deviceId;

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
