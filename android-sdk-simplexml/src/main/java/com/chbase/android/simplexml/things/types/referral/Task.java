package com.chbase.android.simplexml.things.types.referral;

import com.chbase.android.simplexml.things.types.base.CodableValue;
import com.chbase.android.simplexml.things.types.base.Person;
import com.chbase.android.simplexml.things.types.dates.DateTime;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;

@Order(elements = { "business-status", "task-reason", "created-date", "updated-date", "completed-date", "status-reason", "owner", "note"})
public class Task {
    @Element(name = "business-status", required = false)
    protected CodableValue businessStatus;
    @Element(name = "task-reason", required = false)
    protected CodableValue taskReason;
    @Element(name = "created-date", required = false)
    protected DateTime createdDate;
    @Element(name = "updated-date", required = false)
    protected DateTime updatedDate;
    @Element(name = "completed-date", required = false)
    protected DateTime completedDate;
    @Element(name = "status-reason", required = false)
    protected CodableValue statusReason;
    @Element( required = false)
    protected Person owner;
    @Element( required = false)
    protected String note;

    /**
     * Gets the value of the businessStatus property.
     *
     * @return possible object is {@link CodableValue }
     *
     */
    public CodableValue getbusinessStatus() {
        return businessStatus;
    }

    /**
     * Sets the value of the businessStatus property.
     *
     * @param value
     *            allowed object is {@link CodableValue }
     *
     */
    public void setBusinessStatus(CodableValue value) {
        this.businessStatus = value;
    }

    /**
     * Gets the value of the taskReason property.
     *
     * @return possible object is {@link CodableValue }
     *
     */
    public CodableValue getTaskReason() {
        return taskReason;
    }

    /**
     * Sets the value of the taskReason property.
     *
     * @param value
     *            allowed object is {@link CodableValue }
     *
     */
    public void setTaskReason(CodableValue value) {
        this.taskReason = value;
    }

    /**
     * Gets the value of the createdDate property.
     *
     * @return possible object is {@link DateTime }
     *
     */
    public DateTime getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     *
     * @param value
     *            allowed object is {@link DateTime }
     *
     */
    public void setCreatedDate(DateTime value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the updatedDate property.
     *
     * @return possible object is {@link DateTime }
     *
     */
    public DateTime getUpdatedDate() {
        return updatedDate;
    }

    /**
     * Sets the value of the updatedDate property.
     *
     * @param value
     *            allowed object is {@link DateTime }
     *
     */
    public void setUpdatedDate(DateTime value) {
        this.updatedDate = value;
    }

    /**
     * Gets the value of the completedDate property.
     *
     * @return possible object is {@link DateTime }
     *
     */
    public DateTime getCompletedDate() {
        return completedDate;
    }

    /**
     * Sets the value of the completedDate property.
     *
     * @param value
     *            allowed object is {@link DateTime }
     *
     */
    public void setCompletedDate(DateTime value) {
        this.completedDate = value;
    }

    /**
     * Gets the value of the statusReason property.
     *
     * @return possible object is {@link CodableValue }
     *
     */
    public CodableValue getStatusReason() {
        return statusReason;
    }

    /**
     * Sets the value of the statusReason property.
     *
     * @param value
     *            allowed object is {@link CodableValue }
     *
     */
    public void setStatusReason(CodableValue value) {
        this.statusReason = value;
    }

    /**
     * Gets the value of the owner property.
     *
     * @return possible object is {@link Person }
     *
     */
    public Person getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     *
     * @param value
     *            allowed object is {@link Person }
     *
     */
    public void setOwner(Person value) {
        this.owner = value;
    }

    /**
     * Gets the value of the note property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setNote(String value) {
        this.note = value;
    }

}
