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
public class Hotels4 extends AppCompatActivity implements AdapterView.OnItemSelectedListener, View.OnClickListener{
    ImageButton maps1,web1,tel1,maps2,web2,tel2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels4);
        ImageView hotelImage1 = findViewById(R.id.hotelImage1);
        ImageView hotelImage2 = findViewById(R.id.hotelImage2);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.hotels_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setSelection(0);
        spinner.setOnItemSelectedListener(this);

        Glide.with(this)
                .load("https://lh3.googleusercontent.com/gps-proxy/AFm_dcQS_RgQ_X-hcD9CdfVfiEG9z8C1IfInYFcfX2A238RGLA8AXhgYNeqdkxVpRMbkcC99Oneggla4aQ2HdZ6pn3PF3eJjbui3wOM49XCHzjQqavKbrkC51cKN7eSkVzOA2WBwTfU928W1LYp1sCwDTsHAjz1oahnkUtpj_PS7UTc-0Y2Yvl5J3gy7hw=w287-h192-n-k-rw-no-v1")
                .centerCrop()
                .transition(DrawableTransitionOptions.withCrossFade())
                .into(hotelImage1);

        Glide.with(this)
                .load("https://lh3.googleusercontent.com/gps-proxy/AFm_dcRRZzt4z-w3130XtPKXhI_SsTKFxuIL4ygs0h1ksv22FRVGot3YErlO10-sENqztJbLQ5BSgJtEbzDvusBnDPS6Gh7JVxLYrmKycnBMDxuxkwIwm2mGaQci06d8iXHqCH7biJemxKDYNEZ6Qx6DsRBHhFMVCpVOMhFPsM-diMAM0Xc6MGrHS4Cy1A=w287-h192-n-k-rw-no-v1")
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
            Intent intent = new Intent(Hotels4.this,Hotels.class);
            startActivity(intent);
        } else if (opcionSeleccionada.equals("2 Estrelles")) {
            Intent intent = new Intent(Hotels4.this,Hotels2.class);
            startActivity(intent);
        } else if (opcionSeleccionada.equals("3 Estrelles")) {
            Intent intent = new Intent(Hotels4.this,Hotels3.class);
            startActivity(intent);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.maps1){
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:41.601093860162926, 2.2961715955375706"));
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        }
        if (v.getId() == R.id.maps2){
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:41.60097791461321, 2.2858840648523158"));
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        }
        if (v.getId() == R.id.tel1){
            Intent callIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "938 79 62 20"));
            startActivity(callIntent);
        }
        if (v.getId() == R.id.tel2){
            Intent callIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "938 79 48 20"));
            startActivity(callIntent);
        }
        if (v.getId() == R.id.web1){
            Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.hotelciutatgranollers.com/en/?utm_source=google&utm_medium=organic&utm_campaign=GoogleMyBusiness&utm_content=Granollers&partner=8979"));
            startActivity(webIntent);
        }
        if (v.getId() == R.id.web2){
            Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.aparthotelateneavalles.com/es/"));
            startActivity(webIntent);
        }
    }
}