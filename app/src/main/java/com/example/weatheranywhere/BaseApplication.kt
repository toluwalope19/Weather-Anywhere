package com.example.weatheranywhere


import com.example.weatheranywhere.di.DaggerAppComponent
import com.example.weatheranywhere.di.modules.AppModule
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class BaseApplication : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication>? {
        return DaggerAppComponent.builder()
            .application(this)
            .appModule(AppModule(this))
            .build()
    }
}