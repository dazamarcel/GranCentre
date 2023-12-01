package com.example.grancentre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Movies extends AppCompatActivity implements View.OnClickListener {
    String url;
    ImageButton b1,b2,b3,b4,b5,b6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);
        b1 = findViewById(R.id.b1);
        b1.setOnClickListener(this);
        b2 = findViewById(R.id.b2);
        b2.setOnClickListener(this);
        b3 = findViewById(R.id.b3);
        b3.setOnClickListener(this);
        b4 = findViewById(R.id.b4);
        b4.setOnClickListener(this);
        b5 = findViewById(R.id.b5);
        b5.setOnClickListener(this);
        b6 = findViewById(R.id.b6);
        b6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(R.id.b1 == v.getId()){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=wb59_A2vUCk"));
            startActivity(intent);
        }
        if(R.id.b2 == v.getId()){
            TextView textDescription = findViewById(R.id.textDescription);
            textDescription.setText("Horario: 16:00   17:00   18:10  19:15   20:20   22:30");
        }
        if(R.id.b3 == v.getId()){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=mQxbZubEv3A"));
            startActivity(intent);
        }
        if(R.id.b4 == v.getId()){
            TextView textDescription = findViewById(R.id.textDescription1);
            textDescription.setText("Horario: 16:00   18:15   20:30   21:20   22:45");
        }
        if(R.id.b5 == v.getId()){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=gYApro2YXQQ"));
            startActivity(intent);
        }
        if(R.id.b6 == v.getId()){
            TextView textDescription = findViewById(R.id.textDescription2);
            textDescription.setText("Horario: 18:00   22:30");
        }
    }
}