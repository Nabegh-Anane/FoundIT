package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class Home extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private ImageView SettingImageView;
    private ImageView profileCirclaImageView2;
    private ImageView rechercherImageView;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        SettingImageView = findViewById(R.id.profileCircleImageView);
        SettingImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSettingsActivity();
            }
        });

        profileCirclaImageView2 = findViewById(R.id.profileCirclaImageView2);
        profileCirclaImageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSyncroActivity();
            }
        });

        rechercherImageView = findViewById(R.id.rechercher);
        rechercherImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String selectedItem = spinner.getSelectedItem().toString();
                if (selectedItem.equals("My_Dog_DIANA")) {
                    openDianaActivity();
                } else if (selectedItem.equals("My_Cat_LOLI")) {
                    openLoliActivity();
                } else if (selectedItem.equals("MY_car_KEYS")) {
                    openKeysActivity();
                }
            }
        });

        spinner = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.items_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }

    private void openSettingsActivity() {
        Intent intent = new Intent(Home.this, Settings.class);
        startActivity(intent);
        finish();
    }

    private void openSyncroActivity() {
        Intent intent = new Intent(Home.this, MapsActivity.class);
        startActivity(intent);
        finish();
    }

    private void openDianaActivity() {
        Intent intent = new Intent(Home.this, Diana.class);
        startActivity(intent);
    }

    private void openLoliActivity() {
        Intent intent = new Intent(Home.this, Loli.class);
        startActivity(intent);
    }

    private void openKeysActivity() {
        Intent intent = new Intent(Home.this, Keys.class);
        startActivity(intent);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String selectedItem = parent.getItemAtPosition(position).toString();
        // TODO: Handle selection if needed
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        // TODO: Handle empty selection if needed
    }
}
