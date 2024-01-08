package com.example.ex6;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.util.Random;


public class MainActivity extends AppCompatActivity {
    Button btn;

    ImageView iv;

    int rndNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        iv = findViewById(R.id.iv);


    }



    public void clicked(View view) {
        Random rnd = new Random();
        rndNum= rnd.nextInt(3)+1;
        btn.setText(String.valueOf(rndNum));
        if (rndNum==1){
            iv.setImageResource(R.drawable.minion1);
        }
        if (rndNum==2){
            iv.setImageResource(R.drawable.minion2);
        }
        if (rndNum==3){
            iv.setImageResource(R.drawable.minion3n);
        }
    }
}