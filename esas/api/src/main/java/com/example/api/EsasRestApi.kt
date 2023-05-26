package com.example.api

import com.example.core.internet.Response
import retrofit2.http.GET


interface EsasRestApi {

    @GET("send_gps")
    suspend fun sendGps(): Response<Any>
}
