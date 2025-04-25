package com.chbase.android.simplexml.things.types.exercise;

import com.chbase.android.simplexml.things.thing.AbstractThing;
import com.chbase.android.simplexml.things.types.base.CodableValue;
import com.chbase.android.simplexml.things.types.dates.ApproxDateTime;
import com.chbase.android.simplexml.things.types.height.HeightValue;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

@Order(elements = { "when", "activity", "title", "distance", "duration", "detail", "segment" })
@Root(name = "exercise")
public class Exercise extends AbstractThing {
    public static String typeId = "85a21ddb-db20-4c65-8d30-33c899ccf612";

    @Element(required = true)
    protected ApproxDateTime when;
    @Element(required = true)
    protected CodableValue activity;
    @Element(required = false)
    protected String title;
    @Element(required = false)
    protected HeightValue  distance;
    @Element(required = false)
    protected Double duration;
    @ElementList(required = false, entry = "detail", inline = true)
    protected List<StructuredNameValue> detail;
    @ElementList(required = false, entry = "segment", inline = true)
    protected List<ExerciseSegment> segment;

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
     * Gets the value of the activity property.
     *
     * @return possible object is {@link CodableValue }
     *
     */
    public CodableValue getActivity() {
        return activity;
    }

    /**
     * Sets the value of the activity property.
     *
     * @param value
     *            allowed object is {@link CodableValue }
     *
     */
    public void setActivity(CodableValue value) {
        this.activity = value;
    }

    /**
     * Gets the value of the title property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the distance property.
     *
     * @return possible object is {@link HeightValue }
     *
     */
    public HeightValue getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     *
     * @param value
     *            allowed object is {@link HeightValue }
     *
     */
    public void setDistance(HeightValue value) {
        this.distance = value;
    }

    /**
     * Gets the value of the duration property.
     *
     * @return possible object is {@link Double }
     *
     */
    public Double getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     *
     * @param value
     *            allowed object is {@link Double }
     *
     */
    public void setDuration(Double value) {
        this.duration = value;
    }

    /**
     * Gets the value of the detail property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the detail property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getDetail().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StructuredNameValue }
     *
     *
     */
    public List<StructuredNameValue> getDetail() {
        if (detail == null) {
            detail = new ArrayList<StructuredNameValue>();
        }
        return this.detail;
    }

    /**
     * Gets the value of the segment property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the segment property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getSegment().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExerciseSegment }
     *
     *
     */
    public List<ExerciseSegment> getSegment() {
        if (segment == null) {
            segment = new ArrayList<ExerciseSegment>();
        }
        return this.segment;
    }

    @Override
    public String getThingType() {
        return typeId;
    }
}
