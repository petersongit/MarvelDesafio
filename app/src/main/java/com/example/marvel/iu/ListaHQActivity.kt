package com.example.marvel.iu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.observe
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.marvel.R
import com.example.marvel.model.HQ
import com.example.marvel.service.repository
import kotlinx.android.synthetic.main.activity_lista_hq.*

/*private lateinit var recyclerView: RecyclerView
private lateinit var viewAdapter: RecyclerView.Adapter<*>
private lateinit var viewManager: RecyclerView.LayoutManager*/





class ListaHQActivity : AppCompatActivity() {

    var listHQ = getAllHQ()                 //conjunto de dados
    var adapter = ListaHQAdapter(listHQ)    //Criação do adapter conforme o conjunto de dados

    val viewModel by viewModels<ListaHQViewModel> {
        object : ViewModelProvider.Factory {
            override fun <T : ViewModel?> create(modelClass: Class<T>): T {
                return ListaHQViewModel(repository) as T
            }
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_hq)



        recycle_hq.layoutManager = GridLayoutManager(this, 3)
        recycle_hq.adapter = adapter
        recycle_hq.setHasFixedSize(true)

/*        viewModel.listResults.observe(this){
            adapter.addList(it)
        }*/


        //Atualizando os valores da lista
        viewModel.popListResult()



        }



/*    fun setScroller(){
        recycle_hq.addOnScrollListener(object : RecyclerView.OnScrollListener(){
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)
                if(dy > 0){
                    val litem = linearLayoutManager.itemCount
                    val vItem  = linearLayoutManager.findFirstCompletelyVisibleItemPosition()
                    val itens = adapter.itemCount
                    if(litem + vItem >= itens){
                        Log.i("TAG", "Chamou")
                    }
                }
            }
        })
    }*/

    //Retorna uma lista de alunos fixo
    fun getAllHQ(): ArrayList<HQ>{
        val hq1 = HQ("1", "a")
        val hq2 = HQ("2", "b")
        val hq3 = HQ("3", "c")
        val hq4 = HQ("4", "d")
        val hq5 = HQ("5", "e")
        val hq6 = HQ("6", "f")
        val hq7 = HQ("7", "g")
        val hq8 = HQ("8", "h")
        val hq9 = HQ("9", "i")
        val hq10 = HQ("10", "j")
        val hq11 = HQ("11", "k")
        val hq12 = HQ("12", "l")
        val hq13 = HQ("13", "m")
        val hq14 = HQ("14", "n")
        val hq15 = HQ("15", "o")
        val hq16 = HQ("16", "p")
        val hq17 = HQ("17", "q")
        val hq18 = HQ("18", "r")

        return arrayListOf<HQ>(hq1, hq2, hq3, hq4, hq5, hq6, hq7, hq8, hq9, hq10, hq11, hq12, hq13, hq14, hq15, hq16, hq17, hq18)

    }
}