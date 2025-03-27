package com.example.second;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {

    private MediaPlayer sound1, sound2; // Переменные для звука.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ImageButton img1 = findViewById(R.id.buttonImg1);
        ImageButton img2 = findViewById(R.id.buttonImg2);
        Button btnStop = findViewById(R.id.buttonStop);

        sound1 = MediaPlayer.create(this, R.raw.sound_1); // Подключили звук к первой переменной.
        sound2 = MediaPlayer.create(this, R.raw.sound_2);

        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sound1.isPlaying()) {
                    sound1.pause();
                    sound1.seekTo(0);
                }
                if (sound2.isPlaying()) {
                    sound2.pause();
                    sound2.seekTo(0);
                }
            }
        });

        img1.setOnClickListener(new View.OnClickListener() { // Звук для img1
            @Override
            public void onClick(View view) {
                soundPlayButton(sound1, sound2);
            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPlayButton(sound2, sound1);
            }
        });

// Вариант перехода с активити на активити с переопределением метода.
        Button btn = findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    // Метод для вызова звука
    public void soundPlayButton(MediaPlayer sound1, MediaPlayer sound2) {
        if (sound1.isPlaying()) {
//            sound1.stop();
            sound1.pause();
            sound2.seekTo(0); // Второй звук будет производиться с 0 секунды. Чтоб не было продолжения звука с паузы, а проигрывался сначала.
            sound1.setLooping(false);
        }
        if (sound2.isPlaying()) {
//            sound2.stop();
            sound2.pause();
            sound1.seekTo(0);
            sound2.setLooping(false);
        }
        sound1.start();
        sound1.setLooping(true); // Зацикливание звука.

    }


//    public void goBack(View view) {
//        Intent intent = new Intent(this, MainActivity.class);
//        startActivity(intent);
//    }
}