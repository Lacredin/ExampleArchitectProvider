package com.example.api

import com.example.core.internet.Response
import retrofit2.http.GET

interface EsasProfileRestApi {

    @GET("profile")
    suspend fun loadProfile(): Response<Any>
}