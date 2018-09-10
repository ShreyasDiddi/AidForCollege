package com.a6studios.aid4college;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ViewFlipper;

import java.util.ArrayList;

public class bus extends AppCompatActivity {
    ArrayList<BusTemplate> buses;
    SearchView sv;
    RecyclerView rvBuses;
    ViewFlipper mFlipper;
    float x;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus);
        rvBuses = (RecyclerView)findViewById(R.id.rvBuses);
        sv=(SearchView)findViewById(R.id.searchView) ;
        buses=BusTemplate.createBusList();
        final BusesAdapter adapter=new BusesAdapter(this,buses);
        rvBuses.setAdapter(adapter);

        rvBuses.setLayoutManager(new LinearLayoutManager(this));

        sv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });


    }
}



