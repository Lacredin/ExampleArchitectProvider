package com.example.examplearchitectprovider.di

import com.example.core.DataBase
import com.example.db.InstallerDB
import com.example.examplearchitectprovider.MainActivity
import dagger.Component
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Component(
    modules = [AppModule::class, DataBaseModule::class, InstallerModule::class],
)
interface AppComponent {

    //fun installerComponentBuilder(): InstallerComponent.Builder

    fun inject(activity: MainActivity)

//    @Component.Builder
//    interface AppBuilder {
//    @BindsInstance
//        fun setContext(context: Context): Component.Builder
//
//        fun build(): AppComponent
//    }
}

@Module(subcomponents = [InstallerComponent::class])
object AppModule {


}

@Module
object DataBaseModule {

    @Provides
    @Named("InstallerDB")
    fun getInstallerDB(): DataBase = InstallerDB()
}