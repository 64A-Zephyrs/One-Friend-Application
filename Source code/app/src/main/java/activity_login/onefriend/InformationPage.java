package activity_login.onefriend;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;


/**
 * Created by Barry on 19/8/17.
 */

public class InformationPage extends Fragment {

    boolean male;

         ImageView chart;
        View vMain;
    Spinner gender;
    Spinner age;
        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle
        savedInstanceState) {
            vMain = inflater.inflate(R.layout.information_page, container, false);


             Spinner gender=(Spinner)vMain.findViewById(R.id.gender_spinner);
//              age=(Spinner)vMain.findViewById(R.id.age_spinner);
             final ImageView chartdisplay=(ImageView)vMain.findViewById(R.id.chartview);


            gender.setOnItemSelectedListener(
                    new AdapterView.OnItemSelectedListener() {
                        public void onItemSelected(AdapterView<?> parent,
                                                   View view, int position, long id) {


//if(position ==1 ){
//    chartdisplay.setImageResource(R.drawable.m16);
//} else if(position==1){
//    chartdisplay.setImageResource(R.drawable.m25);
//}
                            if(position==0){
                                chartdisplay.setImageResource(R.drawable.cmales);
                            }
                            if(position==1){
                                chartdisplay.setImageResource(R.drawable.cfemales);
                            }
                            if(position==2){
                                chartdisplay.setImageResource(R.drawable.cpersons);
                            }





//                            if (position == 0 && age.getSelectedItem().toString() == "25-35") {
//                                chartdisplay.setImageResource(R.drawable.m25);
//                            } else
//                            if (position == 1 &&age.getSelectedItem().toString() == "16-24"){
//                                chartdisplay.setImageResource(R.drawable.f16);
//                            } else
//                            if (position == 1 && age.getSelectedItem().toString() == "25-35") {
//                                chartdisplay.setImageResource(R.drawable.f25);
//                            }
                        }

                        public void onNothingSelected(AdapterView<?> parent) {
                            Toast.makeText(getActivity(),"no selecteed", Toast.LENGTH_SHORT).show();
                        }
                    });

//            age.setOnItemSelectedListener(
//                    new AdapterView.OnItemSelectedListener() {
//                        public void onItemSelected(AdapterView<?> parent,
//                                                   View view, int position, long id) {
//                            if(position==0){
//                                chartdisplay.setImageResource(R.drawable.cage1);
//                            }
//                            if(position==1){
//                                chartdisplay.setImageResource(R.drawable.cage2);
//                            }
//                            if(position==2){
//                                chartdisplay.setImageResource(R.drawable.cage3);
//                            }
////                            if(position==0){
////                                Toast.makeText(getActivity(),"16-24", Toast.LENGTH_SHORT).show();
////                            }else{
////                                Toast.makeText(getActivity(),"25-35", Toast.LENGTH_SHORT).show();
////                            }
//                        }
//                        public void onNothingSelected(AdapterView<?> parent) {
//                            Toast.makeText(getActivity(),"no selecteed", Toast.LENGTH_SHORT).show();
//                        }
//                    });






        return vMain;

    }
}
