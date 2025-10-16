package com.example.motivator

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform