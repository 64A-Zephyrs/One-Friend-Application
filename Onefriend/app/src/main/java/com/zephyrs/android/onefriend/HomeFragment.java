package com.zephyrs.android.onefriend;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link HomeFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment implements SeekBar.OnSeekBarChangeListener {

    Button reset;
    TextView sleep;
    TextView exercise;
    TextView meditation;
    TextView social;
    TextView water;
    TextView hobby;
    Button buttonquestion;
    Button done;
    Button h1;
    Button h2;
    Button h3;
    Button h4;
    Button h5;
    Button h6;
    Button back;
    ImageButton head;
    private SeekBar mSeekBar1, mSeekBar2,mSeekBar3,mSeekBar4,mSeekBar5,mSeekBar6;
    Integer score;
    Integer total;
    View homefragment;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        homefragment = inflater.inflate(R.layout.fragment_home, container, false);
        head = (ImageButton) homefragment.findViewById(R.id.head);
        back = (Button) homefragment.findViewById(R.id.back_button);
        done =  (Button) homefragment.findViewById(R.id.done);
        buttonquestion = (Button)homefragment.findViewById(R.id.buttonquestion);
        sleep = (TextView) homefragment.findViewById(R.id.sleep_text);
        exercise = (TextView) homefragment.findViewById(R.id.exercise_text);
        meditation = (TextView) homefragment.findViewById(R.id.meditation_text);
        social = (TextView) homefragment.findViewById(R.id.social_text);
        water = (TextView) homefragment.findViewById(R.id.water_text);
        hobby = (TextView) homefragment.findViewById(R.id.hobby_text);
        mSeekBar1 = (SeekBar) homefragment.findViewById(R.id.sb_1);
        mSeekBar2 = (SeekBar) homefragment.findViewById(R.id.sb_2);
        mSeekBar3 = (SeekBar) homefragment.findViewById(R.id.sb_3);
        mSeekBar4 = (SeekBar) homefragment.findViewById(R.id.sb_4);
        mSeekBar5 = (SeekBar) homefragment.findViewById(R.id.sb_5);
        mSeekBar6 = (SeekBar) homefragment.findViewById(R.id.sb_6);
        mSeekBar1.setOnSeekBarChangeListener(this);
        mSeekBar2.setOnSeekBarChangeListener(this);
        mSeekBar3.setOnSeekBarChangeListener(this);
        mSeekBar4.setOnSeekBarChangeListener(this);
        mSeekBar5.setOnSeekBarChangeListener(this);
        mSeekBar6.setOnSeekBarChangeListener(this);
        h1 = (Button) homefragment.findViewById(R.id.hint1);
        h2 = (Button) homefragment.findViewById(R.id.hint2);
        h3 = (Button) homefragment.findViewById(R.id.hint3);
        h4 = (Button) homefragment.findViewById(R.id.hint4);
        h5 = (Button) homefragment.findViewById(R.id.hint5);
        h6 = (Button) homefragment.findViewById(R.id.hint6);
        reset = (Button) homefragment.findViewById(R.id.reselect);

        AlphaAnimation animationview = new AlphaAnimation(0f, 1f);
        animationview.setDuration(500);
        homefragment.setAnimation(animationview);
        head.setAnimation(animationview);

        ScaleAnimation scaleAnimation1 = new ScaleAnimation(0f, 1, 1f, 1f, Animation.RELATIVE_TO_SELF, 0f, Animation.RELATIVE_TO_SELF, 1f);
        scaleAnimation1.setDuration(400);
        mSeekBar1.setAnimation(scaleAnimation1);

        ScaleAnimation scaleAnimation2 = new ScaleAnimation(0f, 1, 1f, 1f, Animation.RELATIVE_TO_SELF, 0f, Animation.RELATIVE_TO_SELF, 1f);
        scaleAnimation2.setDuration(600);
        mSeekBar2.setAnimation(scaleAnimation2);

        ScaleAnimation scaleAnimation3 = new ScaleAnimation(0f, 1, 1f, 1f, Animation.RELATIVE_TO_SELF, 0f, Animation.RELATIVE_TO_SELF, 1f);
        scaleAnimation3.setDuration(800);
        mSeekBar3.setAnimation(scaleAnimation3);

        ScaleAnimation scaleAnimation4 = new ScaleAnimation(0f, 1, 1f, 1f, Animation.RELATIVE_TO_SELF, 0f, Animation.RELATIVE_TO_SELF, 1f);
        scaleAnimation4.setDuration(1000);
        mSeekBar4.setAnimation(scaleAnimation4);

        ScaleAnimation scaleAnimation5 = new ScaleAnimation(0f, 1, 1f, 1f, Animation.RELATIVE_TO_SELF, 0f, Animation.RELATIVE_TO_SELF, 1f);
        scaleAnimation5.setDuration(1200);
        mSeekBar5.setAnimation(scaleAnimation5);

        ScaleAnimation scaleAnimation6 = new ScaleAnimation(0f, 1, 1f, 1f, Animation.RELATIVE_TO_SELF, 0f, Animation.RELATIVE_TO_SELF, 1f);
        scaleAnimation6.setDuration(1400);
        mSeekBar6.setAnimation(scaleAnimation6);

        score =0;
        total = 0;
        h1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new android.app.AlertDialog.Builder(getActivity()).setTitle("Sleep").setMessage("High stress levels can cause trouble sleeping, research suggests that at least 7-8 hours of sleep per night can lower stress levels.")
                        .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                            }}).show();
            }
        });
        h2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new android.app.AlertDialog.Builder(getActivity()).setTitle("Exercise").setMessage("Exercise ranging from aerobics to yoga is great way to stay fit and reduce stress, try to spend 20 minutes or more on exercising.")
                        .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                            }}).show();

            }
        });
        h3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new android.app.AlertDialog.Builder(getActivity()).setTitle("Meditation").setMessage("Medication can wipe away day’s stress. Research recommends at least 5-6 minutes each day can improve stress.")
                        .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                            }}).show();
            }
        });
        h4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new android.app.AlertDialog.Builder(getActivity()).setTitle("Relationship").setMessage("Stress can often be depressing. Routinely taking 10 minutes off from your busy schedule will have significant impact on your daily stress levels.")
                        .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                            }}).show();
            }
        });
        h5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new android.app.AlertDialog.Builder(getActivity()).setTitle("Water").setMessage("Drinking water will increase your fluids level which can help reduce immediate stress. Recommended 8 glasses of water per day.")
                        .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                            }}).show();
            }
        });
        h6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new android.app.AlertDialog.Builder(getActivity()).setTitle("Hobbies").setMessage("Hobbies will divert your mind which in turn which will results in reducing the stress. This could range from reading novels to playing board games. Spend approx.. 20 minutes each day.")
                        .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                            }}).show();
            }
        });


        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent testintent = new Intent(getActivity(),ReportPage.class);
                startActivity(testintent);
                getActivity().overridePendingTransition(R.anim.fade, R.anim.hold);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent testintent = new Intent(getActivity(),StressLevel.class);
                startActivity(testintent);
                getActivity().overridePendingTransition(R.anim.fade, R.anim.hold);
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent testintent = new Intent(getActivity(),StressLevel.class);
                startActivity(testintent);
                getActivity().overridePendingTransition(R.anim.fade, R.anim.hold);
            }
        });

        buttonquestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new android.app.AlertDialog.Builder(getActivity()).setTitle("Instruction").setMessage("Please select one of your favorite habits below to start tracking your efforts to overcome stress.")
                        .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                            }}).show();
            }
        });


        SharedPreferences settings = this.getActivity().getSharedPreferences("score", 0);
        String getscore = settings.getString("stress_head","0");
        String ms1 = settings.getString("seekbar1","0");
        String ms2 = settings.getString("seekbar2","0");
        String ms3 = settings.getString("seekbar3","0");
        String ms4 = settings.getString("seekbar4","0");
        String ms5 = settings.getString("seekbar5","0");
        String ms6 = settings.getString("seekbar6","0");
        String reduce = settings.getString("stress_reduce","0");

        mSeekBar1.setProgress(Integer.valueOf(ms1));
        mSeekBar2.setProgress(Integer.valueOf(ms2));
        mSeekBar3.setProgress(Integer.valueOf(ms3));
        mSeekBar4.setProgress(Integer.valueOf(ms4));
        mSeekBar5.setProgress(Integer.valueOf(ms5));
        mSeekBar6.setProgress(Integer.valueOf(ms6));
        Integer pointss = Integer.valueOf(getscore);
        score = Integer.valueOf(reduce);
        if(pointss>12){
            pointss=12;
        }
        total=pointss;
