package com.chbase.android.simplexml.things.types.basicdemographic;

import com.chbase.android.simplexml.things.types.base.CodableValue;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;

@Order(elements = { "language", "is-primary" })
public class Language {
    @Element(required = false)
    protected CodableValue language;
    @Element(name = "is-primary",required = false)
    protected Boolean isPrimary;

    /**
     * Gets the value of the language property.
     *
     * @return possible object is {@link CodableValue }
     *
     */
    public CodableValue getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     *
     * @param value
     *            allowed object is {@link CodableValue }
     *
     */
    public void setLanguage(CodableValue value) {
        this.language = value;
    }

    /**
     * Gets the value of the isPrimary property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isIsPrimary() {
        return isPrimary;
    }

    /**
     * Sets the value of the isPrimary property.
     *
     * @param value
     *            allowed object is {@link Boolean }
     *
     */
    public void setIsPrimary(Boolean value) {
        this.isPrimary = value;
    }

}
