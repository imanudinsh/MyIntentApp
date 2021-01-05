package com.example.myintentapp

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListLogosAdapter ( val listLogos: ArrayList<Logos>): RecyclerView.Adapter<ListLogosAdapter.ListViewHolder>() {


    override fun onCreateViewHolder(viewGroup: ViewGroup, i:Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_logos, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
       val logos:Logos = listLogos[position]

        Glide.with(holder.itemView.context)
            .load(logos.photo)
            .apply(RequestOptions().override(50,50))
            .into(holder.imgPhoto)

        holder.tvName.text = logos.name
        holder.tvDetail.text = logos.detail
    }

    override fun getItemCount(): Int {
        return listLogos.size
    }

    inner class ListViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_logos)
    }
}