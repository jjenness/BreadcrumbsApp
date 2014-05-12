package com.findyourway.breadcrumbs.app;
/**
 * Created by josephjenness on 5/10/14.
 */

import android.graphics.Color;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PolylineOptions;


public class crumbListener implements LocationListener
{
    private PolylineOptions breadCrumbs;
    private GoogleMap map;


    public crumbListener() {
        breadCrumbs.width(5);
        breadCrumbs.color(Color.RED);

        //add any initialization to polyline options here
    }
    // Our LocationListener Interface

    public void onLocationChanged(final Location loc)
    {
        double lat = loc.getLatitude();
        double lng = loc.getLongitude();
        LatLng coordinate = new LatLng(lat, lng);
        breadCrumbs.add(coordinate);

    }

    public void onProviderDisabled(String provider) {}


    public void onProviderEnabled(String provider) {}


    public void onStatusChanged(String provider, int status, Bundle extras) {}

    // Our BreadCrumbs Interface
    public GoogleMap getMap() {
        //initialize any map options here
        map.addPolyline(breadCrumbs);

        return map;
    }



}



