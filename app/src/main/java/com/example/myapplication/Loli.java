package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Loli extends AppCompatActivity {
    private ImageView droit;
    private ImageView foundit;
    private ImageView gauche;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loli);
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

    }
    private void openHomeActivity() {
        Intent intent = new Intent(Loli.this, Home.class);
        startActivity(intent);
        finish();
    }
    private void openGaucheActivity() {
        Intent intent = new Intent(Loli.this, Home.class);
        startActivity(intent);
        finish();
    }
    private void openDroitActivity() {
        Intent intent = new Intent(Loli.this, Home.class);
        startActivity(intent);
        finish();
    }
}