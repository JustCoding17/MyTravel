package com.example.mytravel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class France extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_france);

        Button buttonInPlFr = findViewById(R.id.buttonInPlFr);
        buttonInPlFr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(France.this,InPlFr.class));
            }
        });

        Button buttonBack2 = findViewById(R.id.buttonBack2);
        buttonBack2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(France.this,Country.class));
            }
        });
    }
}