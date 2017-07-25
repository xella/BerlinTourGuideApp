package com.example.xella.berlintourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class SightsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);

        ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place("East Side Gallery", getString(R.string.east_side_gallery_d), R.drawable.eastsidegallery, "Mühlenstraße, 10243 Berlin"));
        places.add(new Place("Brandenburg Gate", getString(R.string.brandenburg_gate_d), R.drawable.brandenburgertor, "Pariser Platz, 10117 Berlin"));
        places.add(new Place("Alexander Platz", getString(R.string.alexanderplatz_d), R.drawable.alexanderplatz, "Alexanderplatz, 10178 Berlin"));
        places.add(new Place("Fernsehturm", getString(R.string.fernsehturm_d), R.drawable.tvtower ,"Panoramastraße 1A, 10178 Berlin"));
        places.add(new Place("Unter den Linden", getString(R.string.unter_den_linden_d), R.drawable.unterdenlinden, "Unter den Linden, 10117 Berlin"));
        places.add(new Place("Berlin Hauptbahnhof", getString(R.string.berlin_hbf_d), R.drawable.hauptbahnhof, "Hauptbahnhof, Europaplatz 1, 10557 Berlin"));
        places.add(new Place("Siegessaeule", getString(R.string.siegessauele_d), R.drawable.siegessaeule, "Großer Stern, 10557 Berlin"));
        places.add(new Place("Hackescher Höfe", getString(R.string.hackescher_hoefe_d), R.drawable.hackeschermarkt, "Rosenthaler Straße 40, 10178 Berlin"));
        places.add(new Place("Oberbaum Brücke", getString(R.string.oberbaum_bruecke_d), R.drawable.oberbaumbruecke, "Oberbaumbrücke, 10243 Berlin"));

        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s.
        // The adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(this, places);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in
        // place_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}
