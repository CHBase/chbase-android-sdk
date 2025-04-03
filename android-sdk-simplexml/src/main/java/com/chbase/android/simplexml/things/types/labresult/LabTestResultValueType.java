package com.chbase.android.simplexml.things.types.labresult;

import com.chbase.android.simplexml.things.types.base.CodableValue;
import com.chbase.android.simplexml.things.types.base.GeneralMeasurement;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

@Order( elements = { "measurement", "ranges", "flag" })

public class LabTestResultValueType {

    @Element(required = true)
    protected GeneralMeasurement measurement;
    @ElementList(entry = "ranges", inline = true,required = false)
    protected ArrayList<TestResultRange> ranges;
    @ElementList(entry = "flag", inline = true,required = false)
    protected ArrayList<CodableValue> flag;

    /**
     * Gets the value of the measurement property.
     *
     * @return possible object is {@link GeneralMeasurement }
     *
     */
    public GeneralMeasurement getMeasurement() {
        return measurement;
    }

    /**
     * Sets the value of the measurement property.
     *
     * @param value
     *            allowed object is {@link GeneralMeasurement }
     *
     */
    public void setMeasurement(GeneralMeasurement value) {
        this.measurement = value;
    }

    /**
     * Gets the value of the ranges property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the ranges property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getRanges().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestResultRange }
     *
     *
     */
    public List<TestResultRange> getRanges() {
        if (ranges == null) {
            ranges = new ArrayList<TestResultRange>();
        }
        return this.ranges;
    }

    /**
     * Gets the value of the flag property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the flag property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getFlag().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodableValue }
     *
     *
     */
    public List<CodableValue> getFlag() {
        if (flag == null) {
            flag = new ArrayList<CodableValue>();
        }
        return this.flag;
    }

}
