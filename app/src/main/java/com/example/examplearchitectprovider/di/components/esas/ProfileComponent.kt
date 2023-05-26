package com.example.examplearchitectprovider.di.components.esas

import com.example.api.EsasProfileRestApi
import com.example.esas.profile.ProfileDao
import com.example.esas.profile.ProfileRepository
import dagger.Module
import dagger.Provides
import dagger.Subcomponent

@Subcomponent(modules = [ProfileModel::class])
interface ProfileComponent {


    @Subcomponent.Builder
    interface Builder {

        fun build(): ProfileComponent
    }
}

@Module
object ProfileModel {

    @Provides
    fun getBasketRepository(profileDao: ProfileDao, profileRestApi: EsasProfileRestApi) =
        ProfileRepository(profileDao, profileRestApi)
}