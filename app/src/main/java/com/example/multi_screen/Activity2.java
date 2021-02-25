package com.example.multi_screen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {

    Button act2_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        act2_button = findViewById(R.id.act2_button);
    }
    public void switch2_activites(View view) {
        Intent act2_action =  new Intent(this, MainActivity.class);
        startActivity(act2_action);
    }
}