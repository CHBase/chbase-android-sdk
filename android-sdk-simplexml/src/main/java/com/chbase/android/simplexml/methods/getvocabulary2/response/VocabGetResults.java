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
package com.chbase.android.simplexml.methods.getvocabulary2.response;

import java.util.ArrayList;

import org.simpleframework.xml.ElementList;

public class VocabGetResults {

	@ElementList(entry = "vocabulary", inline=true)
	protected ArrayList<VocabCodeSet> vocabs;

	public ArrayList<VocabCodeSet> getVocabs() {
		return vocabs;
	}

	public void setVocabs(ArrayList<VocabCodeSet> vocabs) {
		this.vocabs = vocabs;
	}
	
	public Boolean HasVocabs()
	{
		return !(vocabs == null || vocabs.isEmpty()); 
	}
}
