package com.example.xella.berlintourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);

        ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place("Salsabil 2", getString(R.string.salsabil_d), "Wörther Straße 16, 10405 Berlin", "Cheap", "+49 30 44046073", "12AM - 12PM"));
        places.add(new Place("Dolores", getString(R.string.dolores_d), "Rosa-Luxemburg-Str. 7, 10178 Berlin", "Cheap", "+49 30 28099597", "11:30AM - 10PM"));
        places.add(new Place("Bep Viet", getString(R.string.bep_viet_d), "Kollwitzstr. 56, 10405 Berlin", "Medium", "+49 30 40056830", "12AM - 11:30PM"));
        places.add(new Place("Zweistrom Land", getString(R.string.zweistrom_land_d), "Danziger Straße 18, 10435 Berlin", "Medium","+49 1573 1441613", "11AM - 12PM"));
        places.add(new Place("Khushi", getString(R.string.khushi_d), "Kollwitzstraße 37, 10405 Berlin", "Expensive", "+49 30 48493791","12AM - 12PM"));

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
