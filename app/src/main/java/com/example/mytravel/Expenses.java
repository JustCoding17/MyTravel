package com.example.mytravel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Expenses extends AppCompatActivity {

    //outlay - расходы
    int outlay = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expenses);


        EditText ETN = (EditText) findViewById(R.id.ETN);
        EditText ETN2 = (EditText) findViewById(R.id.ETN2);
        EditText ETN3 = (EditText) findViewById(R.id.ETN3);
        Button btnConf = (Button) findViewById((R.id.btnConf));
        TextView textResult = (TextView) findViewById(R.id.textResult);
        TextView tv49 = (TextView) findViewById(R.id.textView49);

        Button btnBack1 = findViewById(R.id.btnBack1);
        btnBack1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Expenses.this,Country.class));
            }
        });

        btnConf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    if (ETN.getText().toString().length()!=0)
                    {
                        outlay = Integer.parseInt(ETN.getText().toString());

                        if (ETN2.getText().toString().equals("Россия")) {
                            if (ETN3.getText().toString().equals("Петергоф, Новгородский детинец, Байкал") ||
                                    ETN3.getText().toString().equals("Петергоф, Байкал, Новгородский детинец") ||
                                    ETN3.getText().toString().equals("Новгородский детинец, Петергоф, Байкал") ||
                                    ETN3.getText().toString().equals("Новгородский детинец, Байкал, Петергоф") ||
                                    ETN3.getText().toString().equals("Байкал, Петергоф, Новгородский детинец") ||
                                    ETN3.getText().toString().equals("Байкал, Новгородский детинец, Петергоф")
                            ) {
                                outlay = outlay - 40300;
                                textResult.setText(String.valueOf("Остаток бюджета " + outlay + " ₽"));
                            } else if (ETN3.getText().toString().equals("Петергоф, Новгородский детинец") ||
                                    ETN3.getText().toString().equals("Новгородский детинец, Петергоф")
                            ) {
                                outlay = outlay - 12800 - 15000;
                                textResult.setText(String.valueOf("Остаток бюджета " + outlay + " ₽"));
                            } else if (ETN3.getText().toString().equals("Петергоф, Байкал") ||
                                    ETN3.getText().toString().equals("Байкал, Петергоф")) {
                                outlay = outlay - 17500 - 15000;
                                textResult.setText(String.valueOf("Остаток бюджета " + outlay + " ₽"));
                            } else if (ETN3.getText().toString().equals("Новгородский детинец, Байкал") ||
                                    ETN3.getText().toString().equals("Байкал, Новгородский детинец")) {
                                outlay = outlay - 20300 - 15000;
                                textResult.setText(String.valueOf("Остаток бюджета " + outlay + " ₽"));
                            } else if (ETN3.getText().toString().equals("Байкал")) {
                                outlay = outlay - 12500 - 15000;
                                textResult.setText(String.valueOf("Остаток бюджета " + outlay + " ₽"));
                            } else if (ETN3.getText().toString().equals("Петергоф")) {
                                outlay = outlay - 5000 - 15000;
                                textResult.setText(String.valueOf("Остаток бюджета " + outlay + " ₽"));
                            } else if (ETN3.getText().toString().equals("Новгородский детинец")) {
                                outlay = outlay - 7800 - 15000;
                                textResult.setText(String.valueOf("Остаток бюджета " + outlay + " ₽"));
                            } else if (ETN3.getText().toString().equals("")) {
                                outlay = outlay - 15000;
                                textResult.setText(String.valueOf("Остаток бюджета " + outlay + " ₽"));
                            } else {
                                textResult.setText("Некоректно введены данные");
                                textResult.setTextColor(Color.RED);
                            }
                        }
                            if (ETN2.getText().toString().equals("Греция"))
                            {
                                if (ETN3.getText().toString().equals("Панатинайкос")) {
                                    outlay = outlay - 56000 - 15000;
                                    textResult.setText(String.valueOf("Остаток бюджета " + outlay + " ₽"));
                                } else if (ETN3.getText().toString().equals("")) {
                                    outlay = outlay - 56000;
                                    textResult.setText(String.valueOf("Остаток бюджета " + outlay + " ₽"));
                                } else {
                                    textResult.setText("Некоректно введены данные");
                                    textResult.setTextColor(Color.RED);
                                }
                            }
                            if (ETN2.getText().toString().equals("Италия"))
                            {
                                if (ETN3.getText().toString().equals("Галерея Уффици")) {
                                    outlay = outlay - 72000 - 17900;
                                    textResult.setText(String.valueOf("Остаток бюджета " + outlay + " ₽"));
                                } else if (ETN3.getText().toString().equals("")) {
                                    outlay = outlay - 72000;
                                    textResult.setText(String.valueOf("Остаток бюджета " + outlay + " ₽"));
                                } else {
                                    textResult.setText("Некоректно введены данные");
                                    textResult.setTextColor(Color.RED);
                                }
                            }
                            if (ETN2.getText().toString().equals("Чехия")) {
                                if (ETN3.getText().toString().equals("Собор Святого Вита, Пражский град") ||
                                        ETN3.getText().toString().equals("Пражский град, Собор Святого Вита")
                                ) {
                                    outlay = outlay - 104090;
                                    textResult.setText(String.valueOf("Остаток бюджета " + outlay + " ₽"));
                                } else if (ETN3.getText().toString().equals("Собор Святого Вита")) {
                                    outlay = outlay - 82890;
                                    textResult.setText(String.valueOf("Остаток бюджета " + outlay + " ₽"));
                                } else if (ETN3.getText().toString().equals("Пражский град")) {
                                    outlay = outlay - 89090;
                                    textResult.setText(String.valueOf("Остаток бюджета " + outlay + " ₽"));
                                } else {
                                    textResult.setText("Некоректно введены данные");
                                    textResult.setTextColor(Color.RED);
                                }
                            }
                            if (ETN2.getText().toString().equals("Испания")) {
                                if (ETN3.getText().toString().equals("Замок Коломарес")) {
                                    outlay = outlay - 59000 - 17870;
                                    textResult.setText(String.valueOf("Остаток бюджета " + outlay + " ₽"));
                                } else if (ETN3.getText().toString().equals("")) {
                                    outlay = outlay - 59000;
                                    textResult.setText(String.valueOf("Остаток бюджета " + outlay + " ₽"));
                                } else {
                                    textResult.setText("Некоректно введены данные");
                                    textResult.setTextColor(Color.RED);
                                }
                            }

                            if (ETN2.getText().toString().equals("Франция" )) {
                                if (ETN3.getText().toString().equals("Эйфелева башня, Дворец Фонтенбло") ||
                                        ETN3.getText().toString().equals("Дворец Фонтенбло, Эйфелева башня")
                                ) {
                                    outlay = outlay - 70000 - 22000 - 25000;
                                    textResult.setText(String.valueOf("Остаток бюджета " + outlay + " ₽"));
                                } else if (ETN3.getText().toString().equals("Дворец Фонтенбло")) {
                                    outlay = outlay - 70000 - 22000;
                                    textResult.setText(String.valueOf("Остаток бюджета " + outlay + " ₽"));
                                    textResult.setVisibility(View.VISIBLE);
                                } else if (ETN3.getText().toString().equals("Пражский град")) {
                                    outlay = outlay - 70000 - 25000;
                                    textResult.setText(String.valueOf("Остаток бюджета " + outlay + " ₽"));

                                } else {
                                    textResult.setText("Некоректно введены данные");
                                    textResult.setTextColor(Color.RED);
                                }
                            }

                        else
                        {
                            textResult.setText("Не все поля заполнены или имеются пробелы");
                            textResult.setTextColor(Color.RED);
                        }

                        if (outlay <= 0)
                        {
                            textResult.setText(String.valueOf("Остаток бюджета " + outlay + " ₽"));
                            tv49.setTextColor(Color.RED);
                            tv49.setText(String.valueOf("Остаток от бюджета уходит в минус"));
                        }
                        else
                        {
                            textResult.setText(String.valueOf("Остаток бюджета " + outlay + " ₽"));
                            textResult.setTextColor(Color.GREEN);
                            tv49.setVisibility(View.INVISIBLE);
                        }

                    }
                    else {
                        textResult.setText("Заполните все поля");
                        textResult.setTextColor(Color.RED);
                    }


            }

        });
    }
}