package com.example.kilogramconverter;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageButton b25kg, b20kg, b15kg, b10kg, b5kg, b2kg, b1kg, b0kg, bsmallkg;
    Button bclear, brem, buttonTime;
    EditText KG, LBS;
    double val1, val2, val3, val4;
    boolean remove = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b25kg = findViewById(R.id.button0);
        b20kg = findViewById(R.id.button1);
        b15kg = findViewById(R.id.button2);
        b10kg = findViewById(R.id.button3);
        b5kg = findViewById(R.id.button4);
        b2kg = findViewById(R.id.button5);
        b1kg = findViewById(R.id.button6);
        b0kg = findViewById(R.id.button7);
        bsmallkg = findViewById(R.id.button10);
        bclear = findViewById(R.id.button8);
        brem = findViewById(R.id.button9);
        buttonTime = findViewById(R.id.buttonTime);
        KG = findViewById(R.id.Kilograms);
        LBS = findViewById(R.id.Pounds);

        b25kg.setBackgroundColor(Color.TRANSPARENT);
        b20kg.setBackgroundColor(Color.TRANSPARENT);
        b15kg.setBackgroundColor(Color.TRANSPARENT);
        b10kg.setBackgroundColor(Color.TRANSPARENT);
        b5kg.setBackgroundColor(Color.TRANSPARENT);
        b2kg.setBackgroundColor(Color.TRANSPARENT);
        b1kg.setBackgroundColor(Color.TRANSPARENT);
        b0kg.setBackgroundColor(Color.TRANSPARENT);
        bsmallkg.setBackgroundColor(Color.TRANSPARENT);

        KG.setEnabled(false);
        LBS.setEnabled(false);
        KG.setTextColor(Color.BLACK);
        LBS.setTextColor(Color.BLACK);

        b25kg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(!remove){
                    val1 = Double.parseDouble(KG.getText().toString());
                    val1 += 25.00;
                    val3 = Double.parseDouble(LBS.getText().toString());
                    val3 += 55.1156;
                    KG.setText(String.valueOf(val1));
                    LBS.setText(String.valueOf(val3));
                }else{
                    val2 = Double.parseDouble(KG.getText().toString());
                    val2 -= 25.00;
                    val4 = Double.parseDouble(LBS.getText().toString());
                    val4 -= 55.1156;

                    if (val2 < 0) {
                        val2 = 0.00;
                    }
                    if (val4 < 0) {
                        val4 = 0.00;
                    }
                    KG.setText(String.valueOf(val2));
                    LBS.setText(String.valueOf(val4));
                }
            }
        });

        b20kg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(!remove){
                    val1 = Double.parseDouble(KG.getText().toString());
                    val1 += 20.00;
                    val3 = Double.parseDouble(LBS.getText().toString());
                    val3 += 44.0925;
                    KG.setText(String.valueOf(val1));
                    LBS.setText(String.valueOf(val3));
                }else{
                    val2 = Double.parseDouble(KG.getText().toString());
                    val2 -= 20.00;
                    val4 = Double.parseDouble(LBS.getText().toString());
                    val4 -= 44.0925;

                    if(val2 < 0){
                        val2 = 0.00;
                    }
                    if(val4 < 0){
                        val4 = 0.00;
                    }
                    KG.setText(String.valueOf(val2));
                    LBS.setText(String.valueOf(val4));
                }
            }
        });

        b15kg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(!remove){
                    val1 = Double.parseDouble(KG.getText().toString());
                    val1 += 15.00;
                    val3 = Double.parseDouble(LBS.getText().toString());
                    val3 += 33.0693;
                    KG.setText(String.valueOf(val1));
                    LBS.setText(String.valueOf(val3));
                }else{
                    val2 = Double.parseDouble(KG.getText().toString());
                    val2 -= 15.00;
                    val4 = Double.parseDouble(LBS.getText().toString());
                    val4 -= 33.0693;

                    if(val2 < 0) {
                        val2 = 0.00;
                    }
                    if(val4 < 0){
                        val4 = 0.00;
                    }
                    KG.setText(String.valueOf(val2));
                    LBS.setText(String.valueOf(val4));
                }
            }
        });

        b10kg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(!remove){
                    val1 = Double.parseDouble(KG.getText().toString());
                    val1 += 10.00;
                    val3 = Double.parseDouble(LBS.getText().toString());
                    val3 += 22.0462;
                    KG.setText(String.valueOf(val1));
                    LBS.setText(String.valueOf(val3));
                }else{
                    val2 = Double.parseDouble(KG.getText().toString());
                    val2 -= 10.00;
                    val4 = Double.parseDouble(LBS.getText().toString());
                    val4 -= 22.0462;

                    if(val2 < 0) {
                        val2 = 0.00;
                    }
                    if(val4 < 0){
                        val4 = 0.00;
                    }
                    KG.setText(String.valueOf(val2));
                    LBS.setText(String.valueOf(val4));
                }
            }
        });

        b5kg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(!remove){
                    val1 = Double.parseDouble(KG.getText().toString());
                    val1 += 5.00;
                    val3 = Double.parseDouble(LBS.getText().toString());
                    val3 += 11.0231;
                    KG.setText(String.valueOf(val1));
                    LBS.setText(String.valueOf(val3));
                }else{
                    val2 = Double.parseDouble(KG.getText().toString());
                    val2 -= 5.00;
                    val4 = Double.parseDouble(LBS.getText().toString());
                    val4 -= 11.0231;

                    if(val2 < 0){
                        val2 = 0.00;
                    }
                    if(val4 < 0){
                        val4 = 0.00;
                    }
                    KG.setText(String.valueOf(val2));
                    LBS.setText(String.valueOf(val4));
                }
            }
        });

        b2kg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(!remove){
                    val1 = Double.parseDouble(KG.getText().toString());
                    val1 += 2.50;
                    val3 = Double.parseDouble(LBS.getText().toString());
                    val3 += 5.51156;
                    KG.setText(String.valueOf(val1));
                    LBS.setText(String.valueOf(val3));
                }else{
                    val2 = Double.parseDouble(KG.getText().toString());
                    val2 -= 2.50;
                    val4 = Double.parseDouble(LBS.getText().toString());
                    val4 -= 5.51156;

                    if(val2 < 0){
                        val2 = 0.00;
                    }
                    if(val4 < 0){
                        val4 = 0.00;
                    }
                    KG.setText(String.valueOf(val2));
                    LBS.setText(String.valueOf(val4));
                }
            }
        });

        b1kg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(!remove){
                    val1 = Double.parseDouble(KG.getText().toString());
                    val1 += 1.25;
                    val3 = Double.parseDouble(LBS.getText().toString());
                    val3 += 2.755778;
                    KG.setText(String.valueOf(val1));
                    LBS.setText(String.valueOf(val3));
                }else{
                    val2 = Double.parseDouble(KG.getText().toString());
                    val2 -= 1.25;
                    val4 = Double.parseDouble(LBS.getText().toString());
                    val4 -= 2.755778;

                    if(val2 < 0){
                        val2 = 0.00;
                    }
                    if(val4 < 0){
                        val4 = 0.00;
                    }
                    KG.setText(String.valueOf(val2));
                    LBS.setText(String.valueOf(val4));
                }
            }
        });

        b0kg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(!remove){
                    val1 = Double.parseDouble(KG.getText().toString());
                    val1 += 0.50;
                    val3 = Double.parseDouble(LBS.getText().toString());
                    val3 += 1.10231;
                    KG.setText(String.valueOf(val1));
                    LBS.setText(String.valueOf(val3));
                }else{
                    val2 = Double.parseDouble(KG.getText().toString());
                    val2 -= 0.50;
                    val4 = Double.parseDouble(LBS.getText().toString());
                    val4 -= 1.10231;

                    if(val2 < 0){
                        val2 = 0.00;
                    }
                    if(val4 < 0){
                        val4 = 0.00;
                    }
                    KG.setText(String.valueOf(val2));
                    LBS.setText(String.valueOf(val4));
                }
            }
        });

        bsmallkg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(!remove){
                    val1 = Double.parseDouble(KG.getText().toString());
                    val1 += 0.25;
                    val3 = Double.parseDouble(LBS.getText().toString());
                    val3 += 0.5511557;
                    KG.setText(String.valueOf(val1));
                    LBS.setText(String.valueOf(val3));
                }else{
                    val2 = Double.parseDouble(KG.getText().toString());
                    val2 -= 0.50;
                    val4 = Double.parseDouble(LBS.getText().toString());
                    val4 -= 0.5511557;

                    if(val2 < 0){
                        val2 = 0.00;
                    }
                    if(val4 < 0){
                        val4 = 0.00;
                    }
                    KG.setText(String.valueOf(val2));
                    LBS.setText(String.valueOf(val4));
                }
            }
        });

        bclear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                KG.setText(String.valueOf(0.00));
                LBS.setText(String.valueOf(0.00));
            }
        });

        brem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!remove){
                    remove = true;
                    brem.setText(R.string.rem);
                    brem.setBackgroundColor(Color.parseColor("red"));
                }else{
                    remove = false;
                    brem.setText(R.string.add);
                    brem.setBackgroundColor(Color.parseColor("green"));
                }
            }
        });

        buttonTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, TimeActivity.class);
                startActivity(intent);
            }
        });
    }
}
