package com.example.dfreeman.calculator;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private boolean secondHalf;
    TextView firstField;
    TextView secondField;
    TextView operatorField;
    int backgroundCounter;

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
            secondField.setText(secondField.getText() + "0");
        } else {
            firstField.setText(firstField.getText() + "0");
        }
    }
    public void onClickOne(View v) {
        if(secondHalf){
            secondField.setText(secondField.getText() + "1");
        } else {
            firstField.setText(firstField.getText() + "1");
        }    }
    public void onClickTwo(View v) {
        if(secondHalf){
            secondField.setText(secondField.getText() + "2");
        } else {
            firstField.setText(firstField.getText() + "2");
        }    }
    public void onClickThree(View v) {
        if(secondHalf){
            secondField.setText(secondField.getText() + "3");
        } else {
            firstField.setText(firstField.getText() + "3");
        }    }
    public void onClickFour(View v) {
        if(secondHalf){
            secondField.setText(secondField.getText() + "4");
        } else {
            firstField.setText(firstField.getText() + "4");
        }    }
    public void onClickFive(View v) {
        if(secondHalf){
            secondField.setText(secondField.getText() + "5");
        } else {
            firstField.setText(firstField.getText() + "5");
        }    }
    public void onClickSix(View v) {
        if(secondHalf){
            secondField.setText(secondField.getText() + "6");
        } else {
            firstField.setText(firstField.getText() + "6");
        }    }
    public void onClickSeven(View v) {
        if(secondHalf){
            secondField.setText(secondField.getText() + "7");
        } else {
            firstField.setText(firstField.getText() + "7");
        }    }
    public void onClickEight(View v) {
        if(secondHalf){
            secondField.setText(secondField.getText() + "8");
        } else {
            firstField.setText(firstField.getText() + "8");
        }    }
    public void onClickNine(View v) {
        if(secondHalf){
            secondField.setText(secondField.getText() + "9");
        } else {
            firstField.setText(firstField.getText() + "9");
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
        String tempFirstField = firstField.getText().toString();
        String tempSecondField = secondField.getText().toString();
        String tempOperator = operatorField.getText().toString();
        int firstNo;
        int secondNo;
        TextView answer = (TextView)findViewById(R.id.answer);

        //Try to cast the strings to numbers
        try {
            firstNo = Integer.parseInt(tempFirstField);
        } catch (NumberFormatException e) {
            firstNo = 0;
            answer.setText("ERROR");
        }
        try {
            secondNo = Integer.parseInt(tempSecondField);
        } catch (NumberFormatException e) {
            secondNo = 0;
            answer.setText("ERROR");
        }

        if(tempOperator.equals("+")) {
            int temp = firstNo + secondNo;

            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(temp);
            String temp2 = sb.toString();

            answer.setText(temp2);
        }
        if(tempOperator.equals("-")) {
            int temp = firstNo - secondNo;

            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(temp);
            String temp2 = sb.toString();

            answer.setText(temp2);        }
        if(tempOperator.equals("X")) {
            int temp = firstNo * secondNo;

            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(temp);
            String temp2 = sb.toString();

            answer.setText(temp2);        }
        if(tempOperator.equals("%")) {
            double temp = firstNo / secondNo;

            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(temp);
            String temp2 = sb.toString();

            answer.setText(temp2);        }
    }
    public void onChangeColor(View v) {
        View mv = (View)findViewById(R.id.activity_main);
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
