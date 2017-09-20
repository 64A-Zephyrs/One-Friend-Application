package com.zephyrs.android.onefriend;

/**
 * Created by Barry on 12/9/17.
 */

public class Score {
    private String score;
    public Score(String score){
        this.score = score ;
    }
    public Score(){
    }
    public String getscore(){
        return score;
    }

    public void setscore(String score){
        this.score = score;
    }
}
