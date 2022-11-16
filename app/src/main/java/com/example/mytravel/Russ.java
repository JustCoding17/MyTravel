package com.example.mytravel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Russ extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_russ);

        Button buttonInPRuss = findViewById(R.id.buttonInPRuss);
        buttonInPRuss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Russ.this,InPRuss.class));
            }
        });

        Button buttonBack5 = findViewById(R.id.buttonBack5);
        buttonBack5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Russ.this,Country.class));
            }
        });
    }
}