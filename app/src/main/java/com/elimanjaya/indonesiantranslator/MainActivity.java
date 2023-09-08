package com.elimanjaya.indonesiantranslator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button morningBtn, afternoonBtn, eveningBtn, howBtn, byeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        morningBtn = findViewById(R.id.goodMorningBtn);
        afternoonBtn = findViewById(R.id.goodAfternoonBtn);
        eveningBtn = findViewById(R.id.goodEveningBtn);
        howBtn = findViewById(R.id.howAreYouBtn);
        byeBtn = findViewById(R.id.goodByeBtn);
    }
}