package org.araqnid.kthings.common

import kotlinx.coroutines.experimental.DefaultDispatcher
import kotlinx.coroutines.experimental.Deferred
import kotlinx.coroutines.experimental.async
import kotlinx.coroutines.experimental.delay

fun app(): Deferred<Unit> {
    val arr = intArrayOf(123, 456, 789)
    println("arr! $arr")

    println("give me a number: ${randomNumber()}")
    println("pick one! ${arr.toList().pickOne()}")

    println("default coroutine dispatcher is $DefaultDispatcher (a ${DefaultDispatcher::class.simpleName})")
    return async {
        println("starting coroutine")
        delay(500)
        println("inside...")
        delay(500)
        println("returning now")
    }
}
