package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ViewActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        Bundle extras = getIntent().getExtras();

        TextView newView =findViewById(R.id.textViewName);
        if (extras != null) {

            String name = extras.getString("name");
            int number = extras.getInt("number");
           // editTextName.setText(String.valueOf(newView));

            newView.setText(name);

              }


    }
}