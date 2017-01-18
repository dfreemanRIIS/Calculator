package com.example.dfreeman.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private boolean secondHalf;
    TextView firstField;
    TextView secondField;
    TextView operatorField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
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
        secondHalf = false;
    }
}
