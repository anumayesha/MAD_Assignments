package com.example.labterminal

import android.content.Context
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row.view.*
import android.content.Intent

class MyAdapter1(val arrayList: ArrayList<model1>, val context: Context) :
    RecyclerView.Adapter<MyAdapter1.ViewHolder>(){


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bindItems(model: model1){
            itemView.idTv.text = model.id.toString()
            itemView.titleTv.text = model.title
            //itemView.DescriptionTv.text = model.des
            //itemView.image1.setImageResource(model.image)
        }
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.row, parent, false)
        return  ViewHolder(v)
    }



    override fun getItemCount(): Int {
        return arrayList.size
    }
}
