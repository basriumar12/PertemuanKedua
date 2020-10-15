package com.basri.pertemuankedua

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_adapter.view.*

class AdapterHitung
    (private  val list : ArrayList<ModelHitung>) :
    RecyclerView.Adapter<AdapterHitung.Holder>()
{

    // mengisi view untuk adapter
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterHitung.Holder {

        return Holder(LayoutInflater.from(parent.context).inflate(

            R.layout.item_adapter,parent,false
        ))


    }
    //size dalam array yang akan di tampilkan
    override fun getItemCount(): Int {
        return list.size
        
    }

    //untuk set data yang ada dlist dalam view item adapter
    override fun onBindViewHolder(holder: AdapterHitung.Holder, position: Int) {

        holder.view.tv_angka.text = list[position].dataHitung

    }

    class  Holder (val view : View) : RecyclerView.ViewHolder(view)


}