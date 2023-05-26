package com.example.examplearchitectprovider.di.components.esas

import android.content.Context
import com.example.examplearchitectprovider.MainActivity
import com.example.examplearchitectprovider.di.moduls.esas.EsasDataBaseModule
import com.example.examplearchitectprovider.di.moduls.esas.EsasInternetModule
import com.example.examplearchitectprovider.di.moduls.esas.EsasModule
import dagger.Component


@Component(
    modules = [EsasModule::class , EsasDataBaseModule::class, EsasInternetModule::class],
    dependencies = [AppDeps::class]
)
interface EsasComponent {

    fun inject(activity: MainActivity)

    fun basketComponent(): BasketComponent.Builder

    fun profileComponent(): ProfileComponent.Builder


    @Component.Builder
    interface Builder {
        fun setAppDeps(appDeps: AppDeps): Builder

        fun build(): EsasComponent
    }
}

interface AppDeps {
    val context: Context
}