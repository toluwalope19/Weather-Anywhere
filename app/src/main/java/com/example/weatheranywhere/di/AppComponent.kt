package com.example.weatheranywhere.di

import android.app.Application
import com.example.weatheranywhere.BaseApplication
import com.example.weatheranywhere.di.modules.ActivityBuildersModule
import com.example.weatheranywhere.di.modules.AppModule
import com.example.weatheranywhere.di.modules.NetworkModule
import com.example.weatheranywhere.di.modules.ViewModelFactoryModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component( modules = [
    AndroidSupportInjectionModule::class,
    AndroidInjectionModule::class,
    ActivityBuildersModule::class,
    AppModule::class,
    NetworkModule::class,
    ViewModelFactoryModule::class
])
interface AppComponent : AndroidInjector<BaseApplication> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun appModule(appModule: AppModule): Builder

        fun build(): AppComponent
    }
}