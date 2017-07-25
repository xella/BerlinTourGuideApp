package com.example.xella.berlintourguideapp;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        getFragmentManager().findFragmentById(R.id.main_content);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_sights) {
            setToolbarTitle(R.string.places_sights);
            // Insert the fragment by replacing any existing fragment
            getFragmentManager().beginTransaction()
                    .replace(R.id.content_frame, new SightsFragment())
                    .commit();
        } else if (id == R.id.nav_museums) {
            setToolbarTitle(R.string.places_museums);
            getFragmentManager().beginTransaction()
                    .replace(R.id.content_frame, new MuseumsFragment())
                    .commit();
        } else if (id == R.id.nav_parks) {
            setToolbarTitle(R.string.places_parks);
            getFragmentManager().beginTransaction()
                    .replace(R.id.content_frame, new ParksFragment())
                    .commit();
        } else if (id == R.id.nav_food) {
            setToolbarTitle(R.string.places_food);
            getFragmentManager().beginTransaction()
                    .replace(R.id.content_frame, new FoodFragment())
                    .commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void setToolbarTitle(int titleResource) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(titleResource);
        }
    }
}
