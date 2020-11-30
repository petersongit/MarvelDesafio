package com.example.marvel.service

import com.example.marvel.model.Res
import com.google.gson.JsonArray
import com.google.gson.JsonObject
import org.json.JSONArray
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

import retrofit2.http.Query



interface Repository_MarvelService {

    @GET("characters")
    suspend fun getResults(
        @Query("offset")p1: Int,
        @Query("limit")p2: Int,
        @Query("ts") p3: String,
        @Query("apikey")p4: String,
        @Query("hash")p5: String): Res

}




val urlApiCartola: String = "https://api.cartolafc.globo.com/"
val urlApiMarvel: String = "https://gateway.marvel.com/v1/public/"
val urlApiPromo = "https://promoios.com.br/api/"

val retrofit = Retrofit.Builder()
    .baseUrl(urlApiMarvel)
    .addConverterFactory(GsonConverterFactory.create())
    .build()


val repository: Repository_MarvelService = retrofit.create(Repository_MarvelService::class.java)