package com.arthur.dashboardexample.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.arthur.dashboardexample.R;
import com.arthur.dashboardexample.adapter.TrendAdapter;
import com.arthur.dashboardexample.domain.TrendDomain;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView.Adapter trendAdapter;
    private RecyclerView recyclerView;
    private LinearLayout layoutProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initRecyclerView();
        layoutProfile = findViewById(R.id.layoutProfile);
        layoutProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ProfileActivity.class));
            }
        });
    }

    private void initRecyclerView(){
        ArrayList<TrendDomain> items = new ArrayList<>();
        items.add(
                new TrendDomain(
                        "Future in AI, What will tomorrow be like?",
                        "The National",
                        "trends"
                )
        );
        items.add(
                new TrendDomain(
                        "Important points in concluding a work contract",
                        "Reuters",
                        "trends2"
                )
        );
        items.add(
                new TrendDomain(
                        "What will tomorrow be like?",
                        "BBC",
                        "trends3"
                )
        );
        recyclerView = findViewById(R.id.recyclerView);
        trendAdapter = new TrendAdapter(items);
        recyclerView.setAdapter(trendAdapter);
    }
}