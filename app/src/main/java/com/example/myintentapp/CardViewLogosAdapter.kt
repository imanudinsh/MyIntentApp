package com.example.myintentapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class CardViewLogosAdapter(private val listLogos: ArrayList<Logos>): RecyclerView.Adapter<CardViewLogosAdapter.CardViewHolder>(){

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewLogosAdapter.CardViewHolder {
        val  view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_cardview_logos, parent, false)
        return CardViewHolder (view)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val logos = listLogos[position]

        Glide.with(holder.itemView.context)
            .load(logos.photo)
            .apply(RequestOptions().override(350,550))
            .into(holder.imgPhoto)

        holder.tvName.text = logos.name
        holder.tvDetail.text = logos.detail

        holder.btnFavorite.setOnClickListener {
            Toast.makeText(holder.itemView.context, "Favorite " + listLogos[holder.adapterPosition].name, Toast.LENGTH_SHORT).show() }

        holder.btnShare.setOnClickListener {
            Toast.makeText(holder.itemView.context, "Share " + listLogos[holder.adapterPosition].name, Toast.LENGTH_SHORT).show() }

        holder.itemView.setOnClickListener {
            Toast.makeText(holder.itemView.context, "Kamu memilih" + listLogos[holder.adapterPosition].name, Toast.LENGTH_SHORT).show() }
    }

    override fun getItemCount(): Int {
        return listLogos.size
    }

    inner class CardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val imgPhoto: ImageView = itemView.findViewById(R.id.img_item_logos)
        val tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        val tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        val btnFavorite: Button = itemView.findViewById(R.id.btn_set_favorite)
        val btnShare: Button = itemView.findViewById(R.id.btn_set_share)
    }
}