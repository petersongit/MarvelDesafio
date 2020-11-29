package com.example.marvel.iu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.marvel.R
import com.example.marvel.model.HQ
import kotlinx.android.synthetic.main.activity_lista_hq.*

/*private lateinit var recyclerView: RecyclerView
private lateinit var viewAdapter: RecyclerView.Adapter<*>
private lateinit var viewManager: RecyclerView.LayoutManager*/





class ListaHQActivity : AppCompatActivity() {

    var listHQ = getAllHQ() //conjunto de dados
    var adapter = ListaHQAdapter(listHQ) //Criação do adapter conforme o conjunto de dados

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_hq)


        recycle_hq.layoutManager = LinearLayoutManager(this)
        recycle_hq.adapter = adapter
        recycle_hq.setHasFixedSize(true)



        /*var adapter = ListaHQAdapter(listAlunos)
        recycle_hq.layoutManager*/


        }





    //Retorna uma lista de alunos fixo
    fun getAllHQ(): ArrayList<HQ>{
        val hq1 = HQ("1", "a")
        val hq2 = HQ("2", "b")
        val hq3 = HQ("3", "c")

        return arrayListOf<HQ>(hq1, hq2, hq3)

    }
}