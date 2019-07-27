package com.blindbugs.basicproject.infrastructure.di

import com.blindbugs.basicproject.ui.main.MainPresenter
import org.koin.dsl.module

val presenterModule = module {
    factory { MainPresenter(get()) }
}