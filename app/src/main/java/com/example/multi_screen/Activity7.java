package com.example.multi_screen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.multi_screen.model.Ping;

import java.util.Locale;

public class Activity7 extends AppCompatActivity {


    Button act_button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_7);
        act_button3 = findViewById(R.id.act_button3);

    }

    public void switch_activites(View view) {
        Intent act_action = new Intent(this, Activity7.class);
        startActivity(act_action);
    }
}
