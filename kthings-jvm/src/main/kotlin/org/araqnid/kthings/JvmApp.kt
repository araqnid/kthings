package org.araqnid.kthings

import kotlinx.coroutines.experimental.runBlocking
import org.araqnid.kthings.common.*

fun main(args: Array<String>) {
    runBlocking {
        app().await()
    }
}
