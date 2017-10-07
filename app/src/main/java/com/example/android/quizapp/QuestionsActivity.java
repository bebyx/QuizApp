package com.example.android.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by artem on 29.09.2017.
 */

public class QuestionsActivity extends AppCompatActivity {

    int questionNumber;
    int resultOne;
    int resultTwo;
    int resultThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.questions);

        /* Initialize Radio Group and uncheck all radio buttons */
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radio_group);
        radioGroup.clearCheck();

        /* get the int values from the previous activity */

        Intent previousActivityIntent = getIntent();
        resultOne = previousActivityIntent.getIntExtra("resultOne", 0);
        resultTwo = previousActivityIntent.getIntExtra("resultTwo", 0);
        resultThree = previousActivityIntent.getIntExtra("resultThree", 0);
        questionNumber = previousActivityIntent.getIntExtra("questionNumber", 0);

        //define the textview where to set the text for the question

        TextView questionText = (TextView) findViewById(R.id.question_text);


        //put radio buttons intto the array list for receiving text values

        List<RadioButton> radioButtons = new ArrayList<>();
        radioButtons.add((RadioButton)findViewById(R.id.radio_one));
        radioButtons.add((RadioButton)findViewById(R.id.radio_two));
        radioButtons.add((RadioButton)findViewById(R.id.radio_three));

        ArrayList<String> questionVariants = new ArrayList<>();
        //set text to question textview and radio buttons depending on the question number

        if (questionNumber == 1) {
            questionText.setText(getString(R.string.question_one));

            questionVariants.add(getString(R.string.q1_variant1));
            questionVariants.add(getString(R.string.q1_variant2));
            questionVariants.add(getString(R.string.q1_variant3));

            Collections.shuffle(questionVariants);

            for (int i = 0; i < questionVariants.size(); i++) {
                radioButtons.get(i).setText(questionVariants.get(i));
            }

        }
        if (questionNumber == 2) {
            questionText.setText(getString(R.string.question_two));

            questionVariants.add(getString(R.string.q2_variant1));
            questionVariants.add(getString(R.string.q2_variant2));
            questionVariants.add(getString(R.string.q2_variant3));

            Collections.shuffle(questionVariants);

            for (int i = 0; i < questionVariants.size(); i++) {
                radioButtons.get(i).setText(questionVariants.get(i));
            }
        }
        if (questionNumber == 3) {
            questionText.setText(getString(R.string.question_three));

            questionVariants.add(getString(R.string.q3_variant1));
            questionVariants.add(getString(R.string.q3_variant2));
            questionVariants.add(getString(R.string.q3_variant3));

            Collections.shuffle(questionVariants);

            for (int i = 0; i < questionVariants.size(); i++) {
                radioButtons.get(i).setText(questionVariants.get(i));
            }
        }
        if (questionNumber == 4) {
            questionText.setText(getString(R.string.question_four));

            questionVariants.add(getString(R.string.q4_variant1));
            questionVariants.add(getString(R.string.q4_variant2));
            questionVariants.add(getString(R.string.q4_variant3));

            Collections.shuffle(questionVariants);

            for (int i = 0; i < questionVariants.size(); i++) {
                radioButtons.get(i).setText(questionVariants.get(i));
            }
        }
            if (questionNumber == 5) {
                questionText.setText(getString(R.string.question_five));

                questionVariants.add(getString(R.string.q5_variant1));
                questionVariants.add(getString(R.string.q5_variant2));
                questionVariants.add(getString(R.string.q5_variant3));

                Collections.shuffle(questionVariants);

                for (int i = 0; i < questionVariants.size(); i++) {
                    radioButtons.get(i).setText(questionVariants.get(i));
                }
            }
            if (questionNumber == 6) {
                questionText.setText(getString(R.string.question_six));

                questionVariants.add(getString(R.string.q6_variant1));
                questionVariants.add(getString(R.string.q6_variant2));
                questionVariants.add(getString(R.string.q6_variant3));

                Collections.shuffle(questionVariants);

                for (int i = 0; i < questionVariants.size(); i++) {
                    radioButtons.get(i).setText(questionVariants.get(i));
                }
            }
            if (questionNumber == 7) {
                questionText.setText(getString(R.string.question_seven));

                questionVariants.add(getString(R.string.q7_variant1));
                questionVariants.add(getString(R.string.q7_variant2));
                questionVariants.add(getString(R.string.q7_variant3));

                Collections.shuffle(questionVariants);

                for (int i = 0; i < questionVariants.size(); i++) {
                    radioButtons.get(i).setText(questionVariants.get(i));
                }
            }

        }


    public void onNextButton(View view){

        //if a user chooses no variant and clicks "next" button, the activity returns Toast asking to make choice
        //once the variant is chosen, the code checks which one by getting and comparing the string of the answer
        //depending on the answer, adds points to one of three result variables

        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radio_group);
        int radioCheck = radioGroup.getCheckedRadioButtonId();
        if (radioCheck == -1){
            Toast.makeText(QuestionsActivity.this, getString(R.string.unchecked_message), Toast.LENGTH_LONG).show();
            return;
        } else {
            String answerText = ((RadioButton)findViewById(radioCheck)).getText().toString();
            if (answerText.equals(getString(R.string.q1_variant1))
                    || answerText.equals(getString(R.string.q2_variant1))
                    || answerText.equals(getString(R.string.q3_variant1))
                    || answerText.equals(getString(R.string.q4_variant1))
                    || answerText.equals(getString(R.string.q5_variant1))
                    || answerText.equals(getString(R.string.q6_variant1))
                    || answerText.equals(getString(R.string.q7_variant1))
                    ){
                resultOne++;
            }
            if (answerText.equals(getString(R.string.q1_variant2))
                    || answerText.equals(getString(R.string.q2_variant2))
                    || answerText.equals(getString(R.string.q3_variant2))
                    || answerText.equals(getString(R.string.q4_variant2))
                    || answerText.equals(getString(R.string.q5_variant2))
                    || answerText.equals(getString(R.string.q6_variant2))
                    || answerText.equals(getString(R.string.q7_variant2))
                    ){
                resultTwo++;
            }
            if (answerText.equals(getString(R.string.q1_variant3))
                    || answerText.equals(getString(R.string.q2_variant3))
                    || answerText.equals(getString(R.string.q3_variant3))
                    || answerText.equals(getString(R.string.q4_variant3))
                    || answerText.equals(getString(R.string.q5_variant3))
                    || answerText.equals(getString(R.string.q6_variant3))
                    || answerText.equals(getString(R.string.q7_variant3))
                    ){
                resultThree++;
            }


        }

        /*once the question 1-6 is finished, the intent refreshes the current questions activity keeping all the needed data
         * also transfers questionnumber int to the next question.
         * else stands for the seventh question, after answering it intent sends to the result activity*/
        if (questionNumber < 7){
            questionNumber++ ;
            Intent refreshIntent = new Intent(QuestionsActivity.this, QuestionsActivity.class);
            refreshIntent.putExtra("resultOne", resultOne);
            refreshIntent.putExtra("resultTwo", resultTwo);
            refreshIntent.putExtra("resultThree", resultThree);
            refreshIntent.putExtra("questionNumber", questionNumber);
            finish();
            startActivity(refreshIntent);
        } else {
            Intent resultIntent = new Intent(QuestionsActivity.this, ResultActivity.class);
            resultIntent.putExtra("resultOne", resultOne);
            resultIntent.putExtra("resultTwo", resultTwo);
            resultIntent.putExtra("resultThree", resultThree);
            finish();
            startActivity(resultIntent);
        }



    }




}
