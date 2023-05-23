package com.example.installer.di

import com.example.core.DataBase
import com.example.installer.BasketDao
import com.example.installer.BasketRepository
import dagger.Module
import dagger.Provides
import dagger.Subcomponent
import javax.inject.Named


@Subcomponent(modules = [InstallerModule::class])
interface InstallerComponent {


    @Subcomponent.Builder
    interface Builder {
        fun installerModule(InstallerModule: InstallerModule): Builder

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
    fun getBasketRepository(basketDao: BasketDao) = BasketRepository(basketDao)


}