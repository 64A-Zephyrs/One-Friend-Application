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
 * Created by Barry on 19/8/17.
 */

public class StressTest extends Fragment implements View.OnClickListener{
    ViewFlipper viewFlipper2;
    Button next2;
    Button previous2;
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
    RadioButton radioButton41;
    RadioButton radioButton42;
    RadioButton radioButton43;
    RadioButton radioButton44;
    RadioButton radioButton45;
    RadioButton radioButton46;
    RadioButton radioButton47;
    RadioButton radioButton48;
    RadioButton radioButton49;
    RadioButton radioButton50;
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

    Button numberbutton2;
    TextView que2;
    Integer score2;
    Integer percentage2;
    Integer average2;
    Integer difference2;
    Integer lastscore2;
    Integer n;
    View vMain2;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle
            savedInstanceState) {
        vMain2 = inflater.inflate(R.layout.stress_test, container, false);

//        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
//        if(actionBar != null){
//            actionBar.setHomeButtonEnabled(true);
//            actionBar.setDisplayHomeAsUpEnabled(true);
//        }

        viewFlipper2 = (ViewFlipper)vMain2.findViewById(R.id.stress_viewFlipper);
        viewFlipper2.isAutoStart();
        next2 = (Button)vMain2.findViewById(R.id.next2);
        previous2 = (Button) vMain2.findViewById(R.id.previous2);
        numberbutton2 = (Button) vMain2.findViewById(R.id.numberbutton2);
        radioGroup1 = (RadioGroup) vMain2.findViewById(R.id.stress_group1);
        radioGroup2 = (RadioGroup) vMain2.findViewById(R.id.stress_group2);
        radioGroup3 = (RadioGroup) vMain2.findViewById(R.id.stress_group3);
        radioGroup4 = (RadioGroup) vMain2.findViewById(R.id.stress_group4);
        radioGroup5 = (RadioGroup) vMain2.findViewById(R.id.stress_group5);
        radioGroup6 = (RadioGroup) vMain2.findViewById(R.id.stress_group6);
        radioGroup7 = (RadioGroup) vMain2.findViewById(R.id.stress_group7);
        radioGroup8 = (RadioGroup) vMain2.findViewById(R.id.stress_group8);
        radioGroup9 = (RadioGroup) vMain2.findViewById(R.id.stress_group9);
        radioGroup10 = (RadioGroup) vMain2.findViewById(R.id.stress_group10);
        radioButton1 = (RadioButton) vMain2.findViewById(R.id.stress_answer1);
        radioButton2 = (RadioButton) vMain2.findViewById(R.id.stress_answer2);
        radioButton3 = (RadioButton) vMain2.findViewById(R.id.stress_answer3);
        radioButton4 = (RadioButton) vMain2.findViewById(R.id.stress_answer4);
        radioButton5 = (RadioButton) vMain2.findViewById(R.id.stress_answer5);
        radioButton6 = (RadioButton) vMain2.findViewById(R.id.stress_answer6);
        radioButton7 = (RadioButton) vMain2.findViewById(R.id.stress_answer7);
        radioButton8 = (RadioButton) vMain2.findViewById(R.id.stress_answer8);
        radioButton9 = (RadioButton) vMain2.findViewById(R.id.stress_answer9);
        radioButton10 = (RadioButton) vMain2.findViewById(R.id.stress_answer10);
        radioButton11 = (RadioButton) vMain2.findViewById(R.id.stress_answer11);
        radioButton12 = (RadioButton) vMain2.findViewById(R.id.stress_answer12);
        radioButton13 = (RadioButton) vMain2.findViewById(R.id.stress_answer13);
        radioButton14 = (RadioButton) vMain2.findViewById(R.id.stress_answer14);
        radioButton15 = (RadioButton) vMain2.findViewById(R.id.stress_answer15);
        radioButton16 = (RadioButton) vMain2.findViewById(R.id.stress_answer16);
        radioButton17 = (RadioButton) vMain2.findViewById(R.id.stress_answer17);
        radioButton18 = (RadioButton) vMain2.findViewById(R.id.stress_answer18);
        radioButton19 = (RadioButton) vMain2.findViewById(R.id.stress_answer19);
        radioButton20 = (RadioButton) vMain2.findViewById(R.id.stress_answer20);
        radioButton21 = (RadioButton) vMain2.findViewById(R.id.stress_answer21);
        radioButton22 = (RadioButton) vMain2.findViewById(R.id.stress_answer22);
        radioButton23 = (RadioButton) vMain2.findViewById(R.id.stress_answer23);
        radioButton24 = (RadioButton) vMain2.findViewById(R.id.stress_answer24);
        radioButton25 = (RadioButton) vMain2.findViewById(R.id.stress_answer25);
        radioButton26 = (RadioButton) vMain2.findViewById(R.id.stress_answer26);
        radioButton27 = (RadioButton) vMain2.findViewById(R.id.stress_answer27);
        radioButton28 = (RadioButton) vMain2.findViewById(R.id.stress_answer28);
        radioButton29 = (RadioButton) vMain2.findViewById(R.id.stress_answer29);
        radioButton30 = (RadioButton) vMain2.findViewById(R.id.stress_answer30);
        radioButton31 = (RadioButton) vMain2.findViewById(R.id.stress_answer31);
        radioButton32 = (RadioButton) vMain2.findViewById(R.id.stress_answer32);
        radioButton33 = (RadioButton) vMain2.findViewById(R.id.stress_answer33);
        radioButton34 = (RadioButton) vMain2.findViewById(R.id.stress_answer34);
        radioButton35 = (RadioButton) vMain2.findViewById(R.id.stress_answer35);
        radioButton36 = (RadioButton) vMain2.findViewById(R.id.stress_answer36);
        radioButton37 = (RadioButton) vMain2.findViewById(R.id.stress_answer37);
        radioButton38 = (RadioButton) vMain2.findViewById(R.id.stress_answer38);
        radioButton39 = (RadioButton) vMain2.findViewById(R.id.stress_answer39);
        radioButton40 = (RadioButton) vMain2.findViewById(R.id.stress_answer40);
        radioButton41 = (RadioButton) vMain2.findViewById(R.id.stress_answer41);
        radioButton42 = (RadioButton) vMain2.findViewById(R.id.stress_answer42);
        radioButton43 = (RadioButton) vMain2.findViewById(R.id.stress_answer43);
        radioButton44 = (RadioButton) vMain2.findViewById(R.id.stress_answer44);
        radioButton45 = (RadioButton) vMain2.findViewById(R.id.stress_answer45);
        radioButton46 = (RadioButton) vMain2.findViewById(R.id.stress_answer46);
        radioButton47 = (RadioButton) vMain2.findViewById(R.id.stress_answer47);
        radioButton48 = (RadioButton) vMain2.findViewById(R.id.stress_answer48);
        radioButton49 = (RadioButton) vMain2.findViewById(R.id.stress_answer49);
        radioButton50 = (RadioButton) vMain2.findViewById(R.id.stress_answer50);
        n = 1;
        score2 = 0;
        percentage2 = 0;
        average2 = 0;
        difference2 = 0;
        lastscore2 = 30;
        average2 = 18;
        next2.setOnClickListener(this);
        previous2.setOnClickListener(this);
        return vMain2;
    }


    @Override
    public void onClick(View v) {
        int i =3;
        if (v == next2) {
            if (viewFlipper2.getDisplayedChild() == 0) {
                if (radioGroup1.getCheckedRadioButtonId() == -1) {
                    i =0;
                } else {
                    viewFlipper2.setInAnimation(this.getActivity(), R.anim.right_in);
                    viewFlipper2.setOutAnimation(this.getActivity(), R.anim.left_out);
                    n = n + 1;
                    numberbutton2.setText(n.toString());
                    i = 1;
                }
            }
            if (viewFlipper2.getDisplayedChild() == 1) {
                if (radioGroup2.getCheckedRadioButtonId() == -1) {
                    i = 0;
                } else {
                    viewFlipper2.setInAnimation(this.getActivity(), R.anim.right_in);
                    viewFlipper2.setOutAnimation(this.getActivity(), R.anim.left_out);
                    n = n + 1;
                    numberbutton2.setText(n.toString());
                    i = 1;
                }
            }
            if (viewFlipper2.getDisplayedChild() == 2) {
                if (radioGroup3.getCheckedRadioButtonId() == -1) {
                    i =0;
                } else {
                    viewFlipper2.setInAnimation(this.getActivity(), R.anim.right_in);
                    viewFlipper2.setOutAnimation(this.getActivity(), R.anim.left_out);
                    n = n + 1;
                    numberbutton2.setText(n.toString());
                    i=1;
                }
            }
            if (viewFlipper2.getDisplayedChild() == 3) {
                if (radioGroup4.getCheckedRadioButtonId() == -1) {
                    i=0;
                } else {
                    viewFlipper2.setInAnimation(this.getActivity(), R.anim.right_in);
                    viewFlipper2.setOutAnimation(this.getActivity(), R.anim.left_out);
                    n = n + 1;
                    numberbutton2.setText(n.toString());
                    i=1;
                }
            }
            if (viewFlipper2.getDisplayedChild() == 4) {
                if (radioGroup5.getCheckedRadioButtonId() == -1) {
                    i=0;
                } else {
                    viewFlipper2.setInAnimation(this.getActivity(), R.anim.right_in);
                    viewFlipper2.setOutAnimation(this.getActivity(), R.anim.left_out);
                    n = n + 1;
                    numberbutton2.setText(n.toString());
                    i=1;
                }
            }
            if (viewFlipper2.getDisplayedChild() == 5) {
                if (radioGroup6.getCheckedRadioButtonId() == -1) {
                    i=0;
                } else {
                    viewFlipper2.setInAnimation(this.getActivity(), R.anim.right_in);
                    viewFlipper2.setOutAnimation(this.getActivity(), R.anim.left_out);
                    n = n + 1;
                    numberbutton2.setText(n.toString());
                    i=1;
                }
            }
            if (viewFlipper2.getDisplayedChild() == 6) {
                if (radioGroup7.getCheckedRadioButtonId() == -1) {
                    i=0;
                } else {
                    viewFlipper2.setInAnimation(this.getActivity(), R.anim.right_in);
                    viewFlipper2.setOutAnimation(this.getActivity(), R.anim.left_out);
                    n = n + 1;
                    numberbutton2.setText(n.toString());
                    i=1;
                }
            }
            if (viewFlipper2.getDisplayedChild() == 7) {
                if (radioGroup8.getCheckedRadioButtonId() == -1) {
                    i=0;
                } else {
                    viewFlipper2.setInAnimation(this.getActivity(), R.anim.right_in);
                    viewFlipper2.setOutAnimation(this.getActivity(), R.anim.left_out);
                    n = n + 1;
                    numberbutton2.setText(n.toString());
                    i=1;
                }
            }
            if (viewFlipper2.getDisplayedChild() == 8) {
                if (radioGroup9.getCheckedRadioButtonId() == -1) {
                    i=0;
                } else {
                    viewFlipper2.setInAnimation(this.getActivity(), R.anim.right_in);
                    viewFlipper2.setOutAnimation(this.getActivity(), R.anim.left_out);
                    n = n + 1;
                    numberbutton2.setText(n.toString());
                    i=1;
                }
            }
            if (viewFlipper2.getDisplayedChild() == 9) {
                if (radioGroup10.getCheckedRadioButtonId() == -1) {
                    i=0;
                } else {
                    viewFlipper2.stopFlipping();
                    if (radioButton1.isChecked()) {
                        score2 = score2 + 4;
                    }
                    if (radioButton2.isChecked()) {
                        score2 = score2 + 3;
                    }
                    if (radioButton3.isChecked()) {
                        score2 = score2 + 2;
                    }
                    if (radioButton4.isChecked()) {
                        score2 = score2 + 1;
                    }
                    if (radioButton5.isChecked()) {
                        score2 =score2+0;
                    }
                    if (radioButton6.isChecked()) {
                        score2 = score2 + 4;
                    }
                    if (radioButton7.isChecked()) {
                        score2 = score2 + 3;
                    }
                    if (radioButton8.isChecked()) {
                        score2 = score2 + 2;
                    }
                    if (radioButton9.isChecked()) {
                        score2 = score2 + 1;
                    }
                    if (radioButton10.isChecked()) {
                        score2 =score2+0;
                    }
                    if (radioButton11.isChecked()) {
                        score2 = score2 + 4;
                    }
                    if (radioButton12.isChecked()) {
                        score2 = score2+ 3;
                    }
                    if (radioButton13.isChecked()) {
                        score2 = score2 + 2;
                    }
                    if (radioButton14.isChecked()) {
                        score2 = score2 + 1;
                    }
                    if (radioButton15.isChecked()) {
                        score2 =score2+0;
                    }
                    if (radioButton16.isChecked()) {
                        score2 = score2 + 4;
                    }
                    if (radioButton17.isChecked()) {
                        score2 = score2 + 3;
                    }
                    if (radioButton18.isChecked()) {
                        score2 = score2 + 2;
                    }
                    if (radioButton19.isChecked()) {
                        score2 = score2 + 1;
                    }
                    if (radioButton20.isChecked()) {
                        score2 =score2+0;
                    }
                    if (radioButton21.isChecked()) {
                        score2 = score2 + 4;
                    }
                    if (radioButton22.isChecked()) {
                        score2 = score2 + 3;
                    }
                    if (radioButton23.isChecked()) {
                        score2 = score2 + 2;
                    }
                    if (radioButton24.isChecked()) {
                        score2 = score2 + 1;
                    }
                    if (radioButton25.isChecked()) {
                        score2 =score2+0;
                    }
                    if (radioButton26.isChecked()) {
                        score2 = score2 + 4;
                    }
                    if (radioButton27.isChecked()) {
                        score2 = score2 + 3;
                    }
                    if (radioButton28.isChecked()) {
                        score2 = score2 + 2;
                    }
                    if (radioButton29.isChecked()) {
                        score2 = score2+ 1;
                    }
                    if (radioButton30.isChecked()) {
                        score2 =score2+0;
                    }
                    if (radioButton31.isChecked()) {
                        score2 = score2 + 4;
                    }
                    if (radioButton32.isChecked()) {
                        score2 = score2 + 3;
                    }
                    if (radioButton33.isChecked()) {
                        score2 = score2 + 2;
                    }
                    if (radioButton34.isChecked()) {
                        score2 = score2 + 1;
                    }
                    if (radioButton35.isChecked()) {
                        score2 =score2+0;
                    }
                    if (radioButton36.isChecked()) {
                        score2 = score2 + 4;
                    }
                    if (radioButton37.isChecked()) {
                        score2 = score2 + 3;
                    }
                    if (radioButton38.isChecked()) {
                        score2 = score2 + 2;
                    }
                    if (radioButton39.isChecked()) {
                        score2 = score2 + 1;
                    }
                    if (radioButton40.isChecked()) {
                        score2 = score2 + 0;
                    }
                    if (radioButton41.isChecked()) {
                        score2 = score2 + 4;
                    }
                    if (radioButton42.isChecked()) {
                        score2 = score2 + 3;
                    }
                    if (radioButton43.isChecked()) {
                        score2 = score2 + 2;
                    }
                    if (radioButton44.isChecked()) {
                        score2 = score2 + 1;
                    }
                    if (radioButton45.isChecked()) {
                        score2 =score2+0;
                    }
                    if (radioButton46.isChecked()) {
                        score2 = score2 + 4;
                    }
                    if (radioButton47.isChecked()) {
                        score2 = score2+ 3;
                    }
                    if (radioButton48.isChecked()) {
                        score2 = score2 + 2;
                    }
                    if (radioButton49.isChecked()) {
                        score2 = score2 + 1;
                    }
                    if (radioButton50.isChecked()) {
                        score2 =score2+0;
                    }
                    percentage2 = score2*100/40;
                    if(lastscore2>=score2){
                        difference2 = lastscore2 - score2;
                    }
                    if(lastscore2<=score2){
                        difference2 = score2 - lastscore2;
                    }


                    SharedPreferences settings = this.getActivity().getSharedPreferences("ss", 0);
                    SharedPreferences.Editor editor = settings.edit();
                    editor.putString("stress_score", score2.toString());
                    editor.putString("stress_percentage", percentage2.toString()+"%");
                    editor.putString("stress_average", average2.toString());
                    editor.putString("stress_difference", difference2.toString());
                    editor.putString("stress_lastscore", lastscore2.toString());
                    editor.commit();
                    n = 0;
                    i=3;
                    getFragmentManager().beginTransaction().addToBackStack(null)
                            .replace(R.id.content_frame, new StressScore()).commit();
                }
            }
            if(i==1){
                viewFlipper2.showNext();
            }else{
                Toast.makeText(this.getActivity(), "You must choose one option", Toast.LENGTH_SHORT).show();
            }
        }
        else if(v== previous2) {
            if (viewFlipper2.getDisplayedChild() == 0) {
                Toast.makeText(this.getActivity(), "This is the first Page", Toast.LENGTH_SHORT).show();
            } else {
                viewFlipper2.setInAnimation(this.getActivity(), R.anim.left_in);
                viewFlipper2.setOutAnimation(this.getActivity(), R.anim.right_out);
                n = n - 1;
                numberbutton2.setText(n.toString());
                viewFlipper2.showPrevious();
            }
        }
    }
}

