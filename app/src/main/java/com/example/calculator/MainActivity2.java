package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView Text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Text = (TextView) findViewById(R.id.textView2);
        Intent gi = getIntent();
        Double sum = gi.getDoubleExtra("sum", 5);
        Text.setText("Last Mathematical Equation Result is: " + ""+sum);

    }

    public void Hazor(View view) {
        finish();
    }
}