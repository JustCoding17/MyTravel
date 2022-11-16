package com.example.mytravel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Greece extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greece);

        Button buttonInPlGr = findViewById(R.id.buttonInPlGr);
        buttonInPlGr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Greece.this,InPlGr.class));
            }
        });

        Button buttonBack3 = findViewById(R.id.buttonBack3);
        buttonBack3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Greece.this,Country.class));
            }
        });
    }
}