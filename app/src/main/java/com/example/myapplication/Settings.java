package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Settings extends AppCompatActivity {
    private ImageView droit;
    private ImageView foundit;
    private ImageView gauche;
    private TextView logout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        droit = findViewById(R.id.droit);
        droit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDroitActivity();
            }
        });        droit = findViewById(R.id.profileCircleImageView);

        gauche = findViewById(R.id.gauche);
        gauche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGaucheActivity();
            }
        });        gauche = findViewById(R.id.profileCircleImageView);

        foundit = findViewById(R.id.foundit);
        foundit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomeActivity();
            }
        });        foundit = findViewById(R.id.profileCircleImageView);

        logout = findViewById(R.id.EiaTaa);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openlogoutPassActivity();
            }
        });
    }

    private void openHomeActivity() {
        Intent intent = new Intent(Settings.this, Home.class);
        startActivity(intent);
        finish();
    }
    private void openGaucheActivity() {
        Intent intent = new Intent(Settings.this, Home.class);
        startActivity(intent);
        finish();
    }
    private void openDroitActivity() {
        Intent intent = new Intent(Settings.this, Home.class);
        startActivity(intent);
        finish();
    }

    private void openlogoutPassActivity() {
        Intent intent = new Intent(Settings.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}