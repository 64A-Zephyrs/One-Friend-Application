package activity_login.onefriend;

import android.app.Fragment;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;

/**
 * Created by Barry on 15/8/17.
 */

public class MindfulnessTest extends Fragment implements View.OnClickListener{
    ViewFlipper viewFlipper;
    Button next;
    Button previous;
    RadioButton radioButton1;
    RadioButton radioButton2;
    RadioButton radioButton3;
    RadioButton radioButton4;
    RadioButton radioButton5;
    RadioButton radioButton6;
    RadioButton radioButton7;
    RadioButton radioButton8;
    RadioButton radioButton9;
    RadioButton radioButton10;
    RadioButton radioButton11;
    RadioButton radioButton12;
    RadioButton radioButton13;
    RadioButton radioButton14;
    RadioButton radioButton15;
    RadioButton radioButton16;
    RadioButton radioButton17;
    RadioButton radioButton18;
    RadioButton radioButton19;
    RadioButton radioButton20;
    RadioButton radioButton21;
    RadioButton radioButton22;
    RadioButton radioButton23;
    RadioButton radioButton24;
    RadioButton radioButton25;
    RadioButton radioButton26;
    RadioButton radioButton27;
    RadioButton radioButton28;
    RadioButton radioButton29;
    RadioButton radioButton30;
    RadioButton radioButton31;
    RadioButton radioButton32;
    RadioButton radioButton33;
    RadioButton radioButton34;
    RadioButton radioButton35;
    RadioButton radioButton36;
    RadioButton radioButton37;
    RadioButton radioButton38;
    RadioButton radioButton39;
    RadioButton radioButton40;
    RadioGroup radioGroup10;
    RadioGroup radioGroup9;
    RadioGroup radioGroup8;
    RadioGroup radioGroup7;
    RadioGroup radioGroup6;
    RadioGroup radioGroup5;
    RadioGroup radioGroup4;
    RadioGroup radioGroup3;
    RadioGroup radioGroup2;
    RadioGroup radioGroup1;

