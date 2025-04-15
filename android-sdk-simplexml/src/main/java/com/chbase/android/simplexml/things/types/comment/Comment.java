package com.chbase.android.simplexml.things.types.comment;

import com.chbase.android.simplexml.things.thing.AbstractThing;
import com.chbase.android.simplexml.things.types.base.CodableValue;
import com.chbase.android.simplexml.things.types.dates.ApproxDateTime;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;


@Order(elements = { "when", "content", "category" })
@Root(name = "comment")
public class Comment extends AbstractThing {
    public static String typeId = "9f4e0fcd-10d7-416d-855a-90514ce2016b";

    @Element(required = true)
    protected ApproxDateTime when;
    @Element(required = true)
    protected String content;
    @Element(required = false)
    protected CodableValue category;

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
     * Gets the value of the content property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setContent(String value) {
        this.content = value;
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

    @Override
    public String getThingType() {
        return typeId;
    }
}
