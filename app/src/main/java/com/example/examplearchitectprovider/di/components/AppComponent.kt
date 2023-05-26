package com.example.examplearchitectprovider.di.components

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import dagger.Module

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