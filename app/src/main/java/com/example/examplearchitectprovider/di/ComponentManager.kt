package com.example.examplearchitectprovider.di

import android.content.Context
import com.example.examplearchitectprovider.di.components.AppComponent
import com.example.examplearchitectprovider.di.components.DaggerAppComponent
import com.example.examplearchitectprovider.di.components.esas.AppDeps
import com.example.examplearchitectprovider.di.components.esas.DaggerEsasComponent
import com.example.examplearchitectprovider.di.components.esas.EsasComponent


class ComponentManager(private val context: Context) {
    val appComponent: AppComponent by lazy {
        DaggerAppComponent.builder()
            .setContext(context)
            .build()
    }

//    val installerComponent by lazy {
//        appComponent.installerComponentBuilder()
//            .installerModule(InstallerModule)
//            .build()
//    }

    val esasComponent: EsasComponent by lazy {
        DaggerEsasComponent.builder()
            .setAppDeps(object : AppDeps {
                override val context: Context = this@ComponentManager.context
            })
            .build()
    }

    val profileComponent by lazy {
        esasComponent.profileComponent()
            .build()
    }

    val basketComponent by lazy {
        esasComponent.basketComponent()
            .build()
    }
}