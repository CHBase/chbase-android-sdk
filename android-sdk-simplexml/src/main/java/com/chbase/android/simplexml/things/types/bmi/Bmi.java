//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//

package com.chbase.android.simplexml.things.types.bmi;


import com.chbase.android.simplexml.things.thing.AbstractThing;
import com.chbase.android.simplexml.things.types.base.WeightValue;
import com.chbase.android.simplexml.things.types.dates.DateTime;
import com.chbase.android.simplexml.things.types.height.HeightValue;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/**
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:bmi="urn:com.microsoft.wc.thing.bmi" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;&#13;
 * 						Information about a bmi measurement.&#13;
 * 					&lt;/summary&gt;
 * </pre>
 * 
 * <p>
 * Java class for anonymous complex type
 * </p>
 * .
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * </p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="when" type="{urn:com.microsoft.wc.dates}date-time"/>
 *         <element name="height" type=
"{urn:com.microsoft.wc.thing.types}length-value" minOccurs="0"/>
 *         <element name="weight" type=
"{urn:com.microsoft.wc.thing.types}weight-value" minOccurs="0"/>
 *         <element name="value" type=
"{urn:com.microsoft.wc.thing.types}bmi-value"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */

@Order(elements = {
        "when",
        "height",
        "weight",
        "value"
})
@Root(name = "bmi")
public class Bmi extends AbstractThing {
    public static String typeId = "e6c843cf-839a-4d79-a549-9c3b54a6b67c";
    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:bmi="urn:com.microsoft.wc.thing.bmi" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;&#13;
     * 								The date and time the bmi measurement&#13;
     * 								occurred.&#13;
     * 							&lt;/summary&gt;
     * </pre>
     * 
     */
    @Element(required = true)
    protected DateTime when;
    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:bmi="urn:com.microsoft.wc.thing.bmi" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;&#13;
     * 								The value of the height reading associated with the bmi.&#13;
     * 							&lt;/summary&gt;
     * </pre>
     * 
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:bmi="urn:com.microsoft.wc.thing.bmi" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;&#13;
     * 								Length values are measured in meters but data&#13;
     * 								entered by users using other units should be&#13;
     * 								stored in the display-value and used when&#13;
     * 								displaying the data to the user.&#13;
     * 							&lt;/remarks&gt;
     * </pre>
     * 
     */
    @Element(required = false)
    protected HeightValue height;
    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:bmi="urn:com.microsoft.wc.thing.bmi" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;&#13;
     * 								The value of the weight measurement associated with the bmi.&#13;
     * 							&lt;/summary&gt;
     * </pre>
     * 
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:bmi="urn:com.microsoft.wc.thing.bmi" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;&#13;
     * 								Weight values are measured in kg but data&#13;
     * 								entered by users using other units should be&#13;
     * 								stored in the display-value and used when&#13;
     * 								displaying the data to the user.&#13;
     * 							&lt;/remarks&gt;
     * </pre>
     * 
     */
    @Element(required = false)
    protected WeightValue weight;
    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:bmi="urn:com.microsoft.wc.thing.bmi" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;&#13;
     * 								The value of the bmi measurement.&#13;
     * 							&lt;/summary&gt;
     * </pre>
     * 
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:bmi="urn:com.microsoft.wc.thing.bmi" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;&#13;
     * 								bmi values are measured in kg/m2 but data&#13;
     * 								entered by users using other units should be&#13;
     * 								stored in the display-value and used when&#13;
     * 								displaying the data to the user.&#13;
     * 							&lt;/remarks&gt;
     * </pre>
     * 
     */
    @Element(required = true)
    protected BmiValue value;

    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:bmi="urn:com.microsoft.wc.thing.bmi" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;&#13;
     * 								The date and time the bmi measurement&#13;
     * 								occurred.&#13;
     * 							&lt;/summary&gt;
     * </pre>
     * 
     * @return
     *         possible object is
     *         {@link DateTime }
     * 
     */
    public DateTime getWhen() {
        return when;
    }

    /**
     * Sets the value of the when property.
     * 
     * @param value
     *              allowed object is
     *              {@link DateTime }
     * 
     * @see #getWhen()
     */
    public void setWhen(DateTime value) {
        this.when = value;
    }

    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:bmi="urn:com.microsoft.wc.thing.bmi" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;&#13;
     * 								The value of the height reading associated with the bmi.&#13;
     * 							&lt;/summary&gt;
     * </pre>
     * 
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:bmi="urn:com.microsoft.wc.thing.bmi" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;&#13;
     * 								Length values are measured in meters but data&#13;
     * 								entered by users using other units should be&#13;
     * 								stored in the display-value and used when&#13;
     * 								displaying the data to the user.&#13;
     * 							&lt;/remarks&gt;
     * </pre>
     * 
     * @return
     *         possible object is
     *         {@link HeightValue }
     * 
     */
    public HeightValue getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *              allowed object is
     *              {@link HeightValue }
     * 
     * @see #getHeight()
     */
    public void setHeight(HeightValue value) {
        this.height = value;
    }

    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:bmi="urn:com.microsoft.wc.thing.bmi" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;&#13;
     * 								The value of the weight measurement associated with the bmi.&#13;
     * 							&lt;/summary&gt;
     * </pre>
     * 
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:bmi="urn:com.microsoft.wc.thing.bmi" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;&#13;
     * 								Weight values are measured in kg but data&#13;
     * 								entered by users using other units should be&#13;
     * 								stored in the display-value and used when&#13;
     * 								displaying the data to the user.&#13;
     * 							&lt;/remarks&gt;
     * </pre>
     * 
     * @return
     *         possible object is
     *         {@link WeightValue }
     * 
     */
    public WeightValue getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *              allowed object is
     *              {@link WeightValue }
     * 
     * @see #getWeight()
     */
    public void setWeight(WeightValue value) {
        this.weight = value;
    }

    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:bmi="urn:com.microsoft.wc.thing.bmi" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;&#13;
     * 								The value of the bmi measurement.&#13;
     * 							&lt;/summary&gt;
     * </pre>
     * 
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:bmi="urn:com.microsoft.wc.thing.bmi" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;&#13;
     * 								bmi values are measured in kg/m2 but data&#13;
     * 								entered by users using other units should be&#13;
     * 								stored in the display-value and used when&#13;
     * 								displaying the data to the user.&#13;
     * 							&lt;/remarks&gt;
     * </pre>
     * 
     * @return
     *         possible object is
     *         {@link BmiValue }
     * 
     */
    public BmiValue getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *              allowed object is
     *              {@link BmiValue }
     * 
     * @see #getValue()
     */
    public void setValue(BmiValue value) {
        this.value = value;
    }

    @Override
    public String getThingType() {
        return typeId;
    }
}