//        mSeekBar1.invalidate();
        checkchangehead();
        score=0;
//        mSeekBar1 = (MSeekBar) homefragment.findViewById(R.id.sb_main1);
//        mSeekBar2 = (MSeekBar) homefragment.findViewById(R.id.sb_main2);
//        mSeekBar3 = (MSeekBar) homefragment.findViewById(R.id.sb_main3);
//        mSeekBar1.setOnSeekBarChangeListener(this);
//        mSeekBar2.setOnSeekBarChangeListener(this);
//        mSeekBar3.setOnSeekBarChangeListener(this);
        // Inflate the layout for this fragment
        return homefragment;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        if (mSeekBar1.getProgress() == 0){
            sleep.setText("3 Hours or less");
                score = score + 0;
        } else if (mSeekBar1.getProgress() >0 && mSeekBar1.getProgress() <= 15) {
            sleep.setText("4-5 Hours");
                score = score + 1;
            } else if (mSeekBar1.getProgress() > 15 && mSeekBar1.getProgress() <= 30) {
            sleep.setText("6-7 Hours");
                score = score + 2;
            } else if (mSeekBar1.getProgress() > 30 && mSeekBar1.getProgress() <= 45) {
            sleep.setText("8-9 Hours");
                score = score + 3;
            } else if (mSeekBar1.getProgress() > 45 && mSeekBar1.getProgress() <= 60) {
            sleep.setText("10 Hours or more");
                score = score + 4;
            }
        if (mSeekBar2.getProgress() == 0){
            exercise.setText("0 Minutes");
            score = score + 0;
        } else if (mSeekBar2.getProgress() >0 && mSeekBar2.getProgress() <= 15) {
            exercise.setText("20 Minutes");
                score = score + 1;
            } else if(mSeekBar2.getProgress() >15 && mSeekBar2.getProgress()<=30){
            exercise.setText("40 Minutes");
                score = score + 2;
            }else if(mSeekBar2.getProgress() >30 && mSeekBar2.getProgress()<=45){
            exercise.setText("60 Minutes");
                score = score + 3;
            }else if(mSeekBar2.getProgress() >45 && mSeekBar2.getProgress()<=60){
            exercise.setText("80 Minutes or more");
                score = score + 4;
            }


        if (mSeekBar3.getProgress() == 0){
            meditation.setText("0 Minutes");
            score = score + 0;
            } else if (mSeekBar3.getProgress() >0 && mSeekBar3.getProgress() <= 15) {
            meditation.setText("1-5 Minutes");
                score = score + 1;
            } else if(mSeekBar3.getProgress() >15 && mSeekBar3.getProgress()<=30){
            meditation.setText("6-10 Minutes");
                score = score + 2;
            }else if(mSeekBar3.getProgress() >30 && mSeekBar3.getProgress()<=45){
            meditation.setText("11-15 Minutes");
                score = score + 3;
            }else if(mSeekBar3.getProgress() >45 && mSeekBar3.getProgress()<=60){
            meditation.setText("16 Minutes or more");
                score = score + 4;
            }

        if (mSeekBar4.getProgress() == 0){
            social.setText("0 Minutes");
            score = score + 0;
        } else if (mSeekBar4.getProgress() >0 && mSeekBar4.getProgress() <= 15) {
            social.setText("15 Minutes");
                score = score + 1;
            } else if(mSeekBar4.getProgress() >15 && mSeekBar4.getProgress()<=30){
            social.setText("30 Minutes");
                score = score + 2;
            }else if(mSeekBar4.getProgress() >30 && mSeekBar4.getProgress()<=45){
            social.setText("60 Minutes");
                score = score + 3;
            }else if(mSeekBar4.getProgress() >45 && mSeekBar4.getProgress()<=60){
            social.setText("90 Minutes or more");
                score = score + 4;
            }

        if (mSeekBar5.getProgress() == 0){
            water.setText("0 Glasses");
            score = score + 0;
        } else if (mSeekBar5.getProgress() >0 && mSeekBar5.getProgress() <= 15) {
            water.setText("1-3 Glasses");
                score = score + 1;
            } else if(mSeekBar5.getProgress() >15 && mSeekBar5.getProgress()<=30){
            water.setText("4-6 Glasses");
                score = score + 2;
            }else if(mSeekBar5.getProgress() >30 && mSeekBar5.getProgress()<=45){
            water.setText("7-9 Glasses");
                score = score + 3;
            }else if(mSeekBar5.getProgress() >45 && mSeekBar5.getProgress()<=60){
            water.setText("10 Glasses or more");
                score = score + 4;
            }

        if (mSeekBar6.getProgress() == 0){
            hobby.setText("0 Minutes");
            score = score + 0;
        } else if (mSeekBar6.getProgress() >0 && mSeekBar6.getProgress() <= 15) {
            hobby.setText("15 Minutes");
                score = score + 1;
            } else if(mSeekBar6.getProgress() >15 && mSeekBar6.getProgress()<=30){
            hobby.setText("30 Minutes");
                score = score + 2;
            }else if(mSeekBar6.getProgress() >30 && mSeekBar6.getProgress()<=45){
            hobby.setText("45 Minutes");
                score = score + 3;
            }else if(mSeekBar6.getProgress() >45 && mSeekBar6.getProgress()<=60){
            hobby.setText("60 Minutes or more");
                score = score + 4;
            }
        checkchangehead();
        score =0;
    }


    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

    public void checkchangehead(){
        Integer difference;
        difference = total - score;
        SharedPreferences settings = getActivity().getSharedPreferences("score", 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString("seekbar1", String.valueOf(mSeekBar1.getProgress()));
        editor.putString("seekbar2", String.valueOf(mSeekBar2.getProgress()));
        editor.putString("seekbar3", String.valueOf(mSeekBar3.getProgress()));
        editor.putString("seekbar4", String.valueOf(mSeekBar4.getProgress()));
        editor.putString("seekbar5", String.valueOf(mSeekBar5.getProgress()));
        editor.putString("seekbar6", String.valueOf(mSeekBar6.getProgress()));
        editor.putString("stress_head", String.valueOf(total));
        editor.putString("stress_reduce", String.valueOf(score));
        editor.commit();
        if(difference<0){
            head.setImageDrawable(getResources().getDrawable(R.drawable.h7));
        } else if(difference>0 && difference<=2){
            head.setImageDrawable(getResources().getDrawable(R.drawable.h6));
        } else if(difference>2 && difference<=4){
            head.setImageDrawable(getResources().getDrawable(R.drawable.h5));
        } else if(difference>4 && difference<=6){
            head.setImageDrawable(getResources().getDrawable(R.drawable.h4));
        } else if(difference>6 && difference<=8){
            head.setImageDrawable(getResources().getDrawable(R.drawable.h3));
        } else if(difference>8 && difference<=10){
            head.setImageDrawable(getResources().getDrawable(R.drawable.h2));
        } else if(difference>10 && difference<=12){
            head.setImageDrawable(getResources().getDrawable(R.drawable.h1));
        }
    }
}
