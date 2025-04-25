package com.chbase.android.simplexml.things.types.foodanddrink;

import com.chbase.android.simplexml.things.types.base.CodableValue;
import com.chbase.android.simplexml.things.types.base.GeneralMeasurement;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;

@Order(elements = { "name", "fact" })
public class NutritionFact {

    @Element(required = true)
    protected CodableValue name;
    @Element(required = false)
    protected GeneralMeasurement fact;

    /**
     * Gets the value of the name property.
     *
     * @return possible object is {@link CodableValue }
     *
     */
    public CodableValue getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *            allowed object is {@link CodableValue }
     *
     */
    public void setName(CodableValue value) {
        this.name = value;
    }

    /**
     * Gets the value of the fact property.
     *
     * @return possible object is {@link GeneralMeasurement }
     *
     */
    public GeneralMeasurement getFact() {
        return fact;
    }

    /**
     * Sets the value of the fact property.
     *
     * @param value
     *            allowed object is {@link GeneralMeasurement }
     *
     */
    public void setFact(GeneralMeasurement value) {
        this.fact = value;
    }

}
