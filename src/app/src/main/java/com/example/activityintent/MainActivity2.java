package com.example.activityintent;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Button back = (Button) findViewById(R.id.willback);

        back.setOnClickListener(v -> super.onBackPressed());

    }
}
