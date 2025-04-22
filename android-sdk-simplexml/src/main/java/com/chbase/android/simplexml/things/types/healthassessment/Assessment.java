package com.chbase.android.simplexml.things.types.healthassessment;

import com.chbase.android.simplexml.things.types.base.CodableValue;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Order;

import java.util.ArrayList;
import java.util.List;

@Order(elements = { "name", "value", "group" })
public class Assessment {

    @Element(required = true)
    protected CodableValue name;
    @ElementList(required=true, inline=true, entry="value")
    protected List<CodableValue> value;
    @Element(required = false)
    protected CodableValue group;

    /**
     * Gets the value of the name property.
     *
     * @return possible object is {@link CodableValue }
     *
     */
    public CodableValue getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *            allowed object is {@link CodableValue }
     *
     */
    public void setName(CodableValue value) {
        this.name = value;
    }

    /**
     * Gets the value of the value property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the value property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getValue().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodableValue }
     *
     *
     */
    public List<CodableValue> getValue() {
        if (value == null) {
            value = new ArrayList<CodableValue>();
        }
        return this.value;
    }

    /**
     * Gets the value of the group property.
     *
     * @return possible object is {@link CodableValue }
     *
     */
    public CodableValue getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     *
     * @param value
     *            allowed object is {@link CodableValue }
     *
     */
    public void setGroup(CodableValue value) {
        this.group = value;
    }

}
