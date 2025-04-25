package com.chbase.android.simplexml.things.types.basicdemographic;

import com.chbase.android.simplexml.things.thing.AbstractThing;
import com.chbase.android.simplexml.things.types.base.CodableValue;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

import java.util.List;
import java.util.ArrayList;

@Order(elements = { "gender", "birthyear", "country", "postcode", "city", "state", "firstdow",
        "language" })
@Root(name = "basic")
public class BasicDemographic extends AbstractThing {
    public static String typeId = "3b3e6b16-eb69-483c-8d7e-dfe116ae6092";
    @Element(required = false)
    protected String gender;
    @Element(required = false)
    protected Integer birthyear;
    @Element(required = false)
    protected CodableValue country;
    @Element(required = false)
    protected String postcode;
    @Element(required = false)
    protected String city;
    @Element(required = false)
    protected CodableValue state;
    @Element(required = false)
    protected Integer firstdow;
    @ElementList(entry = "language", inline = true, required = false)
    protected List<Language> language;

    /**
     * Gets the value of the gender property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the birthyear property.
     *
     * @return possible object is {@link Integer }
     *
     */
    public Integer getBirthyear() {
        return birthyear;
    }

    /**
     * Sets the value of the birthyear property.
     *
     * @param value
     *            allowed object is {@link Integer }
     *
     */
    public void setBirthyear(Integer value) {
        this.birthyear = value;
    }

    /**
     * Gets the value of the country property.
     *
     * @return possible object is {@link CodableValue }
     *
     */
    public CodableValue getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     *
     * @param value
     *            allowed object is {@link CodableValue }
     *
     */
    public void setCountry(CodableValue value) {
        this.country = value;
    }

    /**
     * Gets the value of the postcode property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * Sets the value of the postcode property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setPostcode(String value) {
        this.postcode = value;
    }

    /**
     * Gets the value of the city property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the state property.
     *
     * @return possible object is {@link CodableValue }
     *
     */
    public CodableValue getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     *
     * @param value
     *            allowed object is {@link CodableValue }
     *
     */
    public void setState(CodableValue value) {
        this.state = value;
    }

    /**
     * Gets the value of the firstdow property.
     *
     * @return possible object is {@link Integer }
     *
     */
    public Integer getFirstdow() {
        return firstdow;
    }

    /**
     * Sets the value of the firstdow property.
     *
     * @param value
     *            allowed object is {@link Integer }
     *
     */
    public void setFirstdow(Integer value) {
        this.firstdow = value;
    }

    /**
     * Gets the value of the language property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the language property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getLanguage().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Language
     * }
     *
     *
     */
    public List<Language> getLanguage() {
        if (language == null) {
            language = new ArrayList<Language>();
        }
        return this.language;
    }

    @Override
    public String getThingType() {
        return typeId;
    }
}
