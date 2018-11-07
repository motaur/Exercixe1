package com.example.room53.exercixe1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    String text;
    EditText edit;
    String[] addresses = {"berlinkovle@gmail.com"};

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit = findViewById(R.id.edit);
    }



    public void openActivity( View view ) {
        text = edit.getText().toString();
        SecondActivity.start(this, text);
    }

    public void openEmail( View view ) {
        text = edit.getText().toString();
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("*/*");
        intent.putExtra(Intent.EXTRA_EMAIL, addresses);
        intent.putExtra(Intent.EXTRA_SUBJECT, "The message I wrote on my app");
        intent.putExtra(Intent.EXTRA_TEXT, text);


        if (intent.resolveActivity(getPackageManager()) != null)
            startActivity(intent);

    }
}
