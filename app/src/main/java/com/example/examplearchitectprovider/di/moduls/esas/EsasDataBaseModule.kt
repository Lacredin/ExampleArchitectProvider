package com.example.examplearchitectprovider.di.moduls.esas

import com.example.core.DataBase
import com.example.db.EsasDB
import com.example.db.InstallerDB
import com.example.esas.profile.ProfileDao
import com.example.installer.BasketDao
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
object EsasDataBaseModule {

    @Provides
    @Named("InstallerDB")
    fun getInstallerDB(): DataBase = InstallerDB()

    @Provides
    @Named("EsasDB")
    fun getEsasDB(): DataBase = EsasDB()

    @Provides
    fun getInstallerBasketDao(
        @Named("InstallerDB")
        db: DataBase
    ) = BasketDao(db)


    @Provides
    fun getProfileDao(
        @Named("EsasDB")
        db: DataBase
    ) = ProfileDao(db)
}