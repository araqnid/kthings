package org.araqnid.kthings

import org.araqnid.kthings.common.*

object Example {
    @JvmStatic
    fun main(args: Array<String>) {
        Emotion.values().forEach {
            println("got: $it")
        }

        val resource = javaClass.classLoader.getResource("kthings.txt")
        println("kthings.txt is at $resource")
    }
}