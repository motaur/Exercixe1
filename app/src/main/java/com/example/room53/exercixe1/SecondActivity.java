package com.example.room53.exercixe1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView text;
    static String message = "null";


    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        text = findViewById(R.id.text);
        text.setText(message);
    }

    public static void start( Context context, String text ) {
        Intent intent = new Intent(context, SecondActivity.class);
        context.startActivity(intent);

        message = text;
    }
}