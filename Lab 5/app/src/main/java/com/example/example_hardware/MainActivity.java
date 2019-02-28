package com.example.example_hardware;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = getApplicationContext();

        Button vibButton=(Button)findViewById(R.id.button_vib);
        vibButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ;
                Intent i = new Intent(context, vibration.class);
                startActivity(i);
            }
        });

        Button torButton=(Button)findViewById(R.id.button_tor);
        torButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ;
                Intent i = new Intent(context, torch.class);
                startActivity(i);
            }
        });

    }
}