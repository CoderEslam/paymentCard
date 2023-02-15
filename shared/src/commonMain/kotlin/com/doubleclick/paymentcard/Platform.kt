package com.doubleclick.paymentcard

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform