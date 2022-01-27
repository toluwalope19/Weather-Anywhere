package com.example.weatheranywhere.di.modules


import com.example.weatheranywhere.MainActivity
import com.example.weatheranywhere.di.modules.ViewModelModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuildersModule {

    @ContributesAndroidInjector(
        modules = [
            ViewModelModule::class
        ]
    )
    abstract fun contributeMainActivity(): MainActivity
}