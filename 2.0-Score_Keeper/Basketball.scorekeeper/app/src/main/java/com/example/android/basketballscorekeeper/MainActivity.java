package com.example.android.basketballscorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }

    // Methods for each button

    /**
     * Increase the score for Team A by 3 points.
     */
    public void addThreeForTeamA(View v) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void addTwoForTeamA(View v) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Team B by 3 points.
     */
    public void addThreeForTeamB(View v) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Team B by 2 points.
     */
    public void addTwoForTeamB(View v) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    public void addOneForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }


    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


    // Resets the score for both teams back to 0

    /**
     * 1. Keep the score before reset both score!
     * displayForTeamA(scoreTeamA);
     * displayForTeamB(scoreTeamB);
     * scoreTeamA = 0;
     * scoreTeamB = 0;
     *
     * 2. reset score immediately
     * scoreTeamA = 0;
     * scoreTeamB = 0;
     * displayForTeamA(scoreTeamA);
     * displayForTeamB(scoreTeamB);
     */
    public void resetScore(View v) {
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        if (scoreTeamA > scoreTeamB) {
            Toast.makeText(this, "Home team wins !", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Visitor wins, booouh !", Toast.LENGTH_SHORT).show();
        }
        scoreTeamA = 0;
        scoreTeamB = 0;
    }

    public void imageViewer(View v) {
        // Done: Display image after clicking on a button
        ImageView cookieImageView = (ImageView) findViewById(R.id.bck_image_view);
        cookieImageView.setImageResource(R.drawable.dreamteam_usa);

        // Done: Display the text.
        TextView changeTextView = (TextView) findViewById(R.id.status_text_view);
        changeTextView.setText("You're like the dream team, in 2012 !");
    }
    // TODO: Undo button for each team in case refusing score by decision referee.
    // TODO: Even timer decrease.
    // TODO: intent with Email and/or web site to share or update the score...
}



