package com.example.android.quiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void onSubmit(View view) {

        int points = 0;
        int answerQuestionOne;
        int answerQuestionTwo;
        int answerQuestionThree;
        int answerQuestionFour;
        int answerQuestionFive;
        int answerQuestionEight;

        RadioGroup groupQuestionOne = findViewById(R.id.questionOne);
        RadioGroup groupQuestionTwo = findViewById(R.id.questionTwo);
        RadioGroup groupQuestionThree = findViewById(R.id.questionThree);
        RadioGroup groupQuestionFour = findViewById(R.id.questionFour);
        RadioGroup groupQuestionFive = findViewById(R.id.questionFive);
        RadioGroup groupQuestionEight = findViewById(R.id.questionEight);

        RadioButton buttonQuestionOne;
        RadioButton buttonQuestionTwo;
        RadioButton buttonQuestionThree;
        RadioButton buttonQuestionFour;
        RadioButton buttonQuestionFive;
        RadioButton buttonQuestionEight;

        CheckBox questionSixAnswerOne;
        CheckBox questionSixAnswerTwo;
        CheckBox questionSixAnswerThree;
        CheckBox questionSixAnswerFour;

        boolean questionSixAnswerOneBool;
        boolean questionSixAnswerTwoBool;
        boolean questionSixAnswerThreeBool;
        boolean questionSixAnswerFourBool;

        //initialize the checkboxes and take there boolean value
        questionSixAnswerOne = findViewById(R.id.questionSixAnswerOne);
        questionSixAnswerTwo = findViewById(R.id.questionSixAnswerTwo);
        questionSixAnswerThree = findViewById(R.id.questionSixAnswerThree);
        questionSixAnswerFour = findViewById(R.id.questionSixAnswerFour);

        questionSixAnswerOneBool = questionSixAnswerOne.isChecked();
        questionSixAnswerTwoBool = questionSixAnswerTwo.isChecked();
        questionSixAnswerThreeBool = questionSixAnswerThree.isChecked();
        questionSixAnswerFourBool = questionSixAnswerFour.isChecked();

        //initialize the presidentNameText with the EditView
        EditText presidentNameText = findViewById(R.id.questionSeven);
        String presidentName = presidentNameText.getText().toString();

        //Check if some radiobuttons are checked - if not pop-up a message
        if (groupQuestionOne.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, getString(R.string.radioOneError), Toast.LENGTH_SHORT).show();
            return;
        } else {
            answerQuestionOne = groupQuestionOne.getCheckedRadioButtonId();
            buttonQuestionOne = (RadioButton) findViewById(answerQuestionOne);
        }

        if (groupQuestionTwo.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, getString(R.string.radioTwoError), Toast.LENGTH_SHORT).show();
            return;
        } else {
            answerQuestionTwo = groupQuestionTwo.getCheckedRadioButtonId();
            buttonQuestionTwo = (RadioButton) findViewById(answerQuestionTwo);
        }

        if (groupQuestionThree.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, getString(R.string.radioThreeError), Toast.LENGTH_SHORT).show();
            return;
        } else {
            answerQuestionThree = groupQuestionThree.getCheckedRadioButtonId();
            buttonQuestionThree = (RadioButton) findViewById(answerQuestionThree);
        }
        if (groupQuestionFour.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, getString(R.string.radioFourError), Toast.LENGTH_SHORT).show();
            return;
        } else {
            answerQuestionFour = groupQuestionFour.getCheckedRadioButtonId();
            buttonQuestionFour = (RadioButton) findViewById(answerQuestionFour);
        }
        if (groupQuestionFive.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, getString(R.string.radioFiveError), Toast.LENGTH_SHORT).show();
            return;
        } else {
            answerQuestionFive = groupQuestionFive.getCheckedRadioButtonId();
            buttonQuestionFive = (RadioButton) findViewById(answerQuestionFive);
        }
        if (!questionSixAnswerOneBool && !questionSixAnswerTwoBool && !questionSixAnswerThreeBool && !questionSixAnswerFourBool) {
            Toast.makeText(this, getString(R.string.radioSixError), Toast.LENGTH_SHORT).show();
            return;
        }
        if (presidentName.isEmpty()) {
            Toast.makeText(this, getString(R.string.radioSevenError), Toast.LENGTH_SHORT).show();
            return;
        }
        if (groupQuestionEight.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, getString(R.string.radioEightError), Toast.LENGTH_SHORT).show();
            return;

        } else {
            answerQuestionEight = groupQuestionEight.getCheckedRadioButtonId();
            buttonQuestionEight = findViewById(answerQuestionEight);
        }


        // if statement for question one
        // if the right radiobutton is checked add 1 point
        if (buttonQuestionOne.getId() == R.id.questionOneAnswerOne) {
            points = points + 1;
        }
        // if statement for question two
        // if the right radiobutton is checked add 1 point

        if (buttonQuestionTwo.getId() == R.id.questionTwoAnswerThree) {
            points = points + 1;
        }
        // if statement for question three
        // if the right radiobutton is checked add 1 point
        if (buttonQuestionThree.getId() == R.id.questionThreeAnswerFour) {
            points = points + 1;
        }
        // if statement for question four
        // if the right radiobutton is checked add 1 point
        if (buttonQuestionFour.getId() == R.id.questionFourAnswerTwo) {
            points = points + 1;
        }
        // if statement for question five
        // if the right radiobutton is checked add 1 point
        if (buttonQuestionFive.getId() == R.id.questionFiveAnswerOne) {
            points = points + 1;
        }

        // if statements for question six
        // if the right checkbox is true add 1 point

        if (questionSixAnswerOneBool) {
            points = points + 1;
        }
        if (questionSixAnswerTwoBool) {
            points = points + 1;
        }
        if (questionSixAnswerFourBool) {
            points = points + 1;
        }
        //Check if the string is empty - if yes then pop-up a message, if not compare it with the answers
        if (presidentName.compareTo(getString(R.string.questionSevenAnswerOne)) == 0 || presidentName.compareTo(getString(R.string.questionSevenAnswerTwo)) == 0 || presidentName.compareTo(getString(R.string.questionSevenAnswerThree)) == 0
                || presidentName.compareTo(getString(R.string.questionSevenAnswerFour)) == 0 || presidentName.compareTo(getString(R.string.questionSevenAnswerFive)) == 0) {
            points = points + 1;
        }
        if (buttonQuestionEight.getId() == R.id.questionEightAnswerFour) {
            points = points + 1;
        }
        String pointsMsg = getString(R.string.yourPoints, points);
        Toast.makeText(this, pointsMsg, Toast.LENGTH_SHORT).show();
    }

    public void onExit(View view) {
        finish();
        System.exit(0);
    }
}