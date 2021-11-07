package com.example.activityintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(MainActivity.this, MainActivity2.class);

        Button btn_1 = (Button) findViewById(R.id.button_1);
        Button btn_2 = (Button) findViewById(R.id.button_2);

        btn_1.setOnClickListener(v -> {
            CharSequence text = "Botão 1 foi pressionado!";
            int duration = Toast.LENGTH_LONG;
            Toast.makeText(getApplicationContext(), text, duration).show();

        });

        btn_2.setOnClickListener(v -> startActivity(intent));
    }

}