//package com.zephyrs.android.onefriend;
//
///**
// * Created by Barry on 5/9/17.
// */
//
//public class Record {
//}




//barchart
//                new AsyncTask<String, Void, String>() {
//                    @Override
//                    protected String doInBackground(String... params) {
//                        ArrayList<BarEntry> barEntries = new ArrayList<>();
//                        barEntries.add(new BarEntry(Frequency1, 0));
//                        barEntries.add(new BarEntry(Frequency2, 1));
//                        barEntries.add(new BarEntry(Frequency3, 2));
//                        BarDataSet barDataset = new BarDataSet(barEntries, "Project");
//                        barDataset.setValueTextSize(12f);
//
//
//                        ArrayList<Integer> colors = new ArrayList<Integer>();
//                        colors.add(Color.parseColor("#76D7C4"));
//                        colors.add(Color.parseColor("#ffcc65"));
//                        colors.add(Color.parseColor("#f57f76"));
//                        barDataset.setColors(colors);
//
//                        unitname = new ArrayList<>();
//                        unitname.add("Stress/Anxiety");
//                        unitname.add("Depression");
//                        unitname.add("Substance");
//
//
//                        ArrayList<String> theDates = new ArrayList<>();
//                        theDates.add(" ");
//                        theDates.add(" ");
//                        theDates.add(" ");
//                        theData = new BarData(theDates, barDataset);
//                        return "create successfully";
//                    }
//
//                    @Override
//                    protected void onPostExecute(String courses) {
////                        YAxis leftAxis = barChart.getAxisRight();
////                        leftAxis.setDrawGridLines(false);
//                        barChart.setDescriptionPosition(150,40);
//                        barChart.getAxisRight().setEnabled(false);
//                        barChart.getAxisLeft().setDrawLabels(true);
//                        barChart.getAxisLeft().setDrawGridLines(false);
//                        barChart.setData(theData);
//                        barChart.setTouchEnabled(true);
//                        barChart.setDragEnabled(false);
//                        barChart.animateXY(400, 800);
//                        barChart.setDescription("Population");
//                        Legend mLegend = barChart.getLegend();
//                        mLegend.setPosition(Legend.LegendPosition.BELOW_CHART_LEFT);
//                        mLegend.setForm(Legend.LegendForm.CIRCLE);
//                        mLegend.setXEntrySpace(90f);
//                        mLegend.setComputedLabels(unitname);
//                        barChart.invalidate();
//                    }
//                }.execute();





