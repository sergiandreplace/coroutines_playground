package com.blindbugs.basicproject.infrastructure.di

import com.blindbugs.basicproject.data.meal.MealRepository
import com.blindbugs.basicproject.domain.model.MealCollection
import org.koin.dsl.module

val collectionModule = module {
    factory<MealCollection> { MealRepository(get(), get()) }
}