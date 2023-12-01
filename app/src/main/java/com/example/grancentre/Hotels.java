package com.example.grancentre;

import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;

import java.lang.reflect.Array;

public class Hotels extends AppCompatActivity implements AdapterView.OnItemSelectedListener, View.OnClickListener{
    ImageButton maps1,web1,tel1,maps2,web2,tel2,maps3,web3,tel3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);
        ImageView hotelImage1 = findViewById(R.id.hotelImage1);
        ImageView hotelImage2 = findViewById(R.id.hotelImage2);
        ImageView hotelImage3 = findViewById(R.id.hotelImage3);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.hotels_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setSelection(0);
        spinner.setOnItemSelectedListener(this);
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
        maps3 = findViewById(R.id.maps3);
        maps3.setOnClickListener(this);
        tel3 = findViewById(R.id.tel3);
        tel3.setOnClickListener(this);
        web3 = findViewById(R.id.web3);
        web3.setOnClickListener(this);

        Glide.with(this)
                .load("https://cf.bstatic.com/xdata/images/hotel/max1024x768/363155885.jpg?k=b4461ea0547db6e7a4ff87cf1d0080c2077a9c6816aad3a6b148323dddbd93e5&o=&hp=1")
                .centerCrop()
                .transition(DrawableTransitionOptions.withCrossFade()) // Opcional: transición animada
                .into(hotelImage1);
        Glide.with(this)
                .load("https://lh3.googleusercontent.com/gps-proxy/AFm_dcRRZzt4z-w3130XtPKXhI_SsTKFxuIL4ygs0h1ksv22FRVGot3YErlO10-sENqztJbLQ5BSgJtEbzDvusBnDPS6Gh7JVxLYrmKycnBMDxuxkwIwm2mGaQci06d8iXHqCH7biJemxKDYNEZ6Qx6DsRBHhFMVCpVOMhFPsM-diMAM0Xc6MGrHS4Cy1A=w408-h271-k-no")
                .centerCrop()
                .transition(DrawableTransitionOptions.withCrossFade()) // Opcional: transición animada
                .into(hotelImage2);
        Glide.with(this)
                .load("https://lh3.googleusercontent.com/gps-proxy/AFm_dcQS_RgQ_X-hcD9CdfVfiEG9z8C1IfInYFcfX2A238RGLA8AXhgYNeqdkxVpRMbkcC99Oneggla4aQ2HdZ6pn3PF3eJjbui3wOM49XCHzjQqavKbrkC51cKN7eSkVzOA2WBwTfU928W1LYp1sCwDTsHAjz1oahnkUtpj_PS7UTc-0Y2Yvl5J3gy7hw=w408-h306-k-no")
                .centerCrop()
                .transition(DrawableTransitionOptions.withCrossFade()) // Opcional: transición animada
                .into(hotelImage3);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
        String opcionSeleccionada = parent.getItemAtPosition(position).toString();
        if (opcionSeleccionada.equals("2 Estrelles")) {
            Intent intent = new Intent(Hotels.this,Hotels2.class);
            startActivity(intent);
        } else if (opcionSeleccionada.equals("3 Estrelles")) {
            Intent intent = new Intent(Hotels.this,Hotels3.class);
            startActivity(intent);
        } else if (opcionSeleccionada.equals("4 Estrelles")) {
            Intent intent = new Intent(Hotels.this,Hotels4.class);
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
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:41.60100198325288, 2.2859269801949367"));
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        }
        if (v.getId() == R.id.maps3){
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:41.60106176868707, 2.2961394090306047"));
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        }
        if (v.getId() == R.id.tel1){
            Intent callIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+"938 40 71 32"));
            startActivity(callIntent);
        }
        if (v.getId() == R.id.tel2){
            Intent callIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "938 79 48 20"));
            startActivity(callIntent);
        }
        if (v.getId() == R.id.tel3){
            Intent callIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "938 79 62 20"));
            startActivity(callIntent);
        }
        if (v.getId() == R.id.web1){
            Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.hotel-bb.com/es/hotel/barcelona-granollers"));
            startActivity(webIntent);
        }
        if (v.getId() == R.id.web2){
            Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.aparthotelateneavalles.com/es/"));
            startActivity(webIntent);
        }
        if (v.getId() == R.id.web3){
            Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.hotelciutatgranollers.com/en/?utm_source=google&utm_medium=organic&utm_campaign=GoogleMyBusiness&utm_content=Granollers&partner=8979"));
            startActivity(webIntent);
        }
    }
}