//new AsyncTask<String, Void, String>() {
//@Override
//protected String doInBackground(String... params) {
//        return "create successfully";
//        }
//
//@Override
//protected void onPostExecute(String courses) {
//        mChart.setDragEnabled(false);
//        mChart.setTouchEnabled(false);
//        mChart.getDescription().setText(" ");
//        mChart.setHighlightFullBarEnabled(true);
//        mChart.setDrawOrder(new CombinedChart.DrawOrder[]{
//        CombinedChart.DrawOrder.BAR,CombinedChart.DrawOrder.LINE
//        });
//        mChart.getXAxis().setDrawLabels(true);
//        Legend l = mChart.getLegend();
//        l.setWordWrapEnabled(true);
//        l.setVerticalAlignment(Legend.LegendVerticalAlignment.BOTTOM);
//        l.setHorizontalAlignment(Legend.LegendHorizontalAlignment.CENTER);
//        l.setOrientation(Legend.LegendOrientation.HORIZONTAL);
//        YAxis rightAxis = mChart.getAxisRight();
//        rightAxis.setDrawGridLines(false);
//        rightAxis.setAxisMinimum(0f); // this replaces setStartAtZero(true)
//
//        YAxis leftAxis = mChart.getAxisLeft();
//        leftAxis.setDrawGridLines(false);
//        leftAxis.setAxisMinimum(0f);
//
//        XAxis xAxis = mChart.getXAxis();
//        xAxis.setAxisMinimum(0f);
//        xAxis.setGranularity(1f);
//        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
//        xAxis.setValueFormatter(new IAxisValueFormatter() {
//@Override
//public String getFormattedValue(float value, AxisBase axis) {
//        return mMonths[(int) value % mMonths.length];
//        }
//        });
//        CombinedData data = new CombinedData();
//        data.setData(gData());
//        data.setData(generateLineData());
//        xAxis.setAxisMaximum(data.getXMax() + 0.25f);
//        mChart.setData(data);
//        mChart.getAxisRight().setEnabled(false);
//        mChart.animateXY(1000, 1000);
//        mChart.invalidate();
//        }
//        }.execute();
//        }
//
//private LineData generateLineData() {
//
//        LineData d = new LineData();
//
//        ArrayList<Entry> entries = new ArrayList<Entry>();
//
//        entries.add(new Entry(1, 20));
//        entries.add(new Entry(2, 21));
//        entries.add(new Entry(3, 22));
//        entries.add(new Entry(4, 23));
//        entries.add(new Entry(5, 20));
//        entries.add(new Entry(6, 18));
//
//        LineDataSet set = new LineDataSet(entries, "Stress level");
//        //set.setColor(Color.rgb(240, 238, 70));
//        set.setColors(Color.parseColor("#5DADE2"));
//        set.setLineWidth(2.5f);
//        set.setCircleColor(Color.parseColor("#76D7C4"));
//        set.setCircleRadius(5f);
//        set.setFillColor(Color.parseColor("#a5d079"));
//        set.setMode(LineDataSet.Mode.CUBIC_BEZIER);
//        set.setDrawValues(true);
//        set.setValueTextSize(10f);
//        set.setValueTextColor(Color.parseColor("#f57f76"));
//        set.setAxisDependency(YAxis.AxisDependency.LEFT);
//        d.addDataSet(set);
//        return d;
//        }
//
//
//private BarData gData() {
//        ArrayList<BarEntry> yVals1 = new ArrayList<BarEntry>();
//        yVals1.add(new BarEntry(1, new float[]{2, 3, 4,1,2,3}));
//        yVals1.add(new BarEntry(2, new float[]{4, 2, 2,4,3,1}));
//        yVals1.add(new BarEntry(3, new float[]{3, 2, 1,3,1,3}));
//        yVals1.add(new BarEntry(4, new float[]{1, 3, 3,2,5,2}));
//        yVals1.add(new BarEntry(5, new float[]{2, 3, 5,2,4,3}));
//        yVals1.add(new BarEntry(6, new float[]{3, 3, 4,2,3,4}));
//        BarDataSet set1;
//        set1 = new BarDataSet(yVals1, " ");
//        ArrayList<Integer> colors = new ArrayList<Integer>();
//        colors.add(Color.parseColor("#76D7C4"));
//        colors.add(Color.parseColor("#ffcc65"));
//        colors.add(Color.parseColor("#f57f76"));
//        colors.add(Color.parseColor("#cde3f2"));
//        colors.add(Color.parseColor("#a5d079"));
//        colors.add(Color.parseColor("#caecea"));
//        set1.setColors(colors);
//        set1.setStackLabels(new String[]{"sleep", "exercise", "meditation","socializing","water","hobbies"});
//        ArrayList<IBarDataSet> dataSets = new ArrayList<IBarDataSet>();
//        dataSets.add(set1);
//        BarData data = new BarData(dataSets);
//        data.setValueTextColor(Color.BLACK);
//        set1.setValueTextSize(10f);
//        set1.setAxisDependency(YAxis.AxisDependency.LEFT);
//        float barWidth = 0.8f; // x2 dataset
//        data.setBarWidth(barWidth);
//        mBarChart.setData(data);
//        return data;
//        }


