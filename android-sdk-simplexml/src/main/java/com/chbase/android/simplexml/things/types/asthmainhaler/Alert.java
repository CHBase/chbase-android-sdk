package com.chbase.android.simplexml.things.types.asthmainhaler;

import com.chbase.android.simplexml.things.types.dates.Time;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Order;

import java.util.ArrayList;
import java.util.List;

@Order(elements = { "dow", "time" })
public class Alert {

    @ElementList(inline = true, entry = "dow")
    protected List<Integer> dow;
    @ElementList(inline = true, entry = "time")
    protected List<Time> time;

    /**
     * Gets the value of the dow property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the dow property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getDow().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Integer }
     *
     *
     */
    public List<Integer> getDow() {
        if (dow == null) {
            dow = new ArrayList<Integer>();
        }
        return this.dow;
    }

    /**
     * Gets the value of the time property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the time property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getTime().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Time }
     *
     *
     */
    public List<Time> getTime() {
        if (time == null) {
            time = new ArrayList<Time>();
        }
        return this.time;
    }

}
