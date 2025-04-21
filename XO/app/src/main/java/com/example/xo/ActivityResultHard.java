package com.example.xo;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;


public class ActivityResultHard extends Dialog {

    private final String messageHard;
    private final ActivityTwoPlayerHard activityTwoPlayerHard;

    public ActivityResultHard(@NonNull Context context, String messageHard, ActivityTwoPlayerHard activityTwoPlayerHard) {
        super(context);
        this.messageHard = messageHard;
        this.activityTwoPlayerHard = activityTwoPlayerHard;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_hard);

        TextView messageHard2 = findViewById(R.id.messageTextHard);
        Button gameStartNew = findViewById(R.id.buttonHard);
        messageHard2.setText(messageHard);

        gameStartNew.setOnClickListener(view -> {
            activityTwoPlayerHard.restartGameHard();
            dismiss();
        });

    }
}