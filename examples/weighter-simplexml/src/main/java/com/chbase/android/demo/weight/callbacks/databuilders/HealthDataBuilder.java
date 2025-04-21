package com.chbase.android.demo.weight.callbacks.databuilders;

import com.chbase.android.simplexml.things.thing.AbstractThing;

public abstract class HealthDataBuilder<T extends AbstractThing> {
    public abstract String getTypeId();
    public  abstract  T buildItem();
    public abstract String getDisplayString(T thing);
}
