package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitButton(View view) {
        //get username of the participant and set it on the welcome textview
        EditText editText = (EditText) findViewById(R.id.name_field);
        String userName = editText.getText().toString();
        TextView textView = (TextView) findViewById(R.id.welcome_user);
        textView.setText("Welcome, " + userName);

        //verify if participant selected correct answers for question 1 to 10
        RadioButton rightOptionOne = (RadioButton) findViewById(R.id.right_option_1);
        Boolean rightOption1 = rightOptionOne.isChecked();

        RadioButton rightOptionTwo = (RadioButton) findViewById(R.id.right_option_2);
        Boolean rightOption2 = rightOptionTwo.isChecked();

        RadioButton rightOptionThree = (RadioButton) findViewById(R.id.right_option_3);
        Boolean rightOption3 = rightOptionThree.isChecked();

        RadioButton rightOptionFour = (RadioButton) findViewById(R.id.right_option_4);
        Boolean rightOption4 = rightOptionFour.isChecked();

        RadioButton rightOptionFive = (RadioButton) findViewById(R.id.right_option_5);
        Boolean rightOption5 = rightOptionFive.isChecked();

        RadioButton rightOptionSix = (RadioButton) findViewById(R.id.right_option_6);
        Boolean rightOption6 = rightOptionSix.isChecked();

        //There are three (3) right answers for question 7. Code below tries to figure if the are all checked.
        CheckBox rightOptionSevenA = (CheckBox) findViewById(R.id.right_option_7a);
        Boolean rightOption7A = rightOptionSevenA.isChecked();

        CheckBox rightOptionSevenB = (CheckBox) findViewById(R.id.right_option_7b);
        Boolean rightOption7B = rightOptionSevenB.isChecked();

        CheckBox rightOptionSevenC = (CheckBox) findViewById(R.id.right_option_7c);
        Boolean rightOption7C = rightOptionSevenC.isChecked();

        RadioButton rightOptionEight = (RadioButton) findViewById(R.id.right_option_8);
        Boolean rightOption8 = rightOptionEight.isChecked();

        RadioButton rightOptionNine = (RadioButton) findViewById(R.id.right_option_9);
        Boolean rightOption9 = rightOptionNine.isChecked();

        RadioButton rightOptionTen = (RadioButton) findViewById(R.id.right_option_10);
        Boolean rightOption10 = rightOptionTen.isChecked();

        if (rightOption1) {
            score = +5;
        }
        if (rightOption2) {
            score += 5;
        }
        if (rightOption3) {
            score += 5;
        }
        if (rightOption4) {
            score += 5;
        }
        if (rightOption5) {
            score += 5;
        }
        if (rightOption6) {
            score += 5;
        }
        if (rightOption7A && rightOption7B && rightOption7C) {
            score += 5;
        }
        if (rightOption8) {
            score += 5;
        }
        if (rightOption9) {
            score += 5;
        }
        if (rightOption10) {
            score += 5;
        }
        //Review score and advice participant accordingly
        if (score < 30) {
            Toast.makeText(this, userName + ", You scored " + score + ". Please go over the options again and look closely, you can do it!", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, userName + ", Thanks for participating. You scored " + score + ".", Toast.LENGTH_LONG).show();
        }
        score = 0;
    }
}
