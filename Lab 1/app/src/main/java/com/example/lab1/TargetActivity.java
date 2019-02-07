package com.example.lab1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TargetActivity extends AppCompatActivity {

    TextView myTextView;
    Intent currentIntent;
    String myStringExtra;
    int myIntegerExtra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target);

        currentIntent = getIntent();
        myStringExtra = currentIntent.getStringExtra("stringToSend");
        myIntegerExtra = currentIntent.getIntExtra("integerToSend", 0);

        myTextView = findViewById(R.id.textView);
        myTextView.setText(myStringExtra);

    }
}
