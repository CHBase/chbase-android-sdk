package com.chbase.android.simplexml.things.types.foodanddrink;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Order;

import java.util.ArrayList;
import java.util.List;

@Order(elements = { "nutrition-fact" })
public class AdditionalNutritionFacts {

    @ElementList(entry = "nutrition-fact", required = true, inline = true)
    protected List<NutritionFact> nutritionFact;

    /**
     * Gets the value of the nutritionFact property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the nutritionFact property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getNutritionFact().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NutritionFact }
     *
     *
     */
    public List<NutritionFact> getNutritionFact() {
        if (nutritionFact == null) {
            nutritionFact = new ArrayList<NutritionFact>();
        }
        return this.nutritionFact;
    }

}
