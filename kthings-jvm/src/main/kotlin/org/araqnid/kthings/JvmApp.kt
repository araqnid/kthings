package org.araqnid.kthings

import kotlinx.coroutines.runBlocking
import org.araqnid.kthings.common.app

fun main(args: Array<String>) {
    runBlocking {
        app().await()
    }
}
