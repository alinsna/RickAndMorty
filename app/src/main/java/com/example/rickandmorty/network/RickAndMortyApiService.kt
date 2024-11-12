package com.example.rickandmorty.network

import com.example.rickandmorty.model.CharacterResponse
import retrofit2.Call
import retrofit2.http.GET

interface RickAndMortyApiService {
    @GET("character")
    fun getCharacters(): Call<CharacterResponse>
}
