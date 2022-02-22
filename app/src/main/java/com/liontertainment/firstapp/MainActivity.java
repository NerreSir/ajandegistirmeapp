package com.liontertainment.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ResmiDegistir(View view){
        //Button button = findViewById(R.id.button); //butona basıldığında değişiklik yaptırır
        ImageView imageView = findViewById(R.id.jett);
        imageView.setImageResource(R.drawable.raze);
    }

}