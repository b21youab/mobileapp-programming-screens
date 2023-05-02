package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ViewActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

      //  TextView newView =findViewById(R.id.textViewName);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String name = extras.getString("name");



            TextView nameView = findViewById(R.id. textViewViewName);
            nameView.setText(name);

              }


    }
}