//package com.zephyrs.android.onefriend;
//
//import android.graphics.Color;
//import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
//import android.view.View;
//import android.widget.Button;
//import android.widget.Toast;
//
//import com.github.mikephil.charting.charts.BarChart;
//import com.github.mikephil.charting.components.Legend;
//import com.github.mikephil.charting.components.XAxis;
//import com.github.mikephil.charting.components.YAxis;
//import com.github.mikephil.charting.data.BarData;
//import com.github.mikephil.charting.data.BarDataSet;
//import com.github.mikephil.charting.data.BarEntry;
//import com.github.mikephil.charting.data.Entry;
//import com.github.mikephil.charting.highlight.Highlight;
//import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
//import com.github.mikephil.charting.interfaces.datasets.IDataSet;
//import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
//import com.github.mikephil.charting.utils.ColorTemplate;
//
//import java.util.ArrayList;
//
///**
// * Created by Barry on 5/9/17.
// */
//
//public class StackedBarActivity extends AppCompatActivity implements OnChartValueSelectedListener, View.OnClickListener {
//
//    private BarChart mBarChart;
//
//    //显示顶点值
//    private Button btn_show_values;
//    //x轴动画
//    private Button btn_anim_x;
//    //y轴动画
//    private Button btn_anim_y;
//    //xy轴动画
//    private Button btn_anim_xy;
//    //保存到sd卡
//    private Button btn_save_pic;
//    //切换自动最大最小值
//    private Button btn_auto_mix_max;
//    //高亮显示
//    private Button btn_actionToggleHighlight;
//    //显示边框
//    private Button btn_show_border;
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_stackedbar);
//
//        initView();
//    }
//
//    //初始化
//    private void initView() {
//
//        //基本控件
//        btn_show_values = (Button) findViewById(R.id.btn_show_values);
//        btn_show_values.setOnClickListener(this);
//        btn_anim_x = (Button) findViewById(R.id.btn_anim_x);
//        btn_anim_x.setOnClickListener(this);
//        btn_anim_y = (Button) findViewById(R.id.btn_anim_y);
//        btn_anim_y.setOnClickListener(this);
//        btn_anim_xy = (Button) findViewById(R.id.btn_anim_xy);
//        btn_anim_xy.setOnClickListener(this);
//        btn_save_pic = (Button) findViewById(R.id.btn_save_pic);
//        btn_save_pic.setOnClickListener(this);
//        btn_auto_mix_max = (Button) findViewById(R.id.btn_auto_mix_max);
//        btn_auto_mix_max.setOnClickListener(this);
//        btn_actionToggleHighlight = (Button) findViewById(R.id.btn_actionToggleHighlight);
//        btn_actionToggleHighlight.setOnClickListener(this);
//        btn_show_border = (Button) findViewById(R.id.btn_show_border);
//        btn_show_border.setOnClickListener(this);
//
//        //堆叠条形图
//        mBarChart = (BarChart) findViewById(R.id.mBarChart);
//        mBarChart.setOnChartValueSelectedListener(this);
//        mBarChart.getDescription().setEnabled(false);
//        mBarChart.setMaxVisibleValueCount(40);
//        // 扩展现在只能分别在x轴和y轴
//        mBarChart.setPinchZoom(false);
//        mBarChart.setDrawGridBackground(false);
//        mBarChart.setDrawBarShadow(false);
//        mBarChart.setDrawValueAboveBar(false);
//        mBarChart.setHighlightFullBarEnabled(false);
//
//        // 改变y标签的位置
//        YAxis leftAxis = mBarChart.getAxisLeft();
//
//        leftAxis.setAxisMinimum(0f);
//        mBarChart.getAxisRight().setEnabled(false);
//
//        XAxis xLabels = mBarChart.getXAxis();
//        xLabels.setPosition(XAxis.XAxisPosition.TOP);
//
//        Legend l = mBarChart.getLegend();
//        l.setVerticalAlignment(Legend.LegendVerticalAlignment.BOTTOM);
//        l.setHorizontalAlignment(Legend.LegendHorizontalAlignment.RIGHT);
//        l.setOrientation(Legend.LegendOrientation.HORIZONTAL);
//        l.setDrawInside(false);
//        l.setFormSize(8f);
//        l.setFormToTextSpace(4f);
//        l.setXEntrySpace(6f);
//
//        setData();
//    }
//
//    //初始化
//    private void setData() {
//        ArrayList<BarEntry> yVals1 = new ArrayList<BarEntry>();
//
//        for (int i = 0; i < 30 + 1; i++) {
//            float mult = (50 + 1);
//            float val1 = (float) (Math.random() * mult) + mult / 3;
//            float val2 = (float) (Math.random() * mult) + mult / 3;
//            float val3 = (float) (Math.random() * mult) + mult / 3;
//            yVals1.add(new BarEntry(i, new float[]{val1, val2, val3}));
//        }
//
//        BarDataSet set1;
//
//        if (mBarChart.getData() != null &&
//                mBarChart.getData().getDataSetCount() > 0) {
//            set1 = (BarDataSet) mBarChart.getData().getDataSetByIndex(0);
//            set1.setValues(yVals1);
//            mBarChart.getData().notifyDataChanged();
//            mBarChart.notifyDataSetChanged();
//        } else {
//            set1 = new BarDataSet(yVals1, "三年级一班期末考试");
//            set1.setColors(getColors());
//            set1.setStackLabels(new String[]{"及格", "优秀", "不及格"});
//
//            ArrayList<IBarDataSet> dataSets = new ArrayList<IBarDataSet>();
//            dataSets.add(set1);
//
//            BarData data = new BarData(dataSets);
//
//            data.setValueTextColor(Color.WHITE);
//
//            mBarChart.setData(data);
//        }
//        mBarChart.setFitBars(true);
//        mBarChart.invalidate();
//    }
//
//    private int[] getColors() {
//        int stacksize = 3;
//        //有尽可能多的颜色每项堆栈值
//        int[] colors = new int[stacksize];
//        for (int i = 0; i < colors.length; i++) {
//            colors[i] = ColorTemplate.MATERIAL_COLORS[i];
//        }
//        return colors;
//    }
//
//    @Override
//    public void onValueSelected(Entry e, Highlight h) {
//
//    }
//
//    @Override
//    public void onNothingSelected() {
//
//    }
//
//    @Override
//    public void onClick(View v) {
//        switch (v.getId()) {
//            //显示顶点值
//            case R.id.btn_show_values:
//                for (IDataSet set : mBarChart.getData().getDataSets())
//                    set.setDrawValues(!set.isDrawValuesEnabled());
//
//                mBarChart.invalidate();
//                break;
//            //x轴动画
//            case R.id.btn_anim_x:
//                mBarChart.animateX(3000);
//                break;
//            //y轴动画
//            case R.id.btn_anim_y:
//                mBarChart.animateY(3000);
//                break;
//            //xy轴动画
//            case R.id.btn_anim_xy:
//                mBarChart.animateXY(3000, 3000);
//                break;
//            //保存到sd卡
//            case R.id.btn_save_pic:
//                if (mBarChart.saveToGallery("title" + System.currentTimeMillis(), 50)) {
//                    Toast.makeText(getApplicationContext(), "保存成功",
//                            Toast.LENGTH_SHORT).show();
//                } else
//                    Toast.makeText(getApplicationContext(), "保存失败",
//                            Toast.LENGTH_SHORT).show();
//                break;
//            //切换自动最大最小值
//            case R.id.btn_auto_mix_max:
//                mBarChart.setAutoScaleMinMaxEnabled(!mBarChart.isAutoScaleMinMaxEnabled());
//                mBarChart.notifyDataSetChanged();
//                break;
//            //高亮显示
//            case R.id.btn_actionToggleHighlight:
//                if (mBarChart.getData() != null) {
//                    mBarChart.getData().setHighlightEnabled(
//                            !mBarChart.getData().isHighlightEnabled());
//                    mBarChart.invalidate();
//                }
//                break;
//            //显示边框
//            case R.id.btn_show_border:
//                for (IBarDataSet set : mBarChart.getData().getDataSets())
//                    ((BarDataSet) set).setBarBorderWidth(set.getBarBorderWidth() == 1.f ? 0.f : 1.f);
//                mBarChart.invalidate();
//                break;
//        }
//    }
//}
