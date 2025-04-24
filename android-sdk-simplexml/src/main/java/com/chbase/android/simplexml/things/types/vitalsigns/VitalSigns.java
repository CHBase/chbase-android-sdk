package com.chbase.android.simplexml.things.types.vitalsigns;


import com.chbase.android.simplexml.things.thing.AbstractThing;
import com.chbase.android.simplexml.things.types.dates.DateTime;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

@Order(elements= { "when", "vital-signs-results", "site", "position" })
@Root(name = "vital-signs")
public class VitalSigns extends AbstractThing {
    public static String typeId = "73822612-C15F-4B49-9E65-6AF369E55C65";

    @Element(required = true)
    protected DateTime when;
    @ElementList(entry = "vital-signs-results", inline = true, required = false)
    protected List<VitalSignResultType> vitalSignsResults;
    @Element(required = false)
    protected String site;
    @Element(required = false)
    protected String position;

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
     * Gets the value of the vitalSignsResults property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the vitalSignsResults property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getVitalSignsResults().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VitalSignResultType }
     *
     *
     */
    public List<VitalSignResultType> getVitalSignsResults() {
        if (vitalSignsResults == null) {
            vitalSignsResults = new ArrayList<VitalSignResultType>();
        }
        return this.vitalSignsResults;
    }

    /**
     * Gets the value of the site property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getSite() {
        return site;
    }

    /**
     * Sets the value of the site property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setSite(String value) {
        this.site = value;
    }

    /**
     * Gets the value of the position property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setPosition(String value) {
        this.position = value;
    }

    @Override
    public String getThingType() {
        return typeId;
    }
}
