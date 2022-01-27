package com.example.weatheranywhere.di.modules

import android.content.Context
import com.example.weatheranywhere.BaseApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(private val app: BaseApplication) {


    @Provides
    @Singleton
    fun provideContext(): Context = app.applicationContext

}