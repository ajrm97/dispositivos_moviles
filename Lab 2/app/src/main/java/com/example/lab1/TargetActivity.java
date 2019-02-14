package com.example.lab1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TargetActivity extends AppCompatActivity {

    TextView myTextView;
    TextView myTextView2;
    Intent currentIntent;
    String myStringExtra;
    String myNameExtra;
    int myIntegerExtra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target);

        currentIntent = getIntent();
        myStringExtra = currentIntent.getStringExtra("stringToSend");
        myIntegerExtra = currentIntent.getIntExtra("integerToSend", 0);
        myNameExtra = currentIntent.getStringExtra("nameToSend");

        myTextView = findViewById(R.id.textView);
        myTextView2 = findViewById(R.id.textView2);
        myTextView.setText(myStringExtra);
        myTextView2.setText(myNameExtra);

    }
}
