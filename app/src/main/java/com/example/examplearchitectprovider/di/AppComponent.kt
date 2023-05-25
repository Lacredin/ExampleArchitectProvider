package com.example.examplearchitectprovider.di

import android.content.Context
import com.example.core.DataBase
import com.example.db.InstallerDB
import dagger.BindsInstance
import dagger.Component
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Component(
    modules = [AppModule::class, /*DataBaseModule::class, InstallerModule::class*/],
)
interface AppComponent {

    //fun inject(activity: MainActivity)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun setContext(context: Context): Builder

        fun build(): AppComponent
    }
}

@Module(/*subcomponents = [InstallerComponent::class]*/)
object AppModule {


}

@Module
object DataBaseModule {

    @Provides
    @Named("InstallerDB")
    fun getInstallerDB(): DataBase = InstallerDB()
}