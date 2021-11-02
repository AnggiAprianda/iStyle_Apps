package com.example.istyledwi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class home_fashion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_fashion);
    }

    public void outfit(View view) {
            Intent intent = new Intent(home_fashion.this,chooseyour_outfit.class);
            startActivity(intent);

    }
}