package com.chbase.android.simplexml.things.types.appspecific;

import com.chbase.android.simplexml.things.thing.AbstractThing;
import com.chbase.android.simplexml.things.types.dates.DateTime;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

@Order(elements = { "format-appid", "format-tag", "when", "summary", "any" })
@Root(name = "app-specific")
public class AppSpecific extends AbstractThing {
    public static String typeId = "a5033c9d-08cf-4204-9bd3-cb412ce39fc0";

    @Element(name = "format-appid", required = true)
    protected String formatAppid;
    @Element(name = "format-tag", required = true)
    protected String formatTag;
    @Element(name = "when", required = false)
    protected DateTime when;
    @Element(required = true)
    protected String summary;
    @ElementList(entry="any", inline=true, required=false)
    protected List<String> any;

    /**
     * Gets the value of the formatAppid property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getFormatAppid() {
        return formatAppid;
    }

    /**
     * Sets the value of the formatAppid property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setFormatAppid(String value) {
        this.formatAppid = value;
    }

    /**
     * Gets the value of the formatTag property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getFormatTag() {
        return formatTag;
    }

    /**
     * Sets the value of the formatTag property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setFormatTag(String value) {
        this.formatTag = value;
    }

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
     * Gets the value of the summary property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setSummary(String value) {
        this.summary = value;
    }

    /**
     * Gets the value of the any property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the any property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getAny().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Element }
     *
     *
     */
    public List<String> getAny() {
        if (any == null) {
            any = new ArrayList<String>();
        }
        return this.any;
    }

    @Override
    public String getThingType() {
        return typeId;
    }
}

