package com.zephyrs.android.onefriend;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.CombinedChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.CombinedData;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;

import java.util.ArrayList;

/**
 * Created by Barry on 4/9/17.
 */

public class ReportPage extends AppCompatActivity implements OnChartValueSelectedListener, View.OnClickListener{
    Button back;
    private BarChart mBarChart;
    private CombinedChart mChart;
    float ms1;
    float ms2;
    float ms3;
    float ms4;
    float ms5;
    float ms6;
    float reduce;
    float getscore;
    float level;
    TextView sleep;
    TextView exercise;
    TextView meditation;
    TextView social;
    TextView water;
    TextView hobby;
    ImageButton yesterday;
    ImageButton today;
    float gettoday;
    float getyesterday;
    ImageButton current;
    protected String[] mMonths = new String[] {" ","Mon", "Tue", "Wed", "Thu", "Fri", "Sat","Sun"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.report_page);
        back = (Button) findViewById(R.id.back_button);
//        mBarChart = (BarChart) findViewById(R.id.chart1);
        mChart = (CombinedChart) findViewById(R.id.chart12);
        sleep = (TextView) findViewById(R.id.sleep_record);
        meditation = (TextView) findViewById(R.id.meditation_record);
        social = (TextView) findViewById(R.id.social_record);
        water = (TextView) findViewById(R.id.water_record);
        exercise = (TextView) findViewById(R.id.exercise_record);
        hobby = (TextView) findViewById(R.id.hobby_record);
        yesterday = (ImageButton) findViewById(R.id.head1);
        today = (ImageButton) findViewById(R.id.head2);
        current = (ImageButton) findViewById(R.id.head3);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent testintent = new Intent(getBaseContext(), BottomBar.class);
                startActivity(testintent);
                overridePendingTransition(R.anim.fade, R.anim.hold);
            }
        });


        SharedPreferences settings = this.getSharedPreferences("score", 0);
        getscore = Integer.valueOf(settings.getString("stress_head","0"));
        gettoday = Integer.valueOf(settings.getString("stress_today","0"));
        getyesterday = 13;
        ms1 = Integer.valueOf(settings.getString("seekbar1","0"));
        ms2 = Integer.valueOf(settings.getString("seekbar2","0"));
        ms3 = Integer.valueOf(settings.getString("seekbar3","0"));
        ms4 = Integer.valueOf(settings.getString("seekbar4","0"));
        ms5 = Integer.valueOf(settings.getString("seekbar5","0"));
        ms6 = Integer.valueOf(settings.getString("seekbar6","0"));
        reduce = Integer.valueOf(settings.getString("stress_reduce","0"));
        checkchangehead();

        checkheadtoday();
        checkheadcurrent();
        checkheadyesterday();
        checkdetail();



        new AsyncTask<String, Void, String>() {
                    @Override
                    protected String doInBackground(String... params) {
                        return "create successfully";
                    }

                    @Override
                    protected void onPostExecute(String courses) {
                        mChart.setDragEnabled(false);
                        mChart.setTouchEnabled(false);
                        mChart.getDescription().setText(" ");
                        mChart.setHighlightFullBarEnabled(true);
                        mChart.setDrawOrder(new CombinedChart.DrawOrder[]{
                                CombinedChart.DrawOrder.BAR,CombinedChart.DrawOrder.LINE
                        });
                        mChart.getXAxis().setDrawLabels(true);
                        Legend l = mChart.getLegend();
                        l.setWordWrapEnabled(true);
                        l.setVerticalAlignment(Legend.LegendVerticalAlignment.BOTTOM);
                        l.setHorizontalAlignment(Legend.LegendHorizontalAlignment.CENTER);
                        l.setOrientation(Legend.LegendOrientation.HORIZONTAL);
                        YAxis rightAxis = mChart.getAxisRight();
                        rightAxis.setDrawGridLines(false);
                        rightAxis.setAxisMinimum(0f); // this replaces setStartAtZero(true)
                        YAxis leftAxis = mChart.getAxisLeft();
                        leftAxis.setDrawGridLines(false);
                        leftAxis.setAxisMinimum(0f);
                        mChart.setDrawGridBackground(false);

                        XAxis xAxis = mChart.getXAxis();
                        xAxis.setAxisMinimum(0f);
                        xAxis.setGranularity(1f);
                        xAxis.setDrawGridLines(false);
                        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
                        xAxis.setValueFormatter(new IAxisValueFormatter() {
                            @Override
                            public String getFormattedValue(float value, AxisBase axis) {
                                return mMonths[(int) value % mMonths.length];
                            }
                        });
                        CombinedData data = new CombinedData();
                        data.setData(gData());
                        data.setData(generateLineData());
                        xAxis.setAxisMaximum(data.getXMax() + 0.25f);
                        mChart.setData(data);
                        mChart.getAxisRight().setEnabled(false);
                        mChart.getAxisLeft().setEnabled(false);

                        mChart.animateXY(1200, 1200);
                        mChart.invalidate();
                    }
                }.execute();
    }

    private LineData generateLineData() {

            LineData d = new LineData();

            ArrayList<Entry> entries = new ArrayList<Entry>();

        entries.add(new Entry(1, 120));
        entries.add(new Entry(2, 180));
        entries.add(new Entry(3, level));

            LineDataSet set = new LineDataSet(entries, "Stress level");
            //set.setColor(Color.rgb(240, 238, 70));
            set.setColors(Color.parseColor("#5DADE2"));
            set.setLineWidth(2.5f);
            set.setCircleColor(Color.parseColor("#76D7C4"));
            set.setCircleRadius(5f);
            set.setFillColor(Color.parseColor("#a5d079"));
            set.setMode(LineDataSet.Mode.CUBIC_BEZIER);
            set.setDrawValues(true);
            set.setValueTextSize(10f);
            set.setDrawValues(false);
            set.setValueTextColor(Color.parseColor("#f57f76"));
            set.setAxisDependency(YAxis.AxisDependency.LEFT);
            d.addDataSet(set);
            return d;
        }


    private BarData gData() {
        ArrayList<BarEntry> yVals1 = new ArrayList<BarEntry>();
            yVals1.add(new BarEntry(1, new float[]{20, 10, 0,10,0,40}));
            yVals1.add(new BarEntry(2, new float[]{20, 0, 25,0,0,0}));
            yVals1.add(new BarEntry(3, new float[]{ms1, ms2, ms3,ms4,ms5,ms6}));
        yVals1.add(new BarEntry(4, new float[]{0, 0, 0,0,0,0}));
        yVals1.add(new BarEntry(5, new float[]{0, 0, 0,0,0,0}));
        yVals1.add(new BarEntry(6, new float[]{0, 0, 0,0,0,0}));
            BarDataSet set1;
            set1 = new BarDataSet(yVals1, " ");
            ArrayList<Integer> colors = new ArrayList<Integer>();
            colors.add(Color.parseColor("#76D7C4"));
            colors.add(Color.parseColor("#ffcc65"));
            colors.add(Color.parseColor("#f57f76"));
            colors.add(Color.parseColor("#cde3f2"));
            colors.add(Color.parseColor("#a5d079"));
            colors.add(Color.parseColor("#caecea"));
            set1.setColors(colors);
            set1.setStackLabels(new String[]{"sleep", "exercise", "meditation","socializing","water","hobbies"});
            ArrayList<IBarDataSet> dataSets = new ArrayList<IBarDataSet>();
            dataSets.add(set1);
            BarData data = new BarData(dataSets);
            data.setDrawValues(false);
            data.setDrawValues(false);
            data.setValueTextColor(Color.BLACK);
            set1.setValueTextSize(10f);
            set1.setAxisDependency(YAxis.AxisDependency.LEFT);
            float barWidth = 0.8f; // x2 dataset
             data.setBarWidth(barWidth);
//            mBarChart.setData(data);
            return data;
    }

    public void checkchangehead(){
        float difference;
        difference = getscore - reduce;
        if(difference<0){
            level = 0;
        } else if(difference>0 && difference<=2){
            level = 100;
        } else if(difference>2 && difference<=4){
            level = 120;
        } else if(difference>4 && difference<=6){
            level = 140;
        } else if(difference>6 && difference<=8){
            level = 160;
        } else if(difference>8 && difference<=10){
            level = 180;
        } else if(difference>10 && difference<=12){
            level = 200;
        }
    }

    @Override
    public void onValueSelected(Entry e, Highlight h) {

    }

    @Override
    public void onNothingSelected() {

    }

    @Override
    public void onClick(View v) {

    }


    public void checkdetail() {
        if (ms1 == 0) {
            sleep.setText("Sleep:\n3 Hours or less");
        } else if (ms1 > 0 && ms1 <= 15) {
            sleep.setText("Sleep:\n4-5 Hours");
        } else if (ms1 > 15 && ms1 <= 30) {
            sleep.setText("Sleep:\n6-7 Hours");
        } else if (ms1 > 30 && ms1 <= 45) {
            sleep.setText("Sleep:\n8-9 Hours");
        } else if (ms1 > 45 && ms1 <= 60) {
            sleep.setText("Sleep:\n10 Hours or more");
        }
        if (ms2 == 0) {
            exercise.setText("Exercise:\n0 Min");
        } else if (ms2> 0 && ms2<= 15) {
            exercise.setText("Exercise:\n20 Min");

        } else if (ms2> 15 && ms2<= 30) {
            exercise.setText("Exercise:\n40 Min");

        } else if (ms2> 30 && ms2 <= 45) {
            exercise.setText("Exercise:\n60 Min");
        } else if (ms2 > 45 && ms2 <= 60) {
            exercise.setText("Exercise:\n80 Min or more");
        }


        if (ms3 == 0) {
            meditation.setText("Meditation:\n0 Min");
        } else if (ms3 > 0 && ms3<= 15) {
            meditation.setText("Meditation:\n1-5 Min");
        } else if (ms3 > 15 && ms3<= 30) {
            meditation.setText("Meditation:\n6-10 Min");
        } else if (ms3 > 30 && ms3 <= 45) {
            meditation.setText("Meditation:\n11-15 Min");
        } else if (ms3> 45 && ms3 <= 60) {
            meditation.setText("Meditation:\n16 Min or more");
        }
        if (ms4 == 0) {
            social.setText("Social:\n0 Min");
        } else if (ms4 > 0 && ms4 <= 15) {
            social.setText("Social:\n15 Min");
        } else if (ms4> 15 && ms4<= 30) {
            social.setText("Social:\n30 Min");
        } else if (ms4 > 30 && ms4 <= 45) {
            social.setText("Social:\n60 Min");
        } else if (ms4> 45 && ms4 <= 60) {
            social.setText("Social:\n90 Min or more");
        }

        if (ms5 == 0) {
            water.setText("Water:\n0 Glasses");
        } else if (ms5 > 0 && ms5 <= 15) {
            water.setText("Water:\n1-3 Glasses");
        } else if (ms5 > 15 && ms5 <= 30) {
            water.setText("Water:\n4-6 Glasses");
        } else if (ms5 > 30 && ms5 <= 45) {
            water.setText("Water:\n7-9 Glasses");
        } else if (ms5 > 45 && ms5 <= 60) {
            water.setText("Water:\n10 Glasses more");
        }
        if (ms6 == 0) {
            hobby.setText("Hobby:\n0 Min");
        } else if (ms6 > 0 && ms6 <= 15) {
            hobby.setText("Hobby:\n15 Min");
        } else if (ms6 > 15 && ms6 <= 30) {
            hobby.setText("Hobby:\n30 Min");
        } else if (ms6 > 30 && ms6<= 45) {
            hobby.setText("Hobby:\n45 Min");
        } else if (ms6 > 45 && ms6 <= 60) {
            hobby.setText("Hobby:\n60 Min or more");
        }
    }


    public void checkheadcurrent(){
        float difference;
        difference = getscore - reduce;
        if(difference<0){
            current.setImageDrawable(getResources().getDrawable(R.drawable.h7));
        } else if(difference>0 && difference<=2){
            current.setImageDrawable(getResources().getDrawable(R.drawable.h6));
        } else if(difference>2 && difference<=4){
            current.setImageDrawable(getResources().getDrawable(R.drawable.h5));
        } else if(difference>4 && difference<=6){
            current.setImageDrawable(getResources().getDrawable(R.drawable.h4));
        } else if(difference>6 && difference<=8){
            current.setImageDrawable(getResources().getDrawable(R.drawable.h3));
        } else if(difference>8 && difference<=10){
            current.setImageDrawable(getResources().getDrawable(R.drawable.h2));
        } else if(difference>10 && difference<=12){
            current.setImageDrawable(getResources().getDrawable(R.drawable.h1));
        }
    }

    public void checkheadtoday(){
        float difference;
        difference = gettoday;
        if(difference<0){
            today.setImageDrawable(getResources().getDrawable(R.drawable.h7));
        } else if(difference>0 && difference<=2){
            today.setImageDrawable(getResources().getDrawable(R.drawable.h6));
        } else if(difference>2 && difference<=4){
            today.setImageDrawable(getResources().getDrawable(R.drawable.h5));
        } else if(difference>4 && difference<=6){
            today.setImageDrawable(getResources().getDrawable(R.drawable.h4));
        } else if(difference>6 && difference<=8){
            today.setImageDrawable(getResources().getDrawable(R.drawable.h3));
        } else if(difference>8 && difference<=10){
            today.setImageDrawable(getResources().getDrawable(R.drawable.h2));
        } else if(difference>10 && difference<=12){
            today.setImageDrawable(getResources().getDrawable(R.drawable.h1));
        }
    }

    public void checkheadyesterday(){
        float difference;
        difference = getyesterday - reduce;
        if(difference<0){
            yesterday.setImageDrawable(getResources().getDrawable(R.drawable.h7));
        } else if(difference>0 && difference<=2){
            yesterday.setImageDrawable(getResources().getDrawable(R.drawable.h6));
        } else if(difference>2 && difference<=4){
            yesterday.setImageDrawable(getResources().getDrawable(R.drawable.h5));
        } else if(difference>4 && difference<=6){
            yesterday.setImageDrawable(getResources().getDrawable(R.drawable.h4));
        } else if(difference>6 && difference<=8){
            yesterday.setImageDrawable(getResources().getDrawable(R.drawable.h3));
        } else if(difference>8 && difference<=10){
            yesterday.setImageDrawable(getResources().getDrawable(R.drawable.h2));
        } else if(difference>10 && difference<=12){
            yesterday.setImageDrawable(getResources().getDrawable(R.drawable.h1));
        }
    }
}
