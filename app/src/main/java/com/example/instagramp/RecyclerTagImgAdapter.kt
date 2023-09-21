package com.example.instagramp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class RecyclerTagImgAdapter(val arrTagImg:ArrayList<TagImgModel>):RecyclerView.Adapter<RecyclerTagImgAdapter.viewHolder>() {
    class viewHolder(view:View):RecyclerView.ViewHolder(view){
        val tagImg = view.findViewById<ImageView>(R.id.TagImgs)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        return viewHolder(LayoutInflater.from(parent.context).inflate(R.layout.tag_img_grid,parent,false))
    }

    override fun getItemCount(): Int {
        return arrTagImg.size
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        holder.tagImg.setImageResource(arrTagImg[position].intTagImg)

    }
}