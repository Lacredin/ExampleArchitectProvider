package com.example.api

import com.example.core.internet.Response
import com.example.installer.internet.ResultBasket
import retrofit2.http.GET


interface RestApiEsas {

    @GET("example")
    suspend fun checkGpsPermission(): Response<ResultBasket>
}
