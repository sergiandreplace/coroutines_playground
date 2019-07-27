package com.blindbugs.basicproject.infrastructure.di

import com.blindbugs.basicproject.data.meal.network.MealApiDataSource
import org.koin.dsl.module

val dataSourceModule = module {
    factory { MealApiDataSource(get()) }
}