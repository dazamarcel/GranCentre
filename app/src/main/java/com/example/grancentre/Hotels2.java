package com.example.grancentre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
public class Hotels2 extends AppCompatActivity implements AdapterView.OnItemSelectedListener, View.OnClickListener{
    ImageButton maps1,web1,tel1,maps2,web2,tel2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels2);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ImageView hotelImage1 = findViewById(R.id.hotelImage1);
        ImageView hotelImage2 = findViewById(R.id.hotelImage2);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.hotels_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setSelection(0);
        spinner.setOnItemSelectedListener(this);

        Glide.with(this)
                .load("https://cf.bstatic.com/xdata/images/hotel/max1024x768/363155885.jpg?k=b4461ea0547db6e7a4ff87cf1d0080c2077a9c6816aad3a6b148323dddbd93e5&o=&hp=1")
                .centerCrop()
                .transition(DrawableTransitionOptions.withCrossFade()) // Opcional: transición animada
                .into(hotelImage1);
        Glide.with(this)
                .load("https://www.ahstatic.com/photos/6410_ho_00_p_1024x768.jpg")
                .centerCrop()
                .transition(DrawableTransitionOptions.withCrossFade()) // Opcional: transición animada
                .into(hotelImage2);
        maps1 = findViewById(R.id.maps1);
        maps1.setOnClickListener(this);
        tel1 = findViewById(R.id.tel1);
        tel1.setOnClickListener(this);
        web1 = findViewById(R.id.web1);
        web1.setOnClickListener(this);
        maps2 = findViewById(R.id.maps2);
        maps2.setOnClickListener(this);
        tel2 = findViewById(R.id.tel2);
        tel2.setOnClickListener(this);
        web2 = findViewById(R.id.web2);
        web2.setOnClickListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
        String opcionSeleccionada = parent.getItemAtPosition(position).toString();
        if (opcionSeleccionada.equals("Hotels")) {
            Intent intent = new Intent(Hotels2.this,Hotels.class);
            startActivity(intent);
        } else if (opcionSeleccionada.equals("3 Estrelles")) {
            Intent intent = new Intent(Hotels2.this,Hotels3.class);
            startActivity(intent);
        } else if (opcionSeleccionada.equals("4 Estrelles")) {
            Intent intent = new Intent(Hotels2.this,Hotels4.class);
            startActivity(intent);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.maps1){
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:41.61421043871295, 2.303885395538346"));
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        }
        if (v.getId() == R.id.maps2){
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:41.571311469924865, 2.2653170955357083"));
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        }
        if (v.getId() == R.id.tel1){
            Intent callIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+"938 40 71 32"));
            startActivity(callIntent);
        }
        if (v.getId() == R.id.tel2){
            Intent callIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "935 68 90 60"));
            startActivity(callIntent);
        }

        if (v.getId() == R.id.web1){
            Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.hotel-bb.com/es/hotel/barcelona-granollers"));
            startActivity(webIntent);
        }
        if (v.getId() == R.id.web2){
            Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://all.accor.com/hotel/5258/index.es.shtml?utm_campaign=seo+maps&utm_medium=seo+maps&utm_source=google+Maps"));
            startActivity(webIntent);
        }

    }
}