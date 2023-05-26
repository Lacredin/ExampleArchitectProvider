package com.example.examplearchitectprovider.di.moduls.esas

import com.example.api.BasketRestApi
import com.example.api.EsasProfileRestApi
import com.example.api.EsasRestApi
import com.example.internet.BasketRestProvider
import dagger.Module
import dagger.Provides

@Module
object EsasInternetModule {

    @Provides
    fun getEsasRestApi(): EsasRestApi = BasketRestProvider().esasRestApi

    @Provides
    fun getEsasProfileRestApi(): EsasProfileRestApi = BasketRestProvider().esasProfileRestApi

    @Provides
    fun getInstallerRestProvider(): BasketRestApi =
        BasketRestProvider().basketRestProvider
}