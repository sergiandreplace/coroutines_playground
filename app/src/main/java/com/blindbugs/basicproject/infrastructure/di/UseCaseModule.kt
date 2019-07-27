package com.blindbugs.basicproject.infrastructure.di

import com.blindbugs.basicproject.domain.usecase.GetRandomMealUseCase
import org.koin.dsl.module

val useCaseModule = module {
    factory { GetRandomMealUseCase(get()) }
}