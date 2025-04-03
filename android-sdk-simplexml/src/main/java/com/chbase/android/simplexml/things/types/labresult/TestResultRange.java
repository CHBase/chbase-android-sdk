package com.chbase.android.simplexml.things.types.labresult;

import com.chbase.android.simplexml.things.types.base.CodableValue;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

@Order(elements = { "type", "text", "value" })
@Root(name = "test-result-range")
public class TestResultRange {

    @Element(required = true)
    protected CodableValue type;
    @Element(required = true)
    protected CodableValue text;
    @Element(name = "value", required = false)
    protected TestResultRangeValue value;

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
     * Gets the value of the text property.
     *
     * @return possible object is {@link CodableValue }
     *
     */
    public CodableValue getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     *
     * @param value
     *            allowed object is {@link CodableValue }
     *
     */
    public void setText(CodableValue value) {
        this.text = value;
    }

    /**
     * Gets the value of the value property.
     *
     * @return possible object is {@link TestResultRangeValue }
     *
     */
    public TestResultRangeValue getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     *
     * @param value
     *            allowed object is {@link TestResultRangeValue }
     *
     */
    public void setValue(TestResultRangeValue value) {
        this.value = value;
    }

}
