package com.diegov22.recyclerview_cursoa

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdaptadorCustom(var contexto:Context, items:ArrayList<Informa>): RecyclerView.Adapter<AdaptadorCustom.ViewHolder> (){


    var items:ArrayList<Informa>?=null
    init {
        this.items = items
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdaptadorCustom.ViewHolder  {

        val vista = LayoutInflater.from(contexto).inflate(R.layout.template_informacion, parent,false)
        val ViewHolder=ViewHolder(vista)

        return ViewHolder
    }

    override fun getItemCount(): Int {
        return items?.count()!!
    }

    override fun onBindViewHolder(holder: AdaptadorCustom.ViewHolder, position: Int) {
        val item = items?.get(position)
        holder.foto?.setImageResource(item?.foto!!)
        holder.nombre?.text=item?.nombre
        holder.precio?.text=item?.precio.toString()
        holder.raiting?.rating = item?.raiting!!
    }


    class ViewHolder(vista:View):RecyclerView.ViewHolder(vista){

        var vista = vista
        var foto:ImageView? =null
        var nombre:TextView? = null
        var precio:TextView? = null
        var raiting:RatingBar?= null

        init{

            foto = vista.findViewById(R.id.ivFoto)
            nombre = vista.findViewById(R.id.tvNombre)
            precio = vista.findViewById(R.id.tvPrecio)
            raiting = vista.findViewById(R.id.tvRaiting)

        }
    }
}