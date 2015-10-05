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

package com.microsoft.hsg.android.simplexml.methods.searchvocabulary.request;

import org.simpleframework.xml.Attribute;

import com.microsoft.hsg.android.simplexml.things.types.base.ConstrainedString;

public class VocabSearchText extends ConstrainedString {
	
	@Attribute(name="search-mode", required=false)
	protected VocabMatchType matchType;
	
	public VocabSearchText(String text) {
		minLength = 1;
		maxLength = 255;
		setValue(text);
		matchType = VocabMatchType.FullText;
	}

	public VocabMatchType getMatchType() {
		return matchType;
	}

	public void setMatchType(VocabMatchType matchType) {
		this.matchType = matchType;
	}
}
