package com.example.mytravel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Spain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spain);

        Button buttonBack6 = findViewById(R.id.buttonBack6);
        buttonBack6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Spain.this,Country.class));
            }
        });

        Button buttonInPlSp = findViewById(R.id.buttonInPlSp);
        buttonInPlSp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Spain.this,InPlSp.class));
            }
        });
    }
}