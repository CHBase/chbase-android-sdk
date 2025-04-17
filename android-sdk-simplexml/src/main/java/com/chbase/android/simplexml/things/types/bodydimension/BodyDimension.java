package com.chbase.android.simplexml.things.types.bodydimension;

import com.chbase.android.simplexml.things.thing.AbstractThing;
import com.chbase.android.simplexml.things.types.base.CodableValue;
import com.chbase.android.simplexml.things.types.dates.ApproxDateTime;
import com.chbase.android.simplexml.things.types.height.HeightValue;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/**
 *
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:this="urn:com.microsoft.wc.thing.body-dimension"&gt;
 *                         Stores a body dimension.
 *                     &lt;/summary&gt;
 * </pre>
 *
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:this="urn:com.microsoft.wc.thing.body-dimension"&gt;
 *                         Examples: Waist size, head circumference, length (pediatric).
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
 *         &lt;element name="when" type="{urn:com.microsoft.wc.dates}approx-date-time"/>
 *         &lt;element name="measurement-name" type="{urn:com.microsoft.wc.thing.types}codable-value"/>
 *         &lt;element name="value" type="{urn:com.microsoft.wc.thing.types}length-value"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */

@Order(elements = { "when", "measurement-name", "value" })
@Root(name = "body-dimension")
public class BodyDimension extends AbstractThing {
    public static String typeId = "dd710b31-2b6f-45bd-9552-253562b9a7c1";

    @Element(required = true)
    protected ApproxDateTime when;
    @Element(name = "measurement-name", required = true)
    protected CodableValue measurementName;
    @Element(required = true)
    protected HeightValue value;

    /**
     * Gets the value of the when property.
     *
     * @return possible object is {@link ApproxDateTime }
     *
     */
    public ApproxDateTime getWhen() {
        return when;
    }

    /**
     * Sets the value of the when property.
     *
     * @param value
     *            allowed object is {@link ApproxDateTime }
     *
     */
    public void setWhen(ApproxDateTime value) {
        this.when = value;
    }

    /**
     * Gets the value of the measurementName property.
     *
     * @return possible object is {@link CodableValue }
     *
     */
    public CodableValue getMeasurementName() {
        return measurementName;
    }

    /**
     * Sets the value of the measurementName property.
     *
     * @param value
     *            allowed object is {@link CodableValue }
     *
     */
    public void setMeasurementName(CodableValue value) {
        this.measurementName = value;
    }

    /**
     * Gets the value of the value property.
     *
     * @return possible object is {@link HeightValue }
     *
     */
    public HeightValue getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     *
     * @param value
     *            allowed object is {@link HeightValue }
     *
     */
    public void setValue(HeightValue value) {
        this.value = value;
    }

    @Override
    public String getThingType() {
        return typeId;
    }
}
