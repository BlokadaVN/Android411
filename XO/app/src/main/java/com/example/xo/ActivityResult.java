package com.example.xo;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class ActivityResult extends Dialog {

    private final String message;
    private final ActivityTwoPlayerEasy activityTwoPlayer;

    public ActivityResult(@NonNull Context context, String message, ActivityTwoPlayerEasy activityTwoPlayer) {
        super(context);
        this.message = message;
        this.activityTwoPlayer = activityTwoPlayer;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView messageText = findViewById(R.id.messageText);
        Button startNew = findViewById(R.id.button);
        messageText.setText(message);

        startNew.setOnClickListener(view -> {
            activityTwoPlayer.restartGame();
            dismiss(); // закрытие окна.
        });
    }
}