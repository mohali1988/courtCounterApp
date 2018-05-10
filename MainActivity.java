package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

/** Team A **/
    /** add 3 Score to Team A **/
    public void addThreeToTeamA (View view) {

        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);

    }

    /** add 2 Score to Team A **/
    public void addTwoToTeamA (View view) {

        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    /** add 1 Score to Team A **/
    public void addOneToTeamA (View view) {

        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

/** Team B **/

    /** add 3 Score to Team B **/
    public void addThreeToTeamB (View view) {

        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    /** add 2 Score to Team B **/
    public void addTwoToTeamB (View view) {

        scoreTeamB = scoreTeamB +2;
        displayForTeamB(scoreTeamB);
    }

    /** add 1 Score to Team B **/
    public void addOneToTeamB (View view) {

        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

/** Reset**/

    public void  resetScore (View view) {

        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

}
