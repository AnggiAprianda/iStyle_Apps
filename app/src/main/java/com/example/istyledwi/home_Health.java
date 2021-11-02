package com.example.istyledwi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class home_Health extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_health);
    }

    public void pindah2(View view) {
        Intent intent = new Intent(home_Health.this,home_fashion.class);
        startActivity(intent);
    }
}
