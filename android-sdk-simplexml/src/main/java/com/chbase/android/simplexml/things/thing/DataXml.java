package com.chbase.android.simplexml.things.thing;

import com.chbase.android.simplexml.things.types.advancedirectivev2.AdvanceDirectiveV2;
import com.chbase.android.simplexml.things.types.allergy.Allergy;
import com.chbase.android.simplexml.things.types.appointment.Appointment;
import com.chbase.android.simplexml.things.types.appspecific.AppSpecific;
import com.chbase.android.simplexml.things.types.asthmainhaler.AsthmaInhaler;
import com.chbase.android.simplexml.things.types.asthmainhalerusage.AsthmaInhalerUsage;
import com.chbase.android.simplexml.things.types.base.Person;
import com.chbase.android.simplexml.things.types.basicdemographic.BasicDemographic;
import com.chbase.android.simplexml.things.types.bloodglucose.BloodGlucose;
import com.chbase.android.simplexml.things.types.bloodoxygensaturation.BloodOxygenSaturation;
import com.chbase.android.simplexml.things.types.bloodpressure.BloodPressure;
import com.chbase.android.simplexml.things.types.bmi.Bmi;
import com.chbase.android.simplexml.things.types.bodydimension.BodyDimension;
import com.chbase.android.simplexml.things.types.cholesterol.Cholesterol;
import com.chbase.android.simplexml.things.types.comment.Comment;
import com.chbase.android.simplexml.things.types.concern.Concern;
import com.chbase.android.simplexml.things.types.condition.Condition;
import com.chbase.android.simplexml.things.types.dailydietaryintake.DailyDietaryIntake;
import com.chbase.android.simplexml.things.types.encounter.Encounter;
import com.chbase.android.simplexml.things.types.exercise.Exercise;
import com.chbase.android.simplexml.things.types.familyhistory.FamilyHistory;
import com.chbase.android.simplexml.things.types.file.File;
import com.chbase.android.simplexml.things.types.foodanddrink.DietaryIntake;
import com.chbase.android.simplexml.things.types.hba1c.HbA1C;
import com.chbase.android.simplexml.things.types.healthassessment.HealthAssessment;
import com.chbase.android.simplexml.things.types.height.Height;
import com.chbase.android.simplexml.things.types.immunization.Immunization;
import com.chbase.android.simplexml.things.types.insulininjection.InsulinInjection;
import com.chbase.android.simplexml.things.types.insulininjectionusage.InsulinInjectionUsage;
import com.chbase.android.simplexml.things.types.labresult.LabResult;
import com.chbase.android.simplexml.things.types.medication.Medication;
import com.chbase.android.simplexml.things.types.medicationfill.MedicationFill;
import com.chbase.android.simplexml.things.types.peakflow.PeakFlow;
import com.chbase.android.simplexml.things.types.personal.PersonalDemographics;
import com.chbase.android.simplexml.things.types.personalimage.PersonalImage;
import com.chbase.android.simplexml.things.types.procedure.Procedure;
import com.chbase.android.simplexml.things.types.referral.Referral;
import com.chbase.android.simplexml.things.types.sleepsessionv2.SleepSessionV2;
import com.chbase.android.simplexml.things.types.status.Status;
import com.chbase.android.simplexml.things.types.vitalsigns.VitalSigns;
import com.chbase.android.simplexml.things.types.weblink.Link;
import com.chbase.android.simplexml.things.types.weight.Weight;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementUnion;

