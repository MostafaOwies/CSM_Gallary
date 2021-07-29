package com.example.section3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import static androidx.constraintlayout.motion.utils.Oscillator.TAG;

public class MainActivity extends AppCompatActivity {


    int count = 1;
    public void fade(View view ){

        ImageView power = findViewById(R.id.power);
        ImageView akiPower=findViewById(R.id.akiPower);
        ImageView csmGirls = findViewById(R.id.csmGirls);
        ImageView makima = findViewById(R.id.makima);
        ImageView makima2= findViewById(R.id.makima2);
        ImageView makima3= findViewById(R.id.makima3);
        ImageView reze = findViewById(R.id.reze);
        ImageView kobeni = findViewById(R.id.kobeni);

        if (count == 1) {
             count=2;
            akiPower.animate().alpha(0).setDuration(2000);
            power.animate().alpha(1).setDuration(2000);
        }
        else if (count==2){
            count=3;
            power.animate().alpha(0).setDuration(2000);
            csmGirls.animate().alpha(1).setDuration(2000);
        }
        else if (count==3){
            count=4;
            csmGirls.animate().alpha(0).setDuration(2000);
            makima.animate().alpha(1).setDuration(2000);
        }
        else if (count==4){
            count=5;
            makima.animate().alpha(0).setDuration(2000);
            makima2.animate().alpha(1).setDuration(2000);
        }
        else if (count==5){
            count=6;
            makima2.animate().alpha(0).setDuration(2000);
            makima3.animate().alpha(1).setDuration(2000);
        }
        else if (count==6){
            count=7;
            makima3.animate().alpha(0).setDuration(2000);
            reze.animate().alpha(1).setDuration(2000);
        }
        else if (count==7){
            count=8;
            reze.animate().alpha(0).setDuration(2000);
            kobeni.animate().alpha(1).setDuration(2000);
        }
        else if (count==8){
            count=1;
            kobeni.animate().alpha(0).setDuration(2000);
            akiPower.animate().alpha(1).setDuration(2000);
        }


    }
    public void  fadeIN(View view){
        Log.i(TAG, "fade: hello");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}