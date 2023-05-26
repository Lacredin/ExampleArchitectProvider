package com.example.examplearchitectprovider.di.components.esas

import com.example.api.EsasRestApi
import com.example.examplearchitectprovider.MainActivity
import com.example.installer.BasketDao
import com.example.installer.BasketRepository
import dagger.Module
import dagger.Provides
import dagger.Subcomponent


@Subcomponent(modules = [BasketModel::class])
interface BasketComponent {

    fun inject(activity: MainActivity)


    @Subcomponent.Builder
    interface Builder {

        fun build(): BasketComponent
    }
}


@Module
object BasketModel {

    @Provides
    fun getBasketRepository(basketDao: BasketDao, esasRestApi: EsasRestApi) =
        BasketRepository(basketDao, esasRestApi)


}