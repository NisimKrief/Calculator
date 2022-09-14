package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button Plus, Minus, Kafol, Helkei, Mohek, Shave, Credits;
    EditText Text;
    int num1, num2, peola, firstrun;
    String ozer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Plus = (Button) findViewById(R.id.button);
        Minus = (Button) findViewById(R.id.button6);
        Kafol = (Button) findViewById(R.id.button7);
        Helkei = (Button) findViewById(R.id.button8);
        Mohek = (Button) findViewById(R.id.button9);
        Shave = (Button) findViewById(R.id.button13);
        Credits = (Button) findViewById(R.id.button14);
        Text = (EditText) findViewById(R.id.editTextNumberSigned);
    }

    public void Plus(View view) {
        peola = 1;

        ozer = Text.getText().toString();
        if (firstrun == 0){
            num1 = Integer.parseInt(ozer);
            System.out.println(num1);
            firstrun = 1;
    }
        else {
            num2 = Integer.parseInt(ozer);
            System.out.println(num2);
            num1 = num1 + num2;
            System.out.println(num1);

        }
    }

    public void Minus(View view) {
        peola = 2;
    }

    public void Kafol(View view) {
        peola = 3;
    }

    public void Helkei(View view) {
        peola = 4;
    }
}