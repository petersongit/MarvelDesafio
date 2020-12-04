package com.example.marvel.iu

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.marvel.R
import com.example.marvel.model.HQ
import kotlinx.android.synthetic.main.item_comic.view.*
import kotlinx.android.synthetic.main.item_hq.view.*
import kotlinx.android.synthetic.main.item_hq.view.txtNumeroEdicao

class ListaHQAdapter(private val listHQ: ArrayList<HQ>): RecyclerView.Adapter<ListaHQAdapter.ListaHQViewHolder>() {

    //var listHQ = ArrayList<HQ>()



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListaHQViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_comic, parent,false)
        return ListaHQViewHolder(view)
    }

    override fun getItemCount(): Int {
        //Log.i("ListaHQAdapter", listHQ.size.toString())
       // Log.i("ListaHQAdapter", listHQ.count().toString())
        //return 2

        //return listHQ.size
        return listHQ.size
    }

    override fun onBindViewHolder(holder: ListaHQViewHolder, position: Int) {
        var hq = listHQ[position]
        //holder.txtEdicaoHQ.text = hq.edicaoHQ
        //holder.imgHQ.text = hq.logoHQ

        Log.i("Logo", hq.logoHQ)
        Log.i("Edicao", hq.edicaoHQ)
    }


    fun addList(list: ArrayList<HQ>){
        listHQ.addAll(list)
        notifyDataSetChanged()
    }

    class ListaHQViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val imgHQ: ImageView = view.imgLogoComic
       //  val imgHQ: TextView = view.imgLogoHQ
        val txtEdicaoHQ: TextView = view.txtNumeroEdicao
    }
}