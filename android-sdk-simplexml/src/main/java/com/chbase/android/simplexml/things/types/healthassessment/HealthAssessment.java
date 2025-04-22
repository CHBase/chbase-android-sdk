package com.chbase.android.simplexml.things.types.healthassessment;

import com.chbase.android.simplexml.things.thing.AbstractThing;
import com.chbase.android.simplexml.things.types.base.CodableValue;
import com.chbase.android.simplexml.things.types.dates.DateTime;
import java.util.ArrayList;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

import java.util.List;


@Order(elements = { "when", "name", "category", "result" })
@Root(name = "health-assessment")
public class HealthAssessment extends AbstractThing {
    public static String typeId = "58fd8ac4-6c47-41a3-94b2-478401f0e26c";

    @Element(required = true)
    protected DateTime when;
    @Element(required = true)
    protected String name;
    @Element(required = true)
    protected CodableValue category;
    @ElementList(required=true, inline=true, entry="result")
    protected List<Assessment> result;

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
     * Gets the value of the name property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the category property.
     *
     * @return possible object is {@link CodableValue }
     *
     */
    public CodableValue getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     *
     * @param value
     *            allowed object is {@link CodableValue }
     *
     */
    public void setCategory(CodableValue value) {
        this.category = value;
    }

    /**
     * Gets the value of the result property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the result property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getResult().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Assessment }
     *
     *
     */
    public List<Assessment> getResult() {
        if (result == null) {
            result = new ArrayList<Assessment>();
        }
        return this.result;
    }

    @Override
    public String getThingType() {
        return typeId;
    }
}
