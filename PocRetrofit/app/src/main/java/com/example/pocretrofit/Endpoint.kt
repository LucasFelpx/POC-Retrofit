package com.example.pocretrofit

import retrofit2.Call
import retrofit2.http.*

interface Endpoint {

    @GET("/truck/company/15")
    fun getPosts() : Call<List<Posts>>

}