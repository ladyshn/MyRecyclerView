package com.example.asus.myrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCategory;
    private ArrayList<Universitas> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCategory = findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        list.addAll(UniversitasData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        ListUniversitasAdapter listUniversitasAdapter = new ListUniversitasAdapter(this);
        listUniversitasAdapter.setListUniversitas(list);
        rvCategory.setAdapter(listUniversitasAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_list:
                showRecyclerList();
                break;
            case R.id.action_grid:
                showRecyclerGrid();
                break;
            case R.id.action_cardview:
                showRecyclerCardView();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void showRecyclerGrid() {
        rvCategory.setLayoutManager(new GridLayoutManager(this, 2));
        GridUniversitasAdapter gridUniversitasAdapter = new GridUniversitasAdapter(this);
        gridUniversitasAdapter.setListUniversitas(list);
        rvCategory.setAdapter(gridUniversitasAdapter);
    }

    private void showRecyclerCardView(){
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        CardViewUniversitasAdapter cardViewUniversitasAdapter = new CardViewUniversitasAdapter(this);
        cardViewUniversitasAdapter.setListUniversitas(list);
        rvCategory.setAdapter(cardViewUniversitasAdapter);
    }
}