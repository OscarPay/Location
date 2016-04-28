package com.example.user.location;

import android.location.Location;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final double DISTANCE = 50.0;
    private boolean hasBeenNotify = false;
    private Location centro = new Location("");
    private TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        centro.setLatitude(21.048234);
        centro.setLongitude(-89.644263);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.tv_location);




    }
}
