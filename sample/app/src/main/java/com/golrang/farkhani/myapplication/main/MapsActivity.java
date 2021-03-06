package com.golrang.farkhani.myapplication.main;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.farkhani.map.MapRouting;
import com.golrang.farkhani.myapplication.R;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

  private GoogleMap mMap;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_maps);
    SupportMapFragment mapFragment =
        (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
    mapFragment.getMapAsync(this);
  }

  /**
   * Manipulates the map once available.
   * This callback is triggered when the map is ready to be used.
   * This is where we can add markers or lines, add listeners or move the camera. In this case,
   * we just add a marker near Sydney, Australia.
   * If Google Play services is not installed on the device, the user will be prompted to install
   * it inside the SupportMapFragment. This method will only be triggered once the user has
   * installed Google Play services and returned to the app.
   */
  @Override public void onMapReady(GoogleMap googleMap) {
    mMap = googleMap;
    init();
  }

  public void init() {

   new MapRouting.Builder().setOriginPoint(new LatLng(36.334068, 59.546783))
        .setDestinationPoint(new LatLng(36.337592, 59.469463)).setGoogleMap(mMap)
        .build();
  }
}
