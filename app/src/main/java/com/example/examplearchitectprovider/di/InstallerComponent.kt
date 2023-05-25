package com.example.examplearchitectprovider.di

import android.content.Context
import com.example.api.RestApiEsas
import com.example.core.DataBase
import com.example.examplearchitectprovider.MainActivity
import com.example.installer.BasketDao
import com.example.installer.BasketRepository
import com.example.internet.InstallerRestProvider
import dagger.Component
import dagger.Module
import dagger.Provides
import javax.inject.Named


@Component(
    modules = [InstallerModule::class, DataBaseModule::class, InstallerInternetModule::class],
    dependencies = [AppDeps::class]
)
interface InstallerComponent {

    fun inject(activity: MainActivity)

    @Component.Builder
    interface Builder {
        fun setAppDeps(appDeps: AppDeps): Builder

        fun build(): InstallerComponent
    }
}


@Module
object InstallerModule {

    @Provides
    fun getInstallerBasketDao(
        @Named("InstallerDB")
        db: DataBase
    ) = BasketDao(db)

    @Provides
    fun getBasketRepository(basketDao: BasketDao, restApiEsas: RestApiEsas) =
        BasketRepository(basketDao, restApiEsas)
}

@Module
object InstallerInternetModule {

    @Provides
    fun getInstallerInternet(): RestApiEsas = InstallerRestProvider().restAPI
}

interface AppDeps {
    val context: Context
}