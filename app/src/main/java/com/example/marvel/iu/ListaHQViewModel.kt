package com.example.marvel.iu

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.marvel.model.HQ
import com.example.marvel.model.Res
import com.example.marvel.service.Repository_MarvelService
import com.google.gson.Gson
import kotlinx.coroutines.launch

class ListaHQViewModel(val repository: Repository_MarvelService) : ViewModel() {

    val listResults = MutableLiveData<ArrayList<Res>>()


    fun popListResult() {


        viewModelScope.launch {




            // repository.getResults(1,1,"1","6eb7e8896ec5850c52515a8a23ee97f0","40a3aa568bb269dfad85ae0c4a297181").toString().also {
            //  listResults.value=it
            //}

            Log.i("TAG REQUEST", repository.getResults(1,1,"1","6eb7e8896ec5850c52515a8a23ee97f0","40a3aa568bb269dfad85ae0c4a297181").toString())

        }
    }


/*    fun popListResult() {

        viewModelScope.launch {
            Log.i("TAG REQUEST", repository.getResults().toString())
        }
    }*/

}