package com.example.internet

import com.example.api.BasketRestApi
import com.example.api.EsasProfileRestApi
import com.example.api.EsasRestApi
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Inject


class BasketRestProvider @Inject constructor() {

    companion object {
        private var baseUrl = "https://www.youtube.com/"

        val gsonBuilder = GsonBuilder()
            .setLenient()
            .excludeFieldsWithoutExposeAnnotation()
            .create()
    }

    var esasRestApi: EsasRestApi
    var esasProfileRestApi: EsasProfileRestApi
    var basketRestProvider: BasketRestApi

    init {
        val httpClientBuilder = OkHttpClient.Builder()
        val client = httpClientBuilder
            .connectTimeout(60, TimeUnit.SECONDS)
            .writeTimeout(60, TimeUnit.SECONDS)
            .readTimeout(60, TimeUnit.SECONDS)
            .build()

        val retrofit = Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create(gsonBuilder))
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .client(client)
            .build()

        esasRestApi = retrofit.create(EsasRestApi::class.java)
        esasProfileRestApi = retrofit.create(EsasProfileRestApi::class.java)
        basketRestProvider = retrofit.create(BasketRestApi::class.java)
    }
}
