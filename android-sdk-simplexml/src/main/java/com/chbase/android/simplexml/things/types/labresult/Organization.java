package com.chbase.android.simplexml.things.types.labresult;

import com.chbase.android.simplexml.things.types.base.CodableValue;
import com.chbase.android.simplexml.things.types.base.Contact;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;

@Order(elements = { "name", "contact", "type", "website" })
public class Organization {

    @Element(required = true)
    protected String name;
    @Element(required = false)
    protected Contact contact;
    @Element(required = false)
    protected CodableValue type;
    @Element(required = false)
    protected String website;

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
     * Gets the value of the contact property.
     *
     * @return possible object is {@link Contact }
     *
     */
    public Contact getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     *
     * @param value
     *            allowed object is {@link Contact }
     *
     */
    public void setContact(Contact value) {
        this.contact = value;
    }

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
     * Gets the value of the website property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getWebsite() {
        return website;
    }

    /**
     * Sets the value of the website property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setWebsite(String value) {
        this.website = value;
    }

}
