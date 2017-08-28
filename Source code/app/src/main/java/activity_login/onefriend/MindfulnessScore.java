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
 * Created by Barry on 18/8/17.
 */

public class MindfulnessScore extends Fragment {


    Button mark;
    Button previous;
    Button averagemark;
    View vMain;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle
            savedInstanceState) {
        vMain = inflater.inflate(R.layout.mindfulness_score, container, false);

        mark = (Button) vMain.findViewById(R.id.mark_fmi);
        previous = (Button) vMain.findViewById(R.id.previous_fmi);
        averagemark = (Button) vMain.findViewById(R.id.averagemark_fmi);


        SharedPreferences settings = this.getActivity().getSharedPreferences("setting", 0);
        String getscore = settings.getString("mind_score","0");
        String getpercentage = settings.getString("mind_percentage","0");
        String getaverage = settings.getString("mind_average","0");
        String getdifference = settings.getString("mind_difference","0");
        String getlastscore = settings.getString("mind_lastscore","0");


        if(Integer.valueOf(getscore)<=18){
            mark.setTextColor(Color.parseColor("#E74C3C"));
        } else{
            mark.setTextColor(Color.parseColor("#82E0AA"));
        }
        mark.setText(getscore);
        previous.setText(getpercentage);
        averagemark.setText(getaverage);
        return vMain;
    }

}
