package com.dev.mylife.earthsense

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform