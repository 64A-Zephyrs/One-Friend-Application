package com.zephyrs.android.onefriend;

import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;

import java.text.DecimalFormat;

//
//import com.github.mikephil.charting.components.YAxis;
//import com.github.mikephil.charting.components.YAxis;
//import com.github.mikephil.charting.formatter.IFillFormatter;
//
//import java.text.DecimalFormat;
//import java.text.DecimalFormat;
//
///**
// * Created by Barry on 19/9/17.
// */
//
//public class MyYValueFormatter implements IAxisValueFormatter {
//
//    private DecimalFormat mFormat;
//
//    public MyYValueFormatter() {
//        mFormat = new DecimalFormat("###,###,###,##0");
//    }
//
//    @Override
//    public String getFormattedValue(float value, YAxis yAxis) {
//        return "￥"+mFormat.format(value);
//    }
//}
public class MyYValueFormatter implements IAxisValueFormatter {

    private DecimalFormat mFormat;

    public MyYValueFormatter() {

        // format values to 1 decimal digit
        mFormat = new DecimalFormat("###,###,##0.0");
    }

    @Override
    public String getFormattedValue(float value, AxisBase axis) {
        // "value" represents the position of the label on the axis (x or y)
        return mFormat.format(value);
    }



}