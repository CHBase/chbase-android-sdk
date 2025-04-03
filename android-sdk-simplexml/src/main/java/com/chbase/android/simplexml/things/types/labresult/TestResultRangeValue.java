package com.chbase.android.simplexml.things.types.labresult;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

@Order( elements = { "minimum-range", "maximum-range" })
@Root(name = "test-result-range-value")
public class TestResultRangeValue {
public  TestResultRangeValue(){
    minimumRange=Double.NEGATIVE_INFINITY;
    maximumRange=Double.POSITIVE_INFINITY;
}
    @Element(name = "minimum-range",required = false)
    protected Double minimumRange;
    @Element(name = "maximum-range",required = false)
    protected Double maximumRange;

    /**
     * Gets the value of the minimumRange property.
     *
     * @return possible object is {@link Double }
     *
     */
    public Double getMinimumRange() {
        return minimumRange;
    }

    /**
     * Sets the value of the minimumRange property.
     *
     * @param value
     *            allowed object is {@link Double }
     *
     */
    public void setMinimumRange(Double value) {
        this.minimumRange = value;
    }

    /**
     * Gets the value of the maximumRange property.
     *
     * @return possible object is {@link Double }
     *
     */
    public Double getMaximumRange() {
        return maximumRange;
    }

    /**
     * Sets the value of the maximumRange property.
     *
     * @param value
     *            allowed object is {@link Double }
     *
     */
    public void setMaximumRange(Double value) {
        this.maximumRange = value;
    }

}

