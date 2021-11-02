package com.example.istyledwi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class chooseyour_outfit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chooseyour_outfit);
    }

             public void outfitKampus(View view) {
            Intent intent = new Intent(chooseyour_outfit.this,outfit_kampus.class);
            startActivity(intent);

        }
}