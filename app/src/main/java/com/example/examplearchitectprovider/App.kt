package com.example.examplearchitectprovider

import android.app.Application
import com.example.examplearchitectprovider.di.DI

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        DI.init(this)
    }
}