/**
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:ds="http://www.w3.org/2000/09/xmldsig#" xmlns:this="urn:com.microsoft.wc.thing" xmlns:wc-auth="urn:com.microsoft.wc.auth" xmlns:wc-types="urn:com.microsoft.wc.types"/&gt;
 * </pre>
 *
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:ds="http://www.w3.org/2000/09/xmldsig#" xmlns:this="urn:com.microsoft.wc.thing" xmlns:wc-auth="urn:com.microsoft.wc.auth" xmlns:wc-types="urn:com.microsoft.wc.types"/&gt;
 * </pre>
 *
 *
 * <p>Java class for DataXml complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="DataXml">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;any/>
 *         &lt;element name="common" type="{urn:com.microsoft.wc.thing}common" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="transform" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
public class DataXml {

    @ElementUnion({
            @Element(name = "allergy", type = Allergy.class),
            @Element(name = "person", type = Person.class),
            @Element(name = "personal", type = PersonalDemographics.class),
            @Element(name = "medication", type = Medication.class),
            @Element(name = "condition", type = Condition.class),
            @Element(name = "personal-image", type = PersonalImage.class),
            @Element(name = "weight", type = Weight.class),
            @Element(name = "height", type = Height.class),
            @Element(name = "appointment", type = Appointment.class),
            @Element(name = "procedure", type = Procedure.class),
            @Element(name = "immunization", type = Immunization.class),
            @Element(name = "cholesterol-profile", type = Cholesterol.class),
            @Element(name = "file", type = File.class),
            @Element(name = "lab-test-results", type = LabResult.class),
            @Element(name = "advance-directive-v2", type = AdvanceDirectiveV2.class),
            @Element(name = "bmi", type = Bmi.class),
            @Element(name = "sleep-session-v2", type = SleepSessionV2.class),
            @Element(name = "link", type = Link.class),
            @Element(name = "status", type = Status.class),
            @Element(name = "concern", type = Concern.class),
            @Element(name = "comment", type = Comment.class),
            @Element(name = "encounter", type = Encounter.class),
            @Element(name = "blood-pressure", type = BloodPressure.class),
            @Element(name = "body-dimension", type = BodyDimension.class),
            @Element(name = "insulin-injection", type = InsulinInjection.class),
            @Element(name = "blood-glucose", type = BloodGlucose.class),
            @Element(name = "blood-oxygen-saturation", type = BloodOxygenSaturation.class),
            @Element(name = "diabetes-insulin-injection-use", type = InsulinInjectionUsage.class),
            @Element(name = "health-assessment", type = HealthAssessment.class),
            @Element(name = "HbA1C", type = HbA1C.class),
            @Element(name = "peak-flow", type = PeakFlow.class),
            @Element(name = "vital-signs", type = VitalSigns.class),
            @Element(name = "referral", type = Referral.class),
            @Element(name = "dietary-intake-daily", type = DailyDietaryIntake.class),
            @Element(name = "medication-fill", type = MedicationFill.class),
            @Element(name = "asthma-inhaler", type = AsthmaInhaler.class),
            @Element(name = "asthma-inhaler-use", type = AsthmaInhalerUsage.class),
            @Element(name = "app-specific", type = AppSpecific.class),
            @Element(name = "exercise", type = Exercise.class),
            @Element(name = "family-history", type = FamilyHistory.class),
            @Element(name = "dietary-intake", type = DietaryIntake.class),
            @Element(name = "basic", type = BasicDemographic.class),
    })
    protected AbstractThing any;

    @Element(required = false)
    protected Common common;

    @Attribute(required = false)
    protected String transform;

    /**
     * Gets the value of the any property.
     *
     * @return possible object is
     * {@link Element }
     */
    public AbstractThing getAny() {
        return any;
    }

    /**
     * Sets the value of the any property.
     *
     * @param value allowed object is
     *              {@link Element }
     */
    public void setAny(AbstractThing value) {
        this.any = value;
    }

    /**
     * Gets the value of the common property.
     *
     * @return possible object is
     * {@link Common }
     */
    public Common getCommon() {
        return common;
    }

    /**
     * Sets the value of the common property.
     *
     * @param value allowed object is
     *              {@link Common }
     */
    public void setCommon(Common value) {
        this.common = value;
    }

    /**
     * Gets the value of the transform property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTransform() {
        return transform;
    }

    /**
     * Sets the value of the transform property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTransform(String value) {
        this.transform = value;
    }

}
