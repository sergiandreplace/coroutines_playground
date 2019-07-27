package com.blindbugs.basicproject.infrastructure.di

import com.blindbugs.basicproject.data.meal.MealApiModelMapper
import org.koin.dsl.module

val mapperModule = module {
    factory { MealApiModelMapper() }
}