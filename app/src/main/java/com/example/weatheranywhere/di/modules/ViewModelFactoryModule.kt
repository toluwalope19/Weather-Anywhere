package com.example.weatheranywhere.di.modules


import androidx.lifecycle.ViewModelProvider
import com.example.weatheranywhere.di.ViewModelProviderFactory
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelFactoryModule {

    @Binds
    abstract fun bindViewModelFactory(viewModelProviderFactory: ViewModelProviderFactory) : ViewModelProvider.Factory
}