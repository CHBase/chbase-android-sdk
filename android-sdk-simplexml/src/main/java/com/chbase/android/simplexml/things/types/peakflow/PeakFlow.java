package com.chbase.android.simplexml.things.types.peakflow;

import com.chbase.android.simplexml.things.thing.AbstractThing;
import com.chbase.android.simplexml.things.types.base.CodableValue;
import com.chbase.android.simplexml.things.types.dates.ApproxDateTime;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

@Order(elements = { "when", "pef", "fev1", "fev6", "measurement-flags" })
@Root(name = "peak-flow")
public class PeakFlow extends AbstractThing {
    public static String typeId = "5d8419af-90f0-4875-a370-0f881c18f6b3";

    @Element(required = true)
    protected ApproxDateTime when;
    @Element(required = false)
    protected FlowValue pef;
    @Element(required = false)
    protected VolumeValue fev1;
    @Element(required = false)
    protected VolumeValue fev6;
    @ElementList(entry = "measurement-flags", inline = true, required = false)
    protected List<CodableValue> measurementFlags;

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
     * Gets the value of the pef property.
     *
     * @return possible object is {@link FlowValue }
     *
     */
    public FlowValue getPef() {
        return pef;
    }

    /**
     * Sets the value of the pef property.
     *
     * @param value
     *            allowed object is {@link FlowValue }
     *
     */
    public void setPef(FlowValue value) {
        this.pef = value;
    }

    /**
     * Gets the value of the fev1 property.
     *
     * @return possible object is {@link VolumeValue }
     *
     */
    public VolumeValue getFev1() {
        return fev1;
    }

    /**
     * Sets the value of the fev1 property.
     *
     * @param value
     *            allowed object is {@link VolumeValue }
     *
     */
    public void setFev1(VolumeValue value) {
        this.fev1 = value;
    }

    /**
     * Gets the value of the fev6 property.
     *
     * @return possible object is {@link VolumeValue }
     *
     */
    public VolumeValue getFev6() {
        return fev6;
    }

    /**
     * Sets the value of the fev6 property.
     *
     * @param value
     *            allowed object is {@link VolumeValue }
     *
     */
    public void setFev6(VolumeValue value) {
        this.fev6 = value;
    }

    /**
     * Gets the value of the measurementFlags property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the measurementFlags property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getMeasurementFlags().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodableValue }
     *
     *
     */
    public List<CodableValue> getMeasurementFlags() {
        if (measurementFlags == null) {
            measurementFlags = new ArrayList<CodableValue>();
        }
        return this.measurementFlags;
    }

    @Override
    public String getThingType() {
        return typeId;
    }
}
