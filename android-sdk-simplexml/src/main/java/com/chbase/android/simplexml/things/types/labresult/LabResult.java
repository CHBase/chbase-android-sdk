/*
 * Copyright 2011 Microsoft Corp.
 * 
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.chbase.android.simplexml.things.types.labresult;

import com.chbase.android.simplexml.things.thing.AbstractThing;
import com.chbase.android.simplexml.things.types.base.ConcentrationValue;
import com.chbase.android.simplexml.things.types.dates.ApproxDate;
import com.chbase.android.simplexml.things.types.dates.ApproxDateTime;
import com.chbase.android.simplexml.things.types.dates.DateTime;
import com.chbase.android.simplexml.things.types.dates.StructuredApproxDate;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

@Order(elements = { "when", "lab-group", "ordered-by" })
@Root(name = "lab-test-results")
public class LabResult  extends AbstractThing {

	public  LabResult(){
		ApproxDate dt  = new ApproxDate();
		dt.setD(01);
		dt.setM(01);
		dt.setY(2024);
		setWhen(new ApproxDateTime(new StructuredApproxDate(dt)));
	}
	public static String typeId = "5800eab5-a8c2-482a-a4d6-f1db25ae08c3";
	@Element(name = "when", required = true)
	protected ApproxDateTime when;

	@ElementList(required=true, inline=true, entry="lab-group")
	protected ArrayList<LabTestResultsGroupType> labGroup;

	@Element(name = "ordered-by", required = false)
	protected Organization orderedBy;

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
	 * Gets the value of the labGroup property.
	 *
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the labGroup property.
	 *
	 * <p>
	 * For example, to add a new item, do as follows:
	 *
	 * <pre>
	 * getLabGroup().add(newItem);
	 * </pre>
	 *
	 *
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link LabTestResultsGroupType }
	 *
	 *
	 */
	public ArrayList<LabTestResultsGroupType> getLabGroup() {
		if (labGroup == null) {
			labGroup = new ArrayList<LabTestResultsGroupType>();
		}
		return this.labGroup;
	}

	/**
	 * Gets the value of the orderedBy property.
	 *
	 * @return possible object is {@link Organization }
	 *
	 */
	public Organization getOrderedBy() {
		return orderedBy;
	}

	/**
	 * Sets the value of the orderedBy property.
	 *
	 * @param value
	 *            allowed object is {@link Organization }
	 *
	 */
	public void setOrderedBy(Organization value) {
		this.orderedBy = value;
	}

	@Override
	public String getThingType() {
		return typeId;
	}
}
