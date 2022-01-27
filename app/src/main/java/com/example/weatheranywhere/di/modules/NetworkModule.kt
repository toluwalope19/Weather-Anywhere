package com.example.weatheranywhere.di.modules

import dagger.Module

@Module
class NetworkModule {
//    @Provides
//    @Singleton
//    fun provideOkhttpClient(context: Context): OkHttpClient {
//        return OkHttpClient.Builder()
//            .addInterceptor(NetworkConnectivityInterceptor(context))
//            .addInterceptor(NetworkResponseInterceptor())
//            .callTimeout(NetworkConstants.CALL_TIMEOUT, TimeUnit.MINUTES).build()
//    }
//
//    @Provides
//    @Singleton
//    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
//        return Retrofit.Builder()
//            .addConverterFactory(GsonConverterFactory.create())
//            .baseUrl(NetworkConstants.BASE_URL)
//            .client(okHttpClient).build()
//    }
//
//    @Provides
//    @Singleton
//    fun provideCardInfoService(retrofit: Retrofit): CardInfoApi {
//        return retrofit.create(CardInfoApi::class.java)
//    }
//
//    @Provides
//    fun provideRepository(cardInfoApi: CardInfoApi): NetworkRepository {
//        return NetworkRepository(cardInfoApi)
//    }

    
}