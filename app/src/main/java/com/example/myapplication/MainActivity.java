package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.Nandes);
        textView.setText("wkwkwkwkw");
        // untuk memunculkan elemen-elemen yang ada di xml
    }

    @Override
    protected void onStart() {
        super.onStart();
        try {
            System.out.println("Nandes onStart");
            textView.setText("papapappaa");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("Nandes onResume");
        textView.setText("ckckckckc");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("Nandes onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("Nandes onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("Nandes onDestroy");
    }
}