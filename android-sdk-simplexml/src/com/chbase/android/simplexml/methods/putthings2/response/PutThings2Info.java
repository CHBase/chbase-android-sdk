//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.11.03 at 08:21:34 PM PST 
//


package com.chbase.android.simplexml.methods.putthings2.response;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Order;

import com.chbase.android.simplexml.things.thing.ThingKey;



/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="thing-id" type="{urn:com.microsoft.wc.thing}ThingKey" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@Order(elements = {
	    "thing-id"
	})
public class PutThings2Info {

	@ElementList(required=false, inline = true, entry="thing-id")
    protected ArrayList<ThingKey> thingId;

    /**
     * Gets the value of the thingId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the object.
     * This is why there is not a <CODE>set</CODE> method for the thingId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThingId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ThingKey }
     * 
     * 
     */
    public List<ThingKey> getThingId() {
        if (thingId == null) {
            thingId = new ArrayList<ThingKey>();
        }
        return this.thingId;
    }

}
