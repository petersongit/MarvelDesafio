package com.example.marvel.model


data class Res(val data: Data)

data class Data(val offset: Int, val results: ArrayList<Results>)

data class Results(val id: Int, val name: String, val thumbnail: Thumbnail, val comics: Comics)

data class Thumbnail(val path: String, val extension: String)

data class Comics(val items: ArrayList<Items>)

data class Items(val resourceURI: String, val name: String)
