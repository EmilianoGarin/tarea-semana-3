package com.emiliano_garin.mascotas;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MascotasAdaptador extends RecyclerView.Adapter<MascotasAdaptador.MascotasViewHolder>{

    ArrayList<Mascotas>mascotas;


    public MascotasAdaptador(ArrayList<Mascotas> mascotas){
        this.mascotas = mascotas;

    }



    @NonNull
    @Override // infla el layout y lo pasa al viewHolder para que obtenga los view
    public MascotasViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascotas, parent, false);
        return new MascotasViewHolder(v);
    }


    @Override // asigna cada elemento de la lista con cada view
    public void onBindViewHolder(@NonNull final MascotasViewHolder mascotasViewHolder, int position) {
        final Mascotas mascota = mascotas.get(position);
        mascotasViewHolder.ivMascota.setImageResource(mascota.getFoto());
        //mascotasViewHolder.ivHuesoB.setImageResource(mascota.getFoto());
        //mascotasViewHolder.ivHuesoN.setImageResource(mascota.getFoto());
        mascotasViewHolder.tvNombre.setText(mascota.getNombre());
        mascotasViewHolder.tvCont.setText(mascota.getCont());

        mascotasViewHolder.ibHuesoB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int cont;
                cont=(int) mascota.getCont();
                mascotasViewHolder.tvCont.setText(cont + 1);
            }
        });


    }

    @Override
    public int getItemCount() {//cantidad de elementos de mi lista de mascotas
        return mascotas.size();
    }

    public static class MascotasViewHolder extends RecyclerView.ViewHolder{

        private ImageView ivMascota;
        private ImageButton ibHuesoB;
        //private ImageView ivHuesoN;
        private TextView tvNombre;
        private TextView tvCont;


        public MascotasViewHolder(@NonNull View itemView) {
            super(itemView);

            ivMascota   = itemView.findViewById(R.id.ivMascota);
            ibHuesoB    = itemView.findViewById(R.id.ibHuesoB);
            //ivHuesoN    = itemView.findViewById(R.id.ivHuesoN);
            tvNombre    = itemView.findViewById(R.id.tvNombre);
            tvCont      = itemView.findViewById(R.id.tvCont);

        }
    }
}
