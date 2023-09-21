package com.example.instagramp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class RecyclerProfileImageAdapter( val arrimages:ArrayList<ProfileImageModel>): RecyclerView.Adapter<RecyclerProfileImageAdapter.viewHolder>() {
    class viewHolder(view: View):RecyclerView.ViewHolder(view){
     val imgCat = view.findViewById<ImageView>(R.id.catA)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {

        return viewHolder(LayoutInflater.from(parent.context).inflate(R.layout.grid_profile_images,parent,false))

    }

    override fun getItemCount(): Int {

        return arrimages.size
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {

        holder.imgCat.setImageResource(arrimages[position].intimgA)
    }
}