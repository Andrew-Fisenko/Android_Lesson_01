package com.example.android_lesson_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("calc://start");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);

                startActivity(Intent.createChooser(intent, ""));

//                Intent i = new Intent(MainActivity.this, RegistrationActivity.class);
//                startActivity(i);
            }
        });
    }


}