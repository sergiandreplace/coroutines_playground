package com.blindbugs.basicproject.infrastructure

import android.app.Application
import com.blindbugs.basicproject.infrastructure.di.*
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class BaseApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        initDi()
    }

    private fun initDi() {
        startKoin {
            androidLogger()
            androidContext(this@BaseApplication)
            modules(
                listOf(
                    presenterModule,
                    useCaseModule,
                    collectionModule,
                    dataSourceModule,
                    mapperModule,
                    networkModule
                )
            )
        }
    }
}