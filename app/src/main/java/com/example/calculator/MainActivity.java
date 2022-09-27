package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button Plus, Minus, Kafol, Helkei, Mohek, Shave, Credits;
    EditText Text;
    int peola, firstrun, aftershave;
    double num1, num2, lastanswer;
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


        peola = -1;
    }

    public void Plus(View view) {

        ozer = Text.getText().toString();
        if (ozer.matches("-?\\d+(\\,\\d+)?")) {
            if (firstrun == 0) {
                num1 = Double.parseDouble(ozer);
                firstrun = 1;
            } else {
                num2 = Double.parseDouble(ozer);
                num1 = mehashev(num1, num2, peola);


            }
            peola = 1;
            Text.setText("");
            Text.setHint("" + num1 + " + ");
        }
        else if(aftershave == 1){
            peola = 1;
            aftershave = 0;
            Text.setText("");
            Text.setHint(""+num1 + " + ");
        }
        else{
            Text.setText("");
            Toast.makeText(this, "Wrong Input!", Toast.LENGTH_SHORT).show();
        }

    }

    public void Minus(View view) {
        ozer = Text.getText().toString();
        if (ozer.matches("-?\\d+(\\,\\d+)?")) {
        if (firstrun == 0){
            num1 = Double.parseDouble(ozer);
            firstrun = 1;
        }
        else {
            num2 = Double.parseDouble(ozer);
            num1 = mehashev(num1, num2, peola);


        }

        peola = 2;
        Text.setText("");
        Text.setHint(""+num1 + " - ");
        }
        else if(aftershave == 1){
            peola = 2;
            aftershave = 0;
            Text.setText("");
            Text.setHint(""+num1 + " - ");
        }
        else{
            Text.setText("");
            Toast.makeText(this, "Wrong Input!", Toast.LENGTH_SHORT).show();
        }
    }

    public void Kafol(View view) {
        ozer = Text.getText().toString();
        if (ozer.matches("-?\\d+(\\,\\d+)?")) {
        if (firstrun == 0){
            num1 = Double.parseDouble(ozer);
            firstrun = 1;
        }
        else {
            num2 = Double.parseDouble(ozer);
            num1 = mehashev(num1, num2, peola);


        }
        peola = 3;
        Text.setText("");
        Text.setHint(""+num1 + " * ");
        }
        else if(aftershave == 1){
            peola = 3;
            aftershave = 0;
            Text.setText("");
            Text.setHint(""+num1 + " * ");
        }
        else{
            Text.setText("");
            Toast.makeText(this, "Wrong Input!", Toast.LENGTH_SHORT).show();
        }
    }

    public void Helkei(View view) {
        ozer = Text.getText().toString();
        if (ozer.matches("-?\\d+(\\,\\d+)?")) {
        if (firstrun == 0){
            num1 = Double.parseDouble(ozer);
            firstrun = 1;
        }
        else {
            num2 = Double.parseDouble(ozer);
            num1 = mehashev(num1, num2, peola);


        }
        peola = 4;
        Text.setText("");
        Text.setHint(""+num1 + " / ");
        }
        else if(aftershave == 1){
            peola = 4;
            aftershave = 0;
            Text.setText("");
            Text.setHint(""+num1 + " / ");
        }
        else{
            Text.setText("");
            Toast.makeText(this, "Wrong Input!", Toast.LENGTH_SHORT).show();
        }
    }

    public void Shave(View view) {
        ozer = Text.getText().toString();
        if (ozer.matches("-?\\d+(\\,\\d+)?")) {
            if (firstrun == 0) {
                num1 = Double.parseDouble(ozer);
                firstrun = 1;
            } else {
                num2 = Double.parseDouble(ozer);


            }
            num1 = mehashev(num1, num2, peola);
        }
        peola = -1;

        Text.setText("");
        Text.setHint(""+num1);
        aftershave = 1;

    }
    public void Mohek(View view) {
        num1 = 0;
        num2 = 0;
        firstrun = 0;
        peola = -1;
        aftershave = 0;
        Text.setText("");
        Text.setHint(""+num1);
    }

    public double mehashev(double num1, double num2, int peola){
        switch(peola) {
            case (-1):
                num1 = num1;
                break;
            case (1):
                num1 = num1 + num2;
                break;
            case (2):
                num1 = num1 - num2;
                break;
            case (3):
                num1 = num1 * num2;
                break;
            case (4):
                num1 = num1 / num2;
                break;
        }
        lastanswer = num1;
        return num1;
    }


    public void Credits(View view) {
        ozer = Text.getText().toString();
        if (ozer.matches("-?\\d+(\\,\\d+)?")) {
            if (firstrun == 0) {
                num1 = Double.parseDouble(ozer);
                firstrun = 1;
            } else {
                num2 = Double.parseDouble(ozer);


            }
            num1 = mehashev(num1, num2, peola);
        }


        Intent si = new Intent(this,MainActivity2.class);
        System.out.println(num1);
        si.putExtra("sum", lastanswer);
        startActivity(si);
        Text.setText("");
        Text.setHint(""+num1);
        aftershave = 1;
    }
}