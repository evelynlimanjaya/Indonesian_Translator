package com.elimanjaya.indonesiantranslator;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
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

        morningBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.pagi);

                mp.start();

            }
        });

        afternoonBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.siang);

                mp.start();

            }
        });

        eveningBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.malam);

                mp.start();

            }
        });

        howBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.kabar);

                mp.start();

            }
        });

        byeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.tinggal);

                mp.start();

            }
        });
    }
}