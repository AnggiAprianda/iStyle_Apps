package com.example.istyledwi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class activity_home extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_beauty);
    }

    public void pindah(View view) {
        Intent intent = new Intent(activity_home.this,home_Health.class);
        startActivity(intent);

    }
    public void more(View view) {
        Intent intent = new Intent(activity_home.this,beauty_artikel.class);
        startActivity(intent);

    }

    public void profile(View view) {
        Intent intent = new Intent(activity_home.this,activity_chat.class);
        startActivity(intent);

    }
}