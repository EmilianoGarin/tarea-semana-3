package com.emiliano_garin.mascotas;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Build;
import android.os.Bundle;

import java.util.ArrayList;

public class MisMascotas extends AppCompatActivity {
    private ArrayList mascotas;
    private RecyclerView listaMascotas;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        androidx.appcompat.widget.Toolbar miActionBar = (androidx.appcompat.widget.Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);

        listaMascotas = findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);

        inicializarListaMascotas();
        inicializarAdaptador();



    }
    public void inicializarAdaptador(){
        MascotasAdaptador adaptador = new MascotasAdaptador(mascotas);
        listaMascotas.setAdapter(adaptador);
    }

    public void inicializarListaMascotas(){
        mascotas=new ArrayList<Mascotas>();

        mascotas.add(new Mascotas("Lucy",R.drawable.vexels,5));
        mascotas.add(new Mascotas("Rukia",R.drawable.vexels,5));
        mascotas.add(new Mascotas("Lanz",R.drawable.vexels,5));
        mascotas.add(new Mascotas("Ren",R.drawable.vexels,5));
        mascotas.add(new Mascotas("Nami",R.drawable.vexels,5));
    }
}