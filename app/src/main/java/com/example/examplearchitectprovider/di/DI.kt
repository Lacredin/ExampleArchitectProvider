package com.example.examplearchitectprovider.di

import android.content.Context


object DI {
    lateinit var components: ComponentManager

    fun init(context: Context) {
        components = ComponentManager(context)
    }

}