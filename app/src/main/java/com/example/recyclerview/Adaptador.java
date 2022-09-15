package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adaptador extends RecyclerView.Adapter<Adaptador.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView Sucursal, Info;
        ImageView Imagen1;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            Sucursal = (TextView)itemView.findViewById(R.id.tvnombre);
            Info = (TextView)itemView.findViewById(R.id.txinfo);
            Imagen1 = (ImageView)itemView.findViewById(R.id.imghamb);
        }
    }
    public List<Restaurante> RestLista;

    public Adaptador(List<Restaurante> restLista) {
        this.RestLista = restLista;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_restaurante,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.Sucursal.setText(RestLista.get(position).getSucursal());
        holder.Info.setText(RestLista.get(position).getInfo());
        holder.Imagen1.setImageResource(RestLista.get(position).getImagen());
    }

    @Override
    public int getItemCount() {
        return RestLista.size();
    }
}
