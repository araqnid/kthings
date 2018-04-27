package org.araqnid.kthings.common

actual fun randomNumber() = js("Math.random()").unsafeCast<Double>()
