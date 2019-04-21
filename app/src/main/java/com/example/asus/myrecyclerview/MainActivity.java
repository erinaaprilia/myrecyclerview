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
    private ArrayList<Skincare> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCategory = findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        list.addAll(SkincareData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        ListSkincareAdapter listLipstickAdapter = new ListSkincareAdapter(this);
        listLipstickAdapter.setListSkincare(list);
        rvCategory.setAdapter(listLipstickAdapter);
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
        GridSkincareAdapter gridSkincareAdapter = new GridSkincareAdapter(this);
        gridSkincareAdapter.setListSkincare(list);
        rvCategory.setAdapter(gridSkincareAdapter);
    }

    private void showRecyclerCardView(){
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        CardViewSkincareAdapter cardViewSkincareAdapter = new CardViewSkincareAdapter(this);
        cardViewSkincareAdapter.setListSkincare(list);
        rvCategory.setAdapter(cardViewSkincareAdapter);
    }
}