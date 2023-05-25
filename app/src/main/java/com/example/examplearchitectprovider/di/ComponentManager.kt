package com.example.examplearchitectprovider.di

import android.content.Context


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

    val installerComponent: InstallerComponent by lazy {
        DaggerInstallerComponent.builder()
            .setAppDeps(object : AppDeps {
                override val context: Context = this@ComponentManager.context
            })
            .build()
    }
}