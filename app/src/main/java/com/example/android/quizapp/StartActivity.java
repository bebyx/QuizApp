package com.example.android.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class StartActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //method for onClick for the start button
    public void onStartButton(View view){

        int questionNumber = 1;
        int resultOne = 0;
        int resultTwo = 0;
        int resultThree = 0;


        //creating intent that sends to QuestionOne activity
        Intent questionsIntent = new Intent(StartActivity.this, QuestionsActivity.class);
        questionsIntent.putExtra("resultOne", resultOne);
        questionsIntent.putExtra("resultTwo", resultTwo);
        questionsIntent.putExtra("questionNumber", resultThree);
        questionsIntent.putExtra("questionNumber", questionNumber);
        startActivity(questionsIntent);

    }






    }
