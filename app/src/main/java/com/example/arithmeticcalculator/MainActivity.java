package com.example.arithmeticcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView resultbutn;
TextView result;
EditText num1;
EditText num2;
Button add;
Button subtraction;
Button multiplication;
Button division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultbutn = (TextView) findViewById(R.id.txtResultbutn);
        result = (TextView) findViewById(R.id.txtResult);
        num1 = (EditText) findViewById(R.id.txtNum1);
        num2 = (EditText) findViewById(R.id.txtNum2);
        add = (Button) findViewById(R.id.btnadd);
        subtraction = (Button) findViewById(R.id.btnMinus);
        multiplication = (Button) findViewById(R.id.btnMultiply);
        division = (Button) findViewById(R.id.btnDivide);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //               String input1 = num1.getText().toString();
                //              String input2 = num2.getText().toString();

                double myNum1 = Double.parseDouble(num1.getText().toString());
                double myNum2 = Double.parseDouble(num2.getText().toString());
                double sum = myNum1 + myNum2;

                result.setText(String.valueOf(sum));
                //result.setText(""+sum);
            }
        });
        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double myNum1 = Double.parseDouble(num1.getText().toString());
                double myNum2 = Double.parseDouble(num2.getText().toString());
                double dif = myNum1 - myNum2;

                result.setText(String.valueOf(dif));
            }
        });
        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double myNum1 = Double.parseDouble(num1.getText().toString());
                double myNum2 = Double.parseDouble(num2.getText().toString());
                double product = myNum1 * myNum2;

                result.setText(String.valueOf(product));
            }
        });
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double myNum1 = Double.parseDouble(num1.getText().toString());
                double myNum2 = Double.parseDouble(num2.getText().toString());
                double quotient = myNum1 / myNum2;

                result.setText(String.valueOf(quotient));
            }
        });
    }
}