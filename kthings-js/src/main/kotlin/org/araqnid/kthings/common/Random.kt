package org.araqnid.kthings.common

private external object Math {
    fun random(): Double
    fun floor(n: Double): Int
}

actual fun randomNumber() = Math.random()
actual fun randomInt(bound: Int) = Math.floor(randomNumber() * bound)
