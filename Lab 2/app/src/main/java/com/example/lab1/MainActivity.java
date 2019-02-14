package com.example.lab1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.button);
        name = findViewById(R.id.editText);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(MainActivity.this, TargetActivity.class);

                String nameToSend = name.getText().toString();
                myIntent.putExtra("stringToSend", "Hello Intent");
                myIntent.putExtra("integerToSend", 2);
                myIntent.putExtra("nameToSend", "Hello! " + nameToSend);

                startActivity(myIntent);

            }
        });
    }
}
