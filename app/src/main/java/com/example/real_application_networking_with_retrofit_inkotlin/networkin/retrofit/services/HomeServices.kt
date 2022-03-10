package com.example.real_application_networking_with_retrofit_inkotlin.networkin.retrofit.services

import com.example.real_application_networking_with_retrofit_inkotlin.model.Home
import com.example.real_application_networking_with_retrofit_inkotlin.model.Welcome
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface HomeServices {

    companion object {
        private const val ACCESS_KEY = "t_zjuLnwQkkPC3MSejZgQ0ufz9DHDWBw2Ku_eqvlwnE"
        const val client_id = "Client-ID"
    }

    @Headers("Authorization:$client_id $ACCESS_KEY")

    @GET("photos")
    fun getPhotos(@Query("page") page: Int, @Query("per_page") perPage: Int): Call<ArrayList<Home>>}