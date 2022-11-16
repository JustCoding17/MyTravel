package com.example.mytravel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Italy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italy);

        Button buttonInPlIt = findViewById(R.id.buttonInPlIt);
        buttonInPlIt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Italy.this,InPlIt.class));
            }
        });

        Button buttonBack4 = findViewById(R.id.buttonBack4);
        buttonBack4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Italy.this,Country.class));
            }
        });
    }
}