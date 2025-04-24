package com.chbase.android.simplexml.things.types.base;

public class EmailAddress extends ConstrainedString {
	public EmailAddress(){}
	
	public EmailAddress(String value) {
		minLength = 6;
		maxLength = 128;
		setValue(value);
	}
}
