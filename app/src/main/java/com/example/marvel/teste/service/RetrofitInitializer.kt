package com.example.marvel.teste.service

import com.example.marvel.service.Repository_MarvelService
import com.example.marvel.service.retrofit
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val urlApiMarvel: String = "https://gateway.marvel.com/v1/public/"



class RetrofitInitializer {
    fun init(){
        Retrofit.Builder()
                .baseUrl(urlApiMarvel)
                .addConverterFactory(GsonConverterFactory.create())

    }

    fun service(): Repository_MV{
        return retrofit.create(Repository_MV::class.java)
    }
}