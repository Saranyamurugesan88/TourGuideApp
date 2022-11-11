package com.saranya.tripguideapp.AllTourAttractions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.saranya.tripguideapp.MainActivity;
import com.saranya.tripguideapp.R;
import java.util.ArrayList;
public class TourAttractionsList extends AppCompatActivity
{
    RecyclerView recycler;
    LinearLayoutManager manager;
    TourAttractionsList_Adapter adapter;
    ArrayList<TourAttractionsList_Model> array;
    ImageView iv1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour_attractions_list);
        iv1= findViewById(R.id.imageView);
        array= new ArrayList<>();
        array.add(new TourAttractionsList_Model("Agra","Uttar Pradesh",R.drawable.agra));
        array.add(new TourAttractionsList_Model("Amritsar","Punjab",R.drawable.amritsar));
        array.add(new TourAttractionsList_Model("Darjeeling","West Bengal",R.drawable.darjeeling));
        array.add(new TourAttractionsList_Model("Jaipur","Rajasthan",R.drawable.jaipur));
        array.add(new TourAttractionsList_Model("Kolkata","West Bengal",R.drawable.kolkata));
        array.add(new TourAttractionsList_Model("Udaipur", "Rajasthan", R.drawable.udaipur));
        array.add(new TourAttractionsList_Model("Varanasi", "Uttar Pradesh", R.drawable.varanasi));
        adapter= new TourAttractionsList_Adapter(this,array);
        manager= new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recycler= findViewById(R.id.tourattr_recycler);
        recycler.setAdapter(adapter);
        recycler.setLayoutManager(manager);

        iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(TourAttractionsList.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
