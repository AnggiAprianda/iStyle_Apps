package com.example.istyledwi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class outfit_kampus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outfit_kampus);
    }

    public void chat(View view) {
            Intent intent = new Intent(outfit_kampus.this,activity_login.class);
            startActivity(intent);

        }
}