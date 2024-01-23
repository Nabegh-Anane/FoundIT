package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Activate extends AppCompatActivity {

    private ImageView fingerprintImageView;
    private Button loginButton;
    private TextView forgetPassTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activate);

        fingerprintImageView = findViewById(R.id.fingeRprint);
        loginButton = findViewById(R.id.loginButton);
        forgetPassTextView = findViewById(R.id.forgetPass);

        fingerprintImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomeActivity();
            }
        });

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomeActivity();
            }
        });

        forgetPassTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openForgetPassActivity();
            }
        });
    }

    private void openHomeActivity() {
        Intent intent = new Intent(Activate.this, Home.class);
        startActivity(intent);
        finish();
    }

    private void openForgetPassActivity() {
        Intent intent = new Intent(Activate.this, forget_pass.class);
        startActivity(intent);
    }
}
