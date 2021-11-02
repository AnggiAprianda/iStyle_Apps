package com.example.istyledwi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class health_more extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_more);

    }

    public void back (View view){
        startActivity(new Intent(getApplicationContext(),activity_home.class));

    }
}