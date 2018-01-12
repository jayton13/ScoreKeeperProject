package com.example.android.scorekeeperproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamOneScore = 0;
    int teamTwoScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void plusSixOne(View view){
        teamOneScore = teamOneScore + 6;
        displayForTeamOne(teamOneScore);
    }

    public void plusThreeOne(View view){
        teamOneScore = teamOneScore + 3;
        displayForTeamOne(teamOneScore);
    }

    public void plusTwoOne(View view){
        teamOneScore = teamOneScore + 2;
        displayForTeamOne(teamOneScore);
    }

    public void plusOneOne(View view){
        teamOneScore = teamOneScore + 1;
        displayForTeamOne(teamOneScore);
    }

    public void plusSixTwo(View view){
        teamTwoScore = teamTwoScore + 6;
        displayForTeamTwo(teamTwoScore);
    }

    public void plusThreeTwo(View view){
        teamTwoScore = teamTwoScore + 3;
        displayForTeamTwo(teamTwoScore);
    }

    public void plusTwoTwo(View view){
        teamTwoScore = teamTwoScore + 2;
        displayForTeamTwo(teamTwoScore);
    }

    public void plusOneTwo(View view){
        teamTwoScore = teamTwoScore + 1;
        displayForTeamTwo(teamTwoScore);
    }

    public void displayForTeamOne(int score){
        TextView scoreOneView = (TextView) findViewById(R.id.teamOneScore);
        scoreOneView.setText(String.valueOf(score));
    }

    public void displayForTeamTwo(int score){
        TextView scoreTwoView = (TextView) findViewById(R.id.teamTwoScore);
        scoreTwoView.setText(String.valueOf(score));
    }

    public void resetScores(View view){
        teamOneScore=0;
        displayForTeamOne(teamOneScore);
        teamTwoScore=0;
        displayForTeamTwo(teamTwoScore);
    }


}
