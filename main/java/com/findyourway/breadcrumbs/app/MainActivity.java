package com.findyourway.breadcrumbs.app;

import android.location.Location;
import android.location.LocationManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {

    private LocationManager locationManager;
    private crumbListener breadCrumbs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        breadCrumbs = new crumbListener();
        //Get access to Location Provider
        locationManager = (LocationManager) getSystemService(this.getApplicationContext().LOCATION_SERVICE);
        //Register with Location Provider
        //add feature to button
        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 30, breadCrumbs);
        //locationManager.removeUpdates(breadCrumbs);   //stops the listener
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    public void getCrumb() {

    }

    public void addLocation() {

    }
}

