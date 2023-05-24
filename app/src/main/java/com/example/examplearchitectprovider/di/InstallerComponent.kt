package com.example.examplearchitectprovider.di

import com.example.core.DataBase
import com.example.examplearchitectprovider.MainActivity
import com.example.installer.BasketDao
import com.example.installer.BasketRepository
import dagger.Component
import dagger.Module
import dagger.Provides
import javax.inject.Named


@Component(modules = [InstallerModule::class, DataBaseModule::class])
interface InstallerComponent {

    fun inject(activity: MainActivity)

//    @Subcomponent.Builder
//    interface Builder {
//        fun installerModule(InstallerModule: InstallerModule): Builder
//
//        fun build(): InstallerComponent
//    }
}


@Module
object InstallerModule {

    @Provides
    fun getInstallerBasketDao(
        @Named("InstallerDB")
        db: DataBase
    ) = BasketDao(db)

    @Provides
    fun getBasketRepository(basketDao: BasketDao) = BasketRepository(basketDao)


}