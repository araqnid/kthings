package org.araqnid.kthings.common

expect fun randomNumber(): Double
expect fun randomInt(bound: Int): Int

fun <T> Collection<T>.pickOne(): T {
    if (isEmpty()) throw NoSuchElementException()

    val n = randomInt(size)
    if (this is List<T>) {
        return this[n]
    }

    val iterator = iterator()
    var value = iterator.next()
    for (i in 0 until n)
        value = iterator.next()
    return value
}