package com.example.android.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class ResultActivity extends AppCompatActivity {

    String resultDescription = "Please return and make your choice";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);


        Intent mainIntent = getIntent();
        int resultOne = mainIntent.getIntExtra("resultOne", 0);
        int resultTwo = mainIntent.getIntExtra("resultTwo", 0);
        int resultThree = mainIntent.getIntExtra("resultThree", 0);


        if(resultOne > resultTwo && resultOne > resultThree){
            resultDescription = "one";
        }
        if(resultTwo > resultOne && resultTwo > resultThree){
            resultDescription = "two";
        }
        if(resultThree > resultOne && resultThree > resultTwo){
            resultDescription = "three";
        }

        if (resultOne == resultTwo && resultOne > resultThree){
            resultDescription = "one-two hybrid";
        }

        if (resultOne == resultThree && resultOne > resultTwo){
            resultDescription = "one-three hybrid";
        }

        if (resultTwo == resultThree && resultTwo > resultOne){
            resultDescription = "two-three hybrid";
        }


        TextView resultText = (TextView) findViewById(R.id.result);
        resultText.setText(resultDescription);



    }

    public void onShareButton(View view){

        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, resultDescription + "\n" + "\n" + "google store link will be here");
        sendIntent.setType("text/plain");
        startActivity(Intent.createChooser(sendIntent, getResources().getText(R.string.send_to)));
    }


}
