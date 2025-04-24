package com.chbase.android.simplexml.things.types.referral;

import com.chbase.android.simplexml.things.thing.AbstractThing;
import com.chbase.android.simplexml.things.types.base.CodableValue;
import com.chbase.android.simplexml.things.types.base.Person;
import com.chbase.android.simplexml.things.types.dates.DateTime;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

@Order(elements = { "when", "type", "reason", "referred-by", "task", "referred-to" })
@Root(name = "referral")
public class Referral extends AbstractThing {
    public static String typeId = "B861CB93-9CD3-408A-9C65-E5F58E4E2C30";
    @Element(required = false)
    protected DateTime when;
    @Element(required = false)
    protected CodableValue type;
    @Element(required = true)
    protected CodableValue reason;
    @Element(name = "referred-by",required = false)
    protected Person referredBy;
    @ElementList(entry = "task", inline = true, required = false )
    protected List<Task> task;
    @Element(name = "referred-to", required = false)
    protected Person referredTo;

    /**
     * Gets the value of the whaen property.
     *
     * @return possible object is {@link DateTime }
     *
     */
    public DateTime getWhen() {
        return when;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *            allowed object is {@link DateTime }
     *
     */
    public void setWhen(DateTime value) {
        this.when = value;
    }

    /**
     * Gets the value of the type property.
     *
     * @return possible object is {@link CodableValue }
     *
     */
    public CodableValue getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value
     *            allowed object is {@link CodableValue }
     *
     */
    public void setType(CodableValue value) {
        this.type = value;
    }

    /**
     * Gets the value of the reason property.
     *
     * @return possible object is {@link CodableValue }
     *
     */
    public CodableValue getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     *
     * @param value
     *            allowed object is {@link CodableValue }
     *
     */
    public void setReason(CodableValue value) {
        this.reason = value;
    }

    /**
     * Gets the value of the referredBy property.
     *
     * @return possible object is {@link Person }
     *
     */
    public Person getReferredBy() {
        return referredBy;
    }

    /**
     * Sets the value of the referredBy property.
     *
     * @param value
     *            allowed object is {@link Person }
     *
     */
    public void setReferredBy(Person value) {
        this.referredBy = value;
    }

    /**
     * Gets the value of the tasks property.
     *
     * @return possible object is {@link Task }
     *
     */
    public List<Task> getTasks() {
        if (this.task == null) {
            this.task = new ArrayList<Task>();
        }
        return this.task;
    }

    /**
     * Sets the value of the tasks property.
     *
     * @param tasks
     *            allowed object is {@link Task }
     *
     */
    public void setTasks(List<Task> tasks) {
        this.task = tasks;
    }

    /**
     * Gets the value of the referredTo property.
     *
     * @return possible object is {@link Person }
     *
     */
    public Person getReferredTo() {
        return referredTo;
    }

    /**
     * Sets the value of the referredTo property.
     *
     * @param value
     *            allowed object is {@link Person }
     *
     */
    public void setReferredTo(Person value) {
        this.referredTo = value;
    }

    @Override
    public String getThingType() {
        return typeId;
    }
}
