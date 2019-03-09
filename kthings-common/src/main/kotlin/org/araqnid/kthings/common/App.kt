package org.araqnid.kthings.common

import kotlinx.coroutines.Deferred
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay

fun app(): Deferred<Unit> {
    val arr = intArrayOf(123, 456, 789)
    println("arr! $arr")

    println("give me a number: ${randomNumber()}")
    println("pick one! ${arr.toList().pickOne()}")

    println("default coroutine dispatcher is ${Dispatchers.Default} (a ${Dispatchers.Default::class.simpleName})")
    return GlobalScope.async {
        println("starting coroutine")
        delay(500)
        println("inside...")
        delay(500)
        println("returning now")
    }
}
