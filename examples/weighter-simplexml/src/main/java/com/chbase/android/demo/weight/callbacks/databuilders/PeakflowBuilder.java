package com.chbase.android.demo.weight.callbacks.databuilders;
import com.chbase.android.simplexml.things.types.base.CodableValue;
import com.chbase.android.simplexml.things.types.base.DisplayValue;
import com.chbase.android.simplexml.things.types.dates.ApproxDate;
import com.chbase.android.simplexml.things.types.dates.ApproxDateTime;
import com.chbase.android.simplexml.things.types.dates.DateTime;
import com.chbase.android.simplexml.things.types.dates.StructuredApproxDate;
import com.chbase.android.simplexml.things.types.dates.Time;
import com.chbase.android.simplexml.things.types.peakflow.FlowValue;
import com.chbase.android.simplexml.things.types.peakflow.PeakFlow;
import com.chbase.android.simplexml.things.types.peakflow.VolumeValue;

import java.util.Calendar;


public class PeakflowBuilder extends HealthDataBuilder<PeakFlow>  {

    @Override
    public String getTypeId() {
        return PeakFlow.typeId;
    }

    @Override
    public PeakFlow buildItem() {
        PeakFlow item = new PeakFlow();
        ApproxDateTime approxDt= new ApproxDateTime();
        DateTime dt = DateTime.fromCalendar(Calendar.getInstance());
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

        item.setWhen(approxDt);

        FlowValue pef =new FlowValue();
        pef.setLitersPerSecond(9.9);
        DisplayValue displayValue= new DisplayValue();
        displayValue.setText("9.9 L/s");
        displayValue.setUnits("L/s");
        pef.setDisplay(displayValue);
        item.setPef(pef);

        VolumeValue fev1 =new VolumeValue();
        fev1.setLiters(4.01);
        displayValue= new DisplayValue();
        displayValue.setText("4.01 L");
        displayValue.setUnits("L");
        fev1.setDisplay(displayValue);
        item.setFev1(fev1);

        VolumeValue fev6 =new VolumeValue();
        fev6.setLiters(4.01);
        displayValue= new DisplayValue();
        displayValue.setText("4.01 L");
        displayValue.setUnits("L");
        fev6.setDisplay(displayValue);

        item.setFev6(fev6);

        return item;
    }

    @Override
    public String getDisplayString(PeakFlow item) {
        String dt = item.getWhen().getStructured().getDate().getY()
                +"-"+item.getWhen().getStructured().getDate().getM()
                +"-"+item.getWhen().getStructured().getDate().getD()
                +"T"+item.getWhen().getStructured().getTime().getH()
                +":"+item.getWhen().getStructured().getTime().getM()
                +":"+item.getWhen().getStructured().getTime().getS();
        return dt+", PEF:"+item.getPef().getDisplay().getText()+", FEV1:"+item.getFev1().getDisplay().getText()+", FEV6:"+item.getFev6().getDisplay().getText();
    }
}
