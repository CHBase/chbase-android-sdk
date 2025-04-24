package com.chbase.android.demo.weight.callbacks.databuilders;
import com.chbase.android.simplexml.things.types.base.CodableValue;
import com.chbase.android.simplexml.things.types.dates.ApproxDate;
import com.chbase.android.simplexml.things.types.dates.ApproxDateTime;
import com.chbase.android.simplexml.things.types.dates.DateTime;
import com.chbase.android.simplexml.things.types.dates.StructuredApproxDate;
import com.chbase.android.simplexml.things.types.dates.Time;
import com.chbase.android.simplexml.things.types.labresult.Organization;
import com.chbase.android.simplexml.things.types.medicationfill.MedicationFill;

import java.util.Calendar;


public class MedicationFillBuilder extends HealthDataBuilder<MedicationFill>  {

    @Override
    public String getTypeId() {
        return MedicationFill.typeId;
    }

    @Override
    public MedicationFill buildItem() {
        MedicationFill item = new MedicationFill();

        item.setName(new CodableValue("phenazopyridine hydrochloride"));

        DateTime dt = DateTime.fromCalendar(Calendar.getInstance());
        ApproxDateTime approxDt= new ApproxDateTime();

        StructuredApproxDate structuredApproxDate= new StructuredApproxDate();

        ApproxDate approxDate= new ApproxDate();
        approxDate.setD(dt.getDate().getD());
        approxDate.setM(dt.getDate().getM());
        approxDate.setY(dt.getDate().getY());

        Time time = new Time();
        time.setH(dt.getTime().getH());
        time.setM(dt.getTime().getM());
        time.setS(dt.getTime().getS());

        structuredApproxDate.setDate(approxDate);
        structuredApproxDate.setTime(time);

        approxDt.setStructured(structuredApproxDate);

        item.setDateFilled(approxDt);
        item.setDaysSupply(12);
        item.setNextRefillDate(dt.getDate());
        item.setRefillsLeft(1);
        Organization org = new Organization();
        org.setName("Inter lake pharmacy");
        item.setPharmacy(org);
        item.setPrescriptionNumber("1234");
        item.setLotNumber("1234");

        return item;
    }

    @Override
    public String getDisplayString(MedicationFill item) {
        String dt = item.getDateFilled().getStructured().getDate().getY()
                +"-"+item.getDateFilled().getStructured().getDate().getM()
                +"-"+item.getDateFilled().getStructured().getDate().getD()
                +"T"+item.getDateFilled().getStructured().getTime().getH()
                +":"+item.getDateFilled().getStructured().getTime().getM()
                +":"+item.getDateFilled().getStructured().getTime().getS();
        return item.getName().getText()+" datefilled: "+dt+", days supply:"+item.getDaysSupply()+", refills left: "+item.getRefillsLeft()+", pharmacy:"+item.getPharmacy().getName();
    }
}
