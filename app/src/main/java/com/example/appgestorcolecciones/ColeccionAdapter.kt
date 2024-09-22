package com.example.appgestorcolecciones

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ColeccionAdapter(private val colecciones: List<Coleccion>) :
    RecyclerView.Adapter<ColeccionAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nombreColeccion: TextView = itemView.findViewById(R.id.nombre_coleccion)
        val descripcionColeccion: TextView = itemView.findViewById(R.id.descripcion_coleccion)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_coleccion, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val coleccion = colecciones[position]
        holder.nombreColeccion.text = coleccion.nombre
        holder.descripcionColeccion.text = coleccion.descripcion
    }

    override fun getItemCount(): Int {
        return colecciones.size
    }
}