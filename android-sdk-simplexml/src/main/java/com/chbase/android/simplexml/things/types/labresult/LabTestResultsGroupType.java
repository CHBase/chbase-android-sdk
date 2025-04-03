package com.chbase.android.simplexml.things.types.labresult;

import com.chbase.android.simplexml.things.types.base.CodableValue;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Order;

import java.util.ArrayList;
import java.util.List;

@Order( elements = { "group-name", "laboratory-name", "status", "sub-groups",
        "results" })

public class LabTestResultsGroupType {

    @Element(name = "group-name", required = true)
    protected CodableValue groupName;

    @Element(name = "laboratory-name",required = false)
    protected Organization laboratoryName;

    @Element(name = "status", required = false)
    protected CodableValue status;

    @ElementList(entry = "sub-groups", inline = true, required = false)
    protected List<LabTestResultsGroupType> subGroups;

    @ElementList(entry = "results", inline = true, required = false)
    protected List<LabTestResultType> results;

    /**
     * Gets the value of the groupName property.
     *
     * @return possible object is {@link CodableValue }
     *
     */
    public CodableValue getGroupName() {
        return groupName;
    }

    /**
     * Sets the value of the groupName property.
     *
     * @param value
     *            allowed object is {@link CodableValue }
     *
     */
    public void setGroupName(CodableValue value) {
        this.groupName = value;
    }

    /**
     * Gets the value of the laboratoryName property.
     *
     * @return possible object is {@link Organization }
     *
     */
    public Organization getLaboratoryName() {
        return laboratoryName;
    }

    /**
     * Sets the value of the laboratoryName property.
     *
     * @param value
     *            allowed object is {@link Organization }
     *
     */
    public void setLaboratoryName(Organization value) {
        this.laboratoryName = value;
    }

    /**
     * Gets the value of the status property.
     *
     * @return possible object is {@link CodableValue }
     *
     */
    public CodableValue getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     *
     * @param value
     *            allowed object is {@link CodableValue }
     *
     */
    public void setStatus(CodableValue value) {
        this.status = value;
    }

    /**
     * Gets the value of the subGroups property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the subGroups property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getSubGroups().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LabTestResultsGroupType }
     *
     *
     */
    public List<LabTestResultsGroupType> getSubGroups() {
        if (subGroups == null) {
            subGroups = new ArrayList<LabTestResultsGroupType>();
        }
        return this.subGroups;
    }

    /**
     * Gets the value of the results property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the results property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getResults().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LabTestResultType }
     *
     *
     */
    public List<LabTestResultType> getResults() {
        if (results == null) {
            results = new ArrayList<LabTestResultType>();
        }
        return this.results;
    }

}
