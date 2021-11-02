package com.example.istyledwi;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class activity_saved_screen_2 extends AppCompatActivity {

    int[] image =new int[]{
            R.drawable.saved_foto_gaun, R.drawable.saved_foto_diet
    };

    String[] headline = new String[]{
            "Inspirasi Gaun Pengantin", "Tips Kurus Dalam Seminggu"
    };
    String[] desc = new String[]{
            "Upload by belle","Upload by ucup "
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saved_screen_2);

        ListView listView = findViewById(R.id.list_view);

        List<HashMap<String,String>> list = new ArrayList<>();

        for(int i=0; i<2; i++){
            HashMap<String,String> hashMap = new HashMap<>();
            hashMap.put("image",Integer.toString(image[i]));
            hashMap.put("headline", headline[i]);
            hashMap.put("desc", desc[i]);
            list.add(hashMap);

        }
        String[] from= {"image","headline","desc"};
        int[] to = {R.id.imageView,R.id.textViewHeadline,R.id.description};

        SimpleAdapter simpleAdapter = new SimpleAdapter(getBaseContext(), list, R.layout.activity_saved_screen_2, from, to);
        listView.setAdapter(simpleAdapter);


    }
}