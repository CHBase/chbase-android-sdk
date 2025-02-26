//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.14 at 10:03:33 PM PDT 
//


package com.chbase.android.simplexml.methods.querypermissions.response;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Order;

import com.chbase.android.simplexml.things.types.types.ThingTypePermission;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.methods.response.QueryPermissions" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
 *                         The element of the response that contains the method
 *                         specific return value(s).
 *                     &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.methods.response.QueryPermissions" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
 *                         All response schemas contain the info element which
 *                         contain the return value of the method. If the method
 *                         does not define an info element, the method has no
 *                         return value.
 *                     &lt;/remarks&gt;
 * </pre>
 * 
 * 
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="thing-type-permission" type="{urn:com.microsoft.wc.types}ThingTypePermission" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@Order(elements = {
    "thing-type-permission"
})
public class QueryPermissionsInfo {

    @ElementList(entry = "thing-type-permission", inline=true, required=false)
    protected ArrayList<ThingTypePermission> thingTypePermission;

    /**
     * Gets the value of the thingTypePermission property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the object.
     * This is why there is not a <CODE>set</CODE> method for the thingTypePermission property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThingTypePermission().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ThingTypePermission }
     * 
     * 
     */
    public List<ThingTypePermission> getThingTypePermission() {
        if (thingTypePermission == null) {
            thingTypePermission = new ArrayList<ThingTypePermission>();
        }
        return this.thingTypePermission;
    }
}
