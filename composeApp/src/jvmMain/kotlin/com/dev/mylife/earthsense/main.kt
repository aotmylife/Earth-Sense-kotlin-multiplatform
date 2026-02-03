package com.dev.mylife.earthsense

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "EarthSense",
    ) {
        App()
    }
}