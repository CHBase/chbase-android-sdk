package com.chbase.android.simplexml.things.types.base;

public class PositiveDouble extends ConstrainedDouble {

	public PositiveDouble() {
		this(0);
	}

	public PositiveDouble(double value) {
		min = value;
		setValue(value);
	}
}