package activity_login.onefriend;

import android.app.Fragment;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Barry on 19/8/17.
 */

public class StressScore extends Fragment {

//    Button display;
//    Button percentage;
//    Button average;
//    Button difference;
//    Button lastscore;
//    Button program;
    View vMain1;
    Button mark1;
    Button previous1;
    Button averagemark1;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle
            savedInstanceState) {
        vMain1 = inflater.inflate(R.layout.stress_score, container, false);

//        display = (Button) vMain.findViewById(R.id.stress_display);
//        percentage = (Button) vMain.findViewById(R.id.stress_percentage);
//        average = (Button) vMain.findViewById(R.id.stress_average);
//        difference = (Button) vMain.findViewById(R.id.stress_difference);
//        lastscore = (Button) vMain.findViewById(R.id.stress_last_score);
//        program = (Button) vMain.findViewById(R.id.stress_program);
        mark1 = (Button) vMain1.findViewById(R.id.mark_pss);
        previous1 = (Button) vMain1.findViewById(R.id.previous_pss);
        averagemark1 = (Button) vMain1.findViewById(R.id.averagemark_pss);

        SharedPreferences settings = this.getActivity().getSharedPreferences("ss", 0);
        String getscore = settings.getString("stress_score","0");
        String getpercentage = settings.getString("stress_percentage","0");
        String getaverage = settings.getString("stress_average","0");
        String getdifference = settings.getString("stress_difference","0");
        String getlastscore = settings.getString("stress_lastscore","0");

        if(Integer.valueOf(getscore)>=18){
            mark1.setTextColor(Color.parseColor("#E74C3C"));
        } else{
            mark1.setTextColor(Color.parseColor("#82E0AA"));
        }

        mark1.setText(getscore);
        previous1.setText(getpercentage);
        averagemark1.setText(getaverage);
//        display.setText(getscore);
//        percentage.setText(getpercentage);
//        average.setText(getaverage);
//        difference.setText(getdifference);
//        lastscore.setText(getlastscore);

        return vMain1;
    }



}
