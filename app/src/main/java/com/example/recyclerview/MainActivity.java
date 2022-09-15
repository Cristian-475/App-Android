package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewSucursal;
    private Adaptador adaptadorSucursal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewSucursal =(RecyclerView)findViewById(R.id.recyclerRestaurante);
        recyclerViewSucursal.setLayoutManager(new LinearLayoutManager(this));

        adaptadorSucursal = new Adaptador(obtenerRestaurantes());
        recyclerViewSucursal.setAdapter(adaptadorSucursal);
    }

    public List<Restaurante> obtenerRestaurantes(){
        List<Restaurante> restaurantes= new ArrayList<>();
        restaurantes.add(new Restaurante("Hamburguesas el puerquito","Las mejores que pudas encontrar en tota la zona", R.drawable.hambueguesa));
        restaurantes.add(new Restaurante("Fideolandia","Los mejores que pude encontrar en tota la zona",R.drawable.fideos));
        restaurantes.add(new Restaurante("Taqueria del Tio San","Los mejores que pudes encontrar en tota la zona",R.drawable.tacos));
        restaurantes.add(new Restaurante("Pizzeria Don Italoní","Las mejores que pude encontrar en tota la zona",R.drawable.pizza));
        return restaurantes;

    }
}