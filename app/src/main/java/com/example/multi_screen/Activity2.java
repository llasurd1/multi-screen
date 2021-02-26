package com.example.multi_screen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.multi_screen.model.Ping;

import java.util.Locale;

public class Activity2 extends AppCompatActivity {

    private Ping pinger;
    Button act2_button;
    TextView textPings2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        act2_button = findViewById(R.id.act2_button);
        textPings2 = (TextView) findViewById(R.id.textPings);
    }
    public void switch2_activites(View view) {
        pinger.pressed();
        textPings2.setText(pinger.getNumPressed());
        Intent act2_action =  new Intent(this, MainActivity.class);
        startActivity(act2_action);

    }
}