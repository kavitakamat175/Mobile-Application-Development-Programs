package com.example.locationapp;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.*;
import com.google.android.gms.maps.model.*;

public class MainActivity extends AppCompatActivity
        implements OnMapReadyCallback {
    GoogleMap map;

    @Override
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.activity_main);

        SupportMapFragment f = (SupportMapFragment)
                getSupportFragmentManager()
                        .findFragmentById(R.id.map);

        if (f != null)
            f.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap gMap) {

        map = gMap;

        if (ActivityCompat.checkSelfPermission(this,
                Manifest.permission.ACCESS_FINE_LOCATION)
                != PackageManager.PERMISSION_GRANTED) {

            ActivityCompat.requestPermissions(this,
                    new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 1);
            return;
        }

        LocationServices.getFusedLocationProviderClient(this)
                .getLastLocation()
                .addOnSuccessListener(location -> {

                    if (location != null) {

                        LatLng p = new LatLng(
                                location.getLatitude(),
                                location.getLongitude());

                        map.addMarker(new MarkerOptions()
                                .position(p)
                                .title("My Location"));

                        map.moveCamera(
                                CameraUpdateFactory.newLatLngZoom(p, 15));
                    }
                });
    }
}