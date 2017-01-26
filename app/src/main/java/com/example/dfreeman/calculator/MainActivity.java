package com.example.dfreeman.calculator;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private boolean secondHalf;
    private TextView firstField;
    private TextView secondField;
    private TextView operatorField;
    private int backgroundCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        backgroundCounter = 0;
        secondHalf = false;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstField = (TextView)findViewById(R.id.firstInput);
        secondField = (TextView)findViewById(R.id.secondInput);
        operatorField = (TextView)findViewById(R.id.operator);
    }

    public void onClickZero(View v) {
        if(secondHalf){
            String temp = secondField.getText() + "0";
            secondField.setText(temp);
        } else {
            String temp = firstField.getText() + "0";
            firstField.setText(temp);
        }
    }
    public void onClickOne(View v) {
        if(secondHalf){
            String temp = secondField.getText() + "1";
            secondField.setText(temp);
        } else {
            String temp = firstField.getText() + "1";
            firstField.setText(temp);
        }    }
    public void onClickTwo(View v) {
        if(secondHalf){
            String temp = secondField.getText() + "2";
            secondField.setText(temp);
        } else {
            String temp = firstField.getText() + "2";
            firstField.setText(temp);
        }    }
    public void onClickThree(View v) {
        if(secondHalf){
            String temp = secondField.getText() + "3";
            secondField.setText(temp);
        } else {
            String temp = firstField.getText() + "3";
            firstField.setText(temp);
        }    }
    public void onClickFour(View v) {
        if(secondHalf){
            String temp = secondField.getText() + "4";
            secondField.setText(temp);
        } else {
            String temp = firstField.getText() + "4";
            firstField.setText(temp);
        }    }
    public void onClickFive(View v) {
        if(secondHalf){
            String temp = secondField.getText() + "5";
            secondField.setText(temp);
        } else {
            String temp = firstField.getText() + "5";
            firstField.setText(temp);
        }    }
    public void onClickSix(View v) {
        if(secondHalf){
            String temp = secondField.getText() + "6";
            secondField.setText(temp);
        } else {
            String temp = firstField.getText() + "6";
            firstField.setText(temp);
        }    }
    public void onClickSeven(View v) {
        if(secondHalf){
            String temp = secondField.getText() + "7";
            secondField.setText(temp);
        } else {
            String temp = firstField.getText() + "7";
            firstField.setText(temp);
        }    }
    public void onClickEight(View v) {
        if(secondHalf){
            String temp = secondField.getText() + "8";
            secondField.setText(temp);
        } else {
            String temp = firstField.getText() + "8";
            firstField.setText(temp);
        }    }
    public void onClickNine(View v) {
        if(secondHalf){
            String temp = secondField.getText() + "9";
            secondField.setText(temp);
        } else {
            String temp = firstField.getText() + "9";
            firstField.setText(temp);
        }    }
    public void onPlusClick(View v) {
        operatorField.setText("+");
        secondHalf = true;
    }
    public void onMinusClick(View v) {
        operatorField.setText("-");
        secondHalf = true;
    }
    public void onMultClick(View v) {
        operatorField.setText("X");
        secondHalf = true;
    }
    public void onDivideClick(View v) {
        operatorField.setText("%");
        secondHalf = true;
    }
    public void onClickClear(View v) {
        firstField.setText("");
        secondField.setText("");
        operatorField.setText("");
        secondHalf = false;
        TextView answer = (TextView)findViewById(R.id.answer);
        answer.setText("");
    }
    public void onEqualsClick(View v) {
        final String error = "ERROR";
        String tempFirstField = firstField.getText().toString();
        String tempSecondField = secondField.getText().toString();
        String tempOperator = operatorField.getText().toString();
        long firstNo;
        long secondNo;
        TextView answer = (TextView)findViewById(R.id.answer);

        //Try to cast the strings to numbers
        try {
            firstNo = Integer.parseInt(tempFirstField);
        } catch (NumberFormatException e) {
            firstNo = 0;
            answer.setText(error);
        }
        try {
            secondNo = Integer.parseInt(tempSecondField);
        } catch (NumberFormatException e) {
            secondNo = 0;
            answer.setText(error);
        }

        if(tempOperator.equals("+")) {
            long temp = firstNo + secondNo;

            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(temp);
            String temp2 = sb.toString();

            answer.setText(temp2);
        }
        if(tempOperator.equals("-")) {
            long temp = firstNo - secondNo;

            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(temp);
            String temp2 = sb.toString();

            answer.setText(temp2);        }
        if(tempOperator.equals("X")) {
            long temp = firstNo * secondNo;

            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(temp);
            String temp2 = sb.toString();

            answer.setText(temp2);        }
        if(tempOperator.equals("%")) {
            if(secondNo==0) {
                final String divZero = "YOU CANT DIVIDE BY ZERO YOU CANT DIVIDE BY ZERO YOU CANT DIVIDE BY ZERO YOU CANT DIVIDE BY ZERO YOU CANT DIVIDE BY ZERO YOU CANT DIVIDE BY ZERO YOU CANT DIVIDE BY ZERO YOU CANT DIVIDE BY ZERO ";
                answer.setText(divZero);
                View mv = findViewById(R.id.activity_main);
                mv.setBackgroundColor(Color.argb(255, 255, 0, 0));
            } else {
                float temp = (float)firstNo / (float)secondNo;

                StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(temp);
                String temp2 = sb.toString();

                answer.setText(temp2);
            }
        }
    }
    public void onChangeColor(View v) {
        View mv = findViewById(R.id.activity_main);
        int temp = backgroundCounter % 6;
        if(temp == 0) {
            mv.setBackgroundColor(Color.argb(255, 255, 255, 255));
            backgroundCounter++;
        }
        if(temp == 1) {
            mv.setBackgroundColor(Color.argb(255, 200, 200, 200));
            backgroundCounter++;
        }
        if(temp == 2) {
            mv.setBackgroundColor(Color.argb(200, 255, 200, 200));
            backgroundCounter++;
        }
        if (temp == 3) {
            mv.setBackgroundColor(Color.argb(200, 100, 200, 255));
            backgroundCounter++;
        }
        if (temp == 4) {
            mv.setBackgroundColor(Color.argb(200, 255, 100, 150));
            backgroundCounter++;
        }
        if (temp == 5) {
            mv.setBackgroundColor(Color.argb(200, 100, 255, 150));
            backgroundCounter++;
        }
    }
}
