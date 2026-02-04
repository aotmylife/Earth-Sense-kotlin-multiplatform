package com.dev.mylife.earthsense

import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.dev.mylife.earthsense.di.commonModule
import com.dev.mylife.earthsense.di.jvmModule
import com.dev.mylife.earthsense.screen.EarthquakeScreen
import org.koin.core.context.GlobalContext
import org.koin.core.context.startKoin

fun main() = application {

    if (GlobalContext.getOrNull() == null) {
        startKoin {
            modules(commonModule, jvmModule)
        }
    }

    Window(
        onCloseRequest = ::exitApplication,
        title = "EarthSense",
    ) {

        MaterialTheme {
            EarthquakeScreen()
        }
    }
}