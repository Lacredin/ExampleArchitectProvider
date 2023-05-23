package com.example.examplearchitectprovider.di

import com.example.core.DataBase
import com.example.db.InstallerDB
import com.example.examplearchitectprovider.MainActivity
import com.example.installer.di.InstallerComponent
import com.example.installer.di.InstallerModule
import dagger.Component
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Component(
    modules = [AppModule::class, InstallerModule::class, DataBaseModule::class],
    // dependencies = [InstallerComponent::class]
)
interface AppComponent {

    fun installerComponentBuilder(): InstallerComponent.Builder

    fun inject(activity: MainActivity)
}

@Module
object AppModule {


}

@Module
object DataBaseModule {

    @Provides
    @Named("InstallerDB")
    fun getInstallerDB(): DataBase = InstallerDB()
}