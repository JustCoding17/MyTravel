package com.example.mytravel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Czechia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_czechia);

        Button buttonInPlCzh = findViewById(R.id.buttonInPlCzh);
        buttonInPlCzh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Czechia.this,InPlCzh.class));
            }
        });

        Button buttonBack7 = findViewById(R.id.buttonBack7);
        buttonBack7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Czechia.this,Country.class));
            }
        });
    }
}