package com.chbase.android.simplexml.things.types.insulininjection;


import com.chbase.android.simplexml.things.types.base.DisplayValue;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;

/**
 *
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:wct="urn:com.microsoft.wc.types"&gt;

 *                     A insulin injection measurement.

 *                 &lt;/summary&gt;
 * </pre>
 *
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:wct="urn:com.microsoft.wc.types"&gt;

 *                     A insulin injection consists of the value in IE units (1/100ml),

 *                     which is the base unit of insulin injections, and

 *                     an optional display value. The display value is used to

 *                     store the insulin injection amount the user's preference of

 *                      units. This avoids rounding errors when

 *                     converting to and back from IE units

 *                 &lt;/remarks&gt;
 * </pre>
 *
 *
 * <p>
 * Java class for insulin-injection-value complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="insulin-injection-value">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IE" type="{urn:com.microsoft.wc.thing.types}positiveDouble"/>
 *         &lt;element name="display" type="{urn:com.microsoft.wc.thing.types}display-value" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */

@Order(elements = { "IE", "display" })
public class InsulinInjectionValue {

    @Element(name = "IE")
    protected double ie;
    @Element(name = "display", required = false)
    protected DisplayValue display;

    /**
     * Gets the value of the ie property.
     *
     */
    public double getIE() {
        return ie;
    }

    /**
     * Sets the value of the ie property.
     *
     */
    public void setIE(double value) {
        this.ie = value;
    }

    /**
     * Gets the value of the display property.
     *
     * @return possible object is {@link DisplayValue }
     *
     */
    public DisplayValue getDisplay() {
        return display;
    }

    /**
     * Sets the value of the display property.
     *
     * @param value
     *            allowed object is {@link DisplayValue }
     *
     */
    public void setDisplay(DisplayValue value) {
        this.display = value;
    }

}
