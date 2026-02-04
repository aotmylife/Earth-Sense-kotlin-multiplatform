package com.dev.mylife.earthsense.di

import com.dev.mylife.earthsense.MainViewModel
import com.dev.mylife.earthsense.PlatformNotifier
import com.dev.mylife.earthsense.network.EarthquakeApi
import com.dev.mylife.earthsense.network.domain.repository.EarthquakeRepository
import com.dev.mylife.earthsense.network.domain.repository.EarthquakeRepositoryImpl
import com.dev.mylife.earthsense.network.domain.usecase.GetEarthquakesUseCase
import org.koin.dsl.module

val commonModule = module {
    single { EarthquakeApi() }
    single<EarthquakeRepository> { EarthquakeRepositoryImpl(get()) }
    single { GetEarthquakesUseCase(get()) }
    factory { MainViewModel(get()) }
}

val jvmModule = module {
    single<PlatformNotifier> {
        object : PlatformNotifier {
            override fun showToast(message: String) {
                println("JVM Toast: $message")
            }
        }
    }
}