package com.example.mytravel;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Country extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country);

        //Expenses-------------------------------------------------------------------------
        Button btnExpenses = findViewById(R.id.btnExpenses);
        btnExpenses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Country.this,Expenses.class));
            }
        });

        //France-------------------------------------------------------------------------
        Button btnFr = findViewById(R.id.btnFr);
        btnFr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Country.this,France.class));
            }
        });

        //Spain-------------------------------------------------------------------------
        Button btnSp = findViewById(R.id.btnSp);
        btnSp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Country.this,Spain.class));
            }
        });

        //Czechia-------------------------------------------------------------------------
        Button btnChz = findViewById(R.id.btnChz);
        btnChz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Country.this,Czechia.class));
            }
        });
        //Italy-------------------------------------------------------------------------
        Button btnItal = findViewById(R.id.btnItal);
        btnItal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Country.this,Italy.class));
            }
        });

        //Greece-------------------------------------------------------------------------
        Button btnGr = findViewById(R.id.btnGr);
        btnGr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Country.this,Greece.class));
            }
        });
    //Russia-------------------------------------------------------------------------
        Button btnRuss = findViewById(R.id.btnRuss);
        btnRuss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Country.this,Russ.class));
            }
        });
        Button btnQues = findViewById(R.id.btnQues);
        btnQues.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showInfo("Если у вас возникли вопросы,обратитесь по этому номеру телефона:'+7(***)***-**-**'");
            }
        });
    }
    private void showInfo(String text)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(Country.this);

        builder.setTitle("Возникли вопросы?")
              .setMessage(text)
               .setCancelable(true)
               .setPositiveButton("Понятно", (DialogInterface.OnClickListener) (dialogInterface, i) -> finish());
        builder.setNegativeButton("",new DialogInterface.OnClickListener(){
            @Override
        public void onClick(DialogInterface dialogInterface, int i){
                dialogInterface.cancel();
            }
    });
        AlertDialog dialog = builder.create();
        dialog.show();

    }
}
