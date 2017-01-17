package com.example.dfreeman.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickZero(View v) {
        TextView firstField = (TextView)findViewById(R.id.firstInput);
        firstField.setText(firstField.getText() + "0");
    }
    public void onClickOne(View v) {
        TextView firstField = (TextView)findViewById(R.id.firstInput);
        firstField.setText(firstField.getText() + "1");
    }
    public void onClickTwo(View v) {
        TextView firstField = (TextView)findViewById(R.id.firstInput);
        firstField.setText(firstField.getText() + "2");
    }
    public void onClickThree(View v) {
        TextView firstField = (TextView)findViewById(R.id.firstInput);
        firstField.setText(firstField.getText() + "3");
    }
    public void onClickFour(View v) {
        TextView firstField = (TextView)findViewById(R.id.firstInput);
        firstField.setText(firstField.getText() + "4");
    }
    public void onClickFive(View v) {
        TextView firstField = (TextView)findViewById(R.id.firstInput);
        firstField.setText(firstField.getText() + "5");
    }
    public void onClickSix(View v) {
        TextView firstField = (TextView)findViewById(R.id.firstInput);
        firstField.setText(firstField.getText() + "6");
    }
    public void onClickSeven(View v) {
        TextView firstField = (TextView)findViewById(R.id.firstInput);
        firstField.setText(firstField.getText() + "7");
    }
    public void onClickEight(View v) {
        TextView firstField = (TextView)findViewById(R.id.firstInput);
        firstField.setText(firstField.getText() + "8");
    }
    public void onClickNine(View v) {
        TextView firstField = (TextView)findViewById(R.id.firstInput);
        firstField.setText(firstField.getText() + "9");
    }
    public void onPlusClick(View v) {
        TextView operatorField = (TextView)findViewById(R.id.operator);
        operatorField.setText("+");
    }
    public void onMinusClick(View v) {
        TextView operatorField = (TextView)findViewById(R.id.operator);
        operatorField.setText("-");
    }
    public void onMultClick(View v) {
        TextView operatorField = (TextView)findViewById(R.id.operator);
        operatorField.setText("X");
    }
    public void onDivideClick(View v) {
        TextView operatorField = (TextView)findViewById(R.id.operator);
        operatorField.setText("%");
    }
}
