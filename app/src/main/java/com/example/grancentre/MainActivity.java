package com.example.grancentre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton b1,b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.b1);
        b1.setOnClickListener(this);
        b3 = findViewById(R.id.b3);
        b3.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.b1){
            Intent intent = new Intent(this, Hotels.class); //.class és l'arxiu java compilat
            startActivity(intent);
        }
        if (v.getId() == R.id.b3){
            Intent intent = new Intent(this, Movies.class); //.class és l'arxiu java compilat
            startActivity(intent);
        }
    }
}