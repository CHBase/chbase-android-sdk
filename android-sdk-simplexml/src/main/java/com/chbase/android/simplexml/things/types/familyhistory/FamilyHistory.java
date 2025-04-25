package com.chbase.android.simplexml.things.types.familyhistory;

import com.chbase.android.simplexml.things.thing.AbstractThing;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

@Order(elements = { "condition", "relative" })
@Root(name = "family-history")
public class FamilyHistory extends AbstractThing {
    public static String typeId = "4a04fcc8-19c1-4d59-a8c7-2031a03f21de";
    @ElementList(required = false, entry = "condition", inline = true)
    protected List<Condition> condition;
    @Element(required = false)
    protected FamilyHistoryRelative relative;

    /**
     * Gets the value of the condition property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the condition property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getCondition().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Condition
     * }
     *
     *
     */
    public List<Condition> getCondition() {
        if (condition == null) {
            condition = new ArrayList<Condition>();
        }
        return this.condition;
    }

    /**
     * Gets the value of the relative property.
     *
     * @return possible object is {@link FamilyHistoryRelative }
     *
     */
    public FamilyHistoryRelative getRelative() {
        return relative;
    }

    /**
     * Sets the value of the relative property.
     *
     * @param value
     *            allowed object is {@link FamilyHistoryRelative }
     *
     */
    public void setRelative(FamilyHistoryRelative value) {
        this.relative = value;
    }

    @Override
    public String getThingType() {
        return typeId;
    }
}
