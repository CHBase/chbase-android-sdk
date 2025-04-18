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
package com.chbase.android.simplexml.vocabs.types;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementUnion;

import com.chbase.android.simplexml.things.types.base.LabTestResultsData;
import com.chbase.android.simplexml.things.types.base.NutritionInformation;
import com.chbase.android.simplexml.things.types.base.UnitConversions;

public class VocabData {
	
	@ElementUnion({
	       @Element(name=NutritionInformation.RootElement, type=NutritionInformation.class),
	       @Element(name=UnitConversions.RootElement, type=UnitConversions.class),
	       @Element(name=LabTestResultsData.RootElement, type=LabTestResultsData.class),
	    })
	protected Object typed;
	
	public Boolean hasTyped()
	{
		return typed != null;
	}

	public Object getTyped() {
		return typed;
	}

	public void setTyped(Object typed) {
		this.typed = typed;
	}

	public VocabData(Object typed) {
		this.typed = typed;
	}
	
	public VocabData() {
	}
}
