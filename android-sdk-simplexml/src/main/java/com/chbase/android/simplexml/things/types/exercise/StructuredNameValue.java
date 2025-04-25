package com.chbase.android.simplexml.things.types.exercise;

import com.chbase.android.simplexml.things.types.base.CodedValue;
import com.chbase.android.simplexml.things.types.base.StructuredMeasurement;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;

@Order(elements = { "name", "value" })
public class StructuredNameValue {

    @Element(required = true)
    protected CodedValue name;
    @Element(required = true)
    protected StructuredMeasurement value;

    /**
     * Gets the value of the name property.
     *
     * @return possible object is {@link CodedValue }
     *
     */
    public CodedValue getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *            allowed object is {@link CodedValue }
     *
     */
    public void setName(CodedValue value) {
        this.name = value;
    }

    /**
     * Gets the value of the value property.
     *
     * @return possible object is {@link StructuredMeasurement }
     *
     */
    public StructuredMeasurement getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     *
     * @param value
     *            allowed object is {@link StructuredMeasurement }
     *
     */
    public void setValue(StructuredMeasurement value) {
        this.value = value;
    }

}
