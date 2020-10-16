package com.emiliano_garin.mascotas;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList mascotas;
    private RecyclerView listaMascotas;
    private ImageButton ibEstrella;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
        mascotas=new ArrayList <Mascotas>();

        mascotas.add(new Mascotas("Blair",R.drawable.vexels,5));
        mascotas.add(new Mascotas("Blair",R.drawable.vexels,5));
        mascotas.add(new Mascotas("Blair",R.drawable.vexels,5));
        mascotas.add(new Mascotas("Blair",R.drawable.vexels,5));
        mascotas.add(new Mascotas("Blair",R.drawable.vexels,5));
    }

    public void agregarFAB(){
        FloatingActionButton miFAB= (FloatingActionButton) findViewById(R.id.fabCam);
        
        miFAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    public void estrella(){
        ibEstrella=(ImageButton) findViewById(R.id.ibEstrella);
        ibEstrella.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i = new Intent(this, MisMascotas.class);
                startActivity(i);
            }
        });
    }
}