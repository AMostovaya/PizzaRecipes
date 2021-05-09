package com.amostovaya.pizzarecipes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<PizzaRecipeItem> pizzaRecipeItems = new ArrayList<>();
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza1, Utils.PIZZA1_TITTLE, Utils.PIZZA1_DESCRIPTION, Utils.PIZZA1_RECIPE));

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        adapter = new PizzaRecipeAdapter(pizzaRecipeItems, this);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);

    }
}