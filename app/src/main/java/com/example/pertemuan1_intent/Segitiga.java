package com.example.pertemuan1_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Segitiga extends AppCompatActivity {
    EditText input_alas, input_tinggi;
    Button btn_luas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);
    }
}