    Button numberbutton;
    TextView que;
    Integer score;
    Integer percentage;
    Integer average;
    Integer difference;
    Integer lastscore;
    Integer n;
    View vMain;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle
            savedInstanceState) {
        vMain = inflater.inflate(R.layout.mindfulness_test, container, false);

//        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
//        if(actionBar != null){
//            actionBar.setHomeButtonEnabled(true);
//            actionBar.setDisplayHomeAsUpEnabled(true);
//        }

        viewFlipper = (ViewFlipper)vMain.findViewById(R.id.mind_viewFlipper);
        viewFlipper.isAutoStart();
        next = (Button)vMain.findViewById(R.id.next);
        previous = (Button) vMain.findViewById(R.id.previous);
        numberbutton = (Button) vMain.findViewById(R.id.numberbutton1);
        radioGroup1 = (RadioGroup) vMain.findViewById(R.id.radiogroup1);
        radioGroup2 = (RadioGroup) vMain.findViewById(R.id.radiogroup2);
        radioGroup3 = (RadioGroup) vMain.findViewById(R.id.radiogroup3);
        radioGroup4 = (RadioGroup) vMain.findViewById(R.id.radiogroup4);
        radioGroup5 = (RadioGroup) vMain.findViewById(R.id.radiogroup5);
        radioGroup6 = (RadioGroup) vMain.findViewById(R.id.radiogroup6);
        radioGroup7 = (RadioGroup) vMain.findViewById(R.id.radiogroup7);
        radioGroup8 = (RadioGroup) vMain.findViewById(R.id.radiogroup8);
        radioGroup9 = (RadioGroup) vMain.findViewById(R.id.radiogroup9);
        radioGroup10 = (RadioGroup) vMain.findViewById(R.id.radiogroup10);
        radioButton1 = (RadioButton) vMain.findViewById(R.id.radioButton1);
        radioButton2 = (RadioButton) vMain.findViewById(R.id.radioButton2);
        radioButton3 = (RadioButton) vMain.findViewById(R.id.radioButton3);
        radioButton4 = (RadioButton) vMain.findViewById(R.id.radioButton4);
        radioButton5 = (RadioButton) vMain.findViewById(R.id.radioButton5);
        radioButton6 = (RadioButton) vMain.findViewById(R.id.radioButton6);
        radioButton7 = (RadioButton) vMain.findViewById(R.id.radioButton7);
        radioButton8 = (RadioButton) vMain.findViewById(R.id.radioButton8);
        radioButton9 = (RadioButton) vMain.findViewById(R.id.radioButton9);
        radioButton10 = (RadioButton) vMain.findViewById(R.id.radioButton10);
        radioButton11 = (RadioButton) vMain.findViewById(R.id.radioButton11);
        radioButton12 = (RadioButton) vMain.findViewById(R.id.radioButton12);
        radioButton13 = (RadioButton) vMain.findViewById(R.id.radioButton13);
        radioButton14 = (RadioButton) vMain.findViewById(R.id.radioButton14);
        radioButton15 = (RadioButton) vMain.findViewById(R.id.radioButton15);
        radioButton16 = (RadioButton) vMain.findViewById(R.id.radioButton16);
        radioButton17 = (RadioButton) vMain.findViewById(R.id.radioButton17);
        radioButton18 = (RadioButton) vMain.findViewById(R.id.radioButton18);
        radioButton19 = (RadioButton) vMain.findViewById(R.id.radioButton19);
        radioButton20 = (RadioButton) vMain.findViewById(R.id.radioButton20);
        radioButton21 = (RadioButton) vMain.findViewById(R.id.radioButton21);
        radioButton22 = (RadioButton) vMain.findViewById(R.id.radioButton22);
        radioButton23 = (RadioButton) vMain.findViewById(R.id.radioButton23);
        radioButton24 = (RadioButton) vMain.findViewById(R.id.radioButton24);
        radioButton25 = (RadioButton) vMain.findViewById(R.id.radioButton25);
        radioButton26 = (RadioButton) vMain.findViewById(R.id.radioButton26);
        radioButton27 = (RadioButton) vMain.findViewById(R.id.radioButton27);
        radioButton28 = (RadioButton) vMain.findViewById(R.id.radioButton28);
        radioButton29 = (RadioButton) vMain.findViewById(R.id.radioButton29);
        radioButton30 = (RadioButton) vMain.findViewById(R.id.radioButton30);
        radioButton31 = (RadioButton) vMain.findViewById(R.id.radioButton31);
        radioButton32 = (RadioButton) vMain.findViewById(R.id.radioButton32);
        radioButton33 = (RadioButton) vMain.findViewById(R.id.radioButton33);
        radioButton34 = (RadioButton) vMain.findViewById(R.id.radioButton34);
        radioButton35 = (RadioButton) vMain.findViewById(R.id.radioButton35);
        radioButton36 = (RadioButton) vMain.findViewById(R.id.radioButton36);
        radioButton37 = (RadioButton) vMain.findViewById(R.id.radioButton37);
        radioButton38 = (RadioButton) vMain.findViewById(R.id.radioButton38);
        radioButton39 = (RadioButton) vMain.findViewById(R.id.radioButton39);
        radioButton40 = (RadioButton) vMain.findViewById(R.id.radioButton40);
        n = 1;
        score = 0;
        percentage = 0;
        average = 0;
        difference = 0;
        lastscore = 30;
        average = 18;
        next.setOnClickListener(this);
        previous.setOnClickListener(this);
        return vMain;
    }


    @Override
    public void onClick(View v) {

        int i = 3;

        if (v == next) {
            if (viewFlipper.getDisplayedChild() == 0) {
                if (radioGroup1.getCheckedRadioButtonId() == -1) {
                        i =0;
                } else {
                    n = n + 1;
                    numberbutton.setText(n.toString());
                    i = 1;
                }
            }
            if (viewFlipper.getDisplayedChild() == 1) {
                if (radioGroup2.getCheckedRadioButtonId() == -1) {
                    i = 0;
                } else {
                    n = n + 1;
                    numberbutton.setText(n.toString());
                    i = 1;
                }
            }
            if (viewFlipper.getDisplayedChild() == 2) {
                if (radioGroup3.getCheckedRadioButtonId() == -1) {
                        i =0;
                } else {

                    n = n + 1;
                    numberbutton.setText(n.toString());
                    i=1;
                }
            }
            if (viewFlipper.getDisplayedChild() == 3) {
                if (radioGroup4.getCheckedRadioButtonId() == -1) {
                    i=0;
                } else {

                    n = n + 1;
                    numberbutton.setText(n.toString());
                    i=1;
                }
            }
            if (viewFlipper.getDisplayedChild() == 4) {
                if (radioGroup5.getCheckedRadioButtonId() == -1) {
                    i=0;
                } else {
                    n = n + 1;
                    numberbutton.setText(n.toString());
                    i=1;
                }
            }
            if (viewFlipper.getDisplayedChild() == 5) {
                if (radioGroup6.getCheckedRadioButtonId() == -1) {
i=0;
                } else {
                    n = n + 1;
                    numberbutton.setText(n.toString());
                  i=1;
                }
            }
            if (viewFlipper.getDisplayedChild() == 6) {
                if (radioGroup7.getCheckedRadioButtonId() == -1) {
i=0;
                } else {
                    n = n + 1;
                    numberbutton.setText(n.toString());
                  i=1;
                }
            }
            if (viewFlipper.getDisplayedChild() == 7) {
                if (radioGroup8.getCheckedRadioButtonId() == -1) {
                i=0;
                } else {
                    viewFlipper.setInAnimation(this.getActivity(), R.anim.right_in);
                    viewFlipper.setOutAnimation(this.getActivity(), R.anim.left_out);
                    n = n + 1;
                    numberbutton.setText(n.toString());
                  i=1;
                }
            }
            if (viewFlipper.getDisplayedChild() == 8) {
                if (radioGroup9.getCheckedRadioButtonId() == -1) {
                i=0;
                } else {
                    viewFlipper.setInAnimation(this.getActivity(), R.anim.right_in);
                    viewFlipper.setOutAnimation(this.getActivity(), R.anim.left_out);
                    n = n + 1;
                    numberbutton.setText(n.toString());
                i=1;
                }
            }
            if (viewFlipper.getDisplayedChild() == 9) {
                if (radioGroup10.getCheckedRadioButtonId() == -1) {
                    i=0;
                } else {
                    viewFlipper.stopFlipping();
                    if (radioButton1.isChecked()) {
                        score = score + 1;
                    }
                    if (radioButton2.isChecked()) {
                        score = score + 2;
                    }
                    if (radioButton3.isChecked()) {
                        score = score + 3;
                    }
                    if (radioButton4.isChecked()) {
                        score = score + 4;
                    }
                    if (radioButton5.isChecked()) {
                        score = score + 1;
                    }
                    if (radioButton6.isChecked()) {
                        score = score + 2;
                    }
                    if (radioButton7.isChecked()) {
                        score = score + 3;
                    }
                    if (radioButton8.isChecked()) {
                        score = score + 4;
                    }
                    if (radioButton9.isChecked()) {
                        score = score + 1;
                    }
                    if (radioButton10.isChecked()) {
                        score = score + 2;
                    }
                    if (radioButton11.isChecked()) {
                        score = score + 3;
                    }
                    if (radioButton12.isChecked()) {
                        score = score + 4;
                    }
                    if (radioButton13.isChecked()) {
                        score = score + 1;
                    }
                    if (radioButton14.isChecked()) {
                        score = score + 2;
                    }
                    if (radioButton15.isChecked()) {
                        score = score + 3;
                    }
                    if (radioButton16.isChecked()) {
                        score = score + 4;
                    }
                    if (radioButton17.isChecked()) {
                        score = score + 1;
                    }
                    if (radioButton18.isChecked()) {
                        score = score + 2;
                    }
                    if (radioButton19.isChecked()) {
                        score = score + 3;
                    }
                    if (radioButton20.isChecked()) {
                        score = score + 4;
                    }
                    if (radioButton21.isChecked()) {
                        score = score + 1;
                    }
                    if (radioButton22.isChecked()) {
                        score = score + 2;
                    }
                    if (radioButton23.isChecked()) {
                        score = score + 3;
                    }
                    if (radioButton24.isChecked()) {
                        score = score + 4;
                    }
                    if (radioButton25.isChecked()) {
                        score = score + 1;
                    }
                    if (radioButton26.isChecked()) {
                        score = score + 2;
                    }
                    if (radioButton27.isChecked()) {
                        score = score + 3;
                    }
                    if (radioButton28.isChecked()) {
                        score = score + 4;
                    }
                    if (radioButton29.isChecked()) {
                        score = score + 1;
                    }
                    if (radioButton30.isChecked()) {
                        score = score + 2;
                    }
                    if (radioButton31.isChecked()) {
                        score = score + 3;
                    }
                    if (radioButton32.isChecked()) {
                        score = score + 4;
                    }
                    if (radioButton33.isChecked()) {
                        score = score + 1;
                    }
                    if (radioButton34.isChecked()) {
                        score = score + 2;
                    }
                    if (radioButton35.isChecked()) {
                        score = score + 3;
                    }
                    if (radioButton36.isChecked()) {
                        score = score + 4;
                    }
                    if (radioButton37.isChecked()) {
                        score = score + 1;
                    }
                    if (radioButton38.isChecked()) {
                        score = score + 2;
                    }
                    if (radioButton39.isChecked()) {
                        score = score + 3;
                    }
                    if (radioButton40.isChecked()) {
                        score = score + 4;
                    }
                    percentage = score*100/40;
                    if(lastscore>=score){
                        difference = lastscore - score;
                    }
                    if(lastscore<=score){
                        difference = score - lastscore;
                    }


                    SharedPreferences settings = this.getActivity().getSharedPreferences("setting", 0);
                    SharedPreferences.Editor editor = settings.edit();
                    editor.putString("mind_score", score.toString());
                    editor.putString("mind_percentage", percentage.toString()+"%");
                    editor.putString("mind_average", average.toString());
                    editor.putString("mind_difference", difference.toString());
                    editor.putString("mind_lastscore", lastscore.toString());
                    editor.commit();
                    n = 0;
                    i=3;
                    getFragmentManager().beginTransaction().addToBackStack(null)
                            .replace(R.id.content_frame, new MindfulnessScore()).commit();
                }
            }
            if(i==1){
                viewFlipper.setInAnimation(this.getActivity(), R.anim.right_in);
                viewFlipper.setOutAnimation(this.getActivity(), R.anim.left_out);
                viewFlipper.showNext();
            }else{
                Toast.makeText(this.getActivity(), "You must choose one option", Toast.LENGTH_SHORT).show();
                viewFlipper.stopFlipping();
            }
        }
        else if(v== previous) {
            if (viewFlipper.getDisplayedChild() == 0) {
                Toast.makeText(this.getActivity(), "This is the first Page", Toast.LENGTH_SHORT).show();
            } else {
                viewFlipper.setInAnimation(this.getActivity(), R.anim.left_in);
                viewFlipper.setOutAnimation(this.getActivity(), R.anim.right_out);
                n = n - 1;
                numberbutton.setText(n.toString());
                viewFlipper.showPrevious();
            }
        }
    }
}
