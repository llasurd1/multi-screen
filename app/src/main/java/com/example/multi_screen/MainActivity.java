package com.example.multi_screen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.multi_screen.model.Ping;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {


    Button act_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        act_button = findViewById(R.id.act_button);

    }

    public void switch_activites(View view) {
        Intent act_action =  new Intent(this, Activity2.class);
        startActivity(act_action);
    }
}