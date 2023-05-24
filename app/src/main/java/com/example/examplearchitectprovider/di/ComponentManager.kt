package com.example.examplearchitectprovider.di

import android.content.Context


class ComponentManager(private val context: Context) {
    val appComponent: AppComponent by lazy {
        DaggerAppComponent.builder()
//            .dataBaseModule(DataBaseModule)
//            .appModule(AppModule)
//            .installerModule(InstallerModule)
            .build()
    }

//    val installerComponent by lazy {
//        appComponent.installerComponentBuilder()
//            .installerModule(InstallerModule)
//            .build()
//    }

    val installerComponent: InstallerComponent by lazy {
        DaggerInstallerComponent.builder()
//            .dataBaseModule(DataBaseModule)
//            .appModule(AppModule)
//            .installerModule(InstallerModule)
            .build()
    }
}