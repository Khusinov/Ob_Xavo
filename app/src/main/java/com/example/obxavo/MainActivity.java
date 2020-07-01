package com.example.obxavo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView date ,city , temp , type ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        date = findViewById(R.id.date);
        city = findViewById(R.id.city);
        temp = findViewById(R.id.temp);
        type = findViewById(R.id.type);


    }
}