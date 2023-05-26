package com.example.examplearchitectprovider.di.moduls.esas

import com.example.examplearchitectprovider.di.components.esas.BasketComponent
import com.example.examplearchitectprovider.di.components.esas.ProfileComponent
import dagger.Module

@Module(subcomponents = [BasketComponent::class, ProfileComponent::class])
object EsasModule {



}