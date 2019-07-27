package com.blindbugs.basicproject.infrastructure.di

import com.blindbugs.basicproject.infrastructure.api.TheMealDbApi
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val networkModule = module {
    single {
        Retrofit.Builder()
            .baseUrl("https://www.themealdb.com/api/json/v1/1/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    single<TheMealDbApi> { get<Retrofit>().create(TheMealDbApi::class.java) }
}