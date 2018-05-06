package org.araqnid.kthings.common

import kotlin.test.Test
import kotlin.test.assertFails
import kotlin.test.expect

class RandomTest {

    @Test fun pickOne_returns_singleton_element() {
        expect("a") { listOf("a").pickOne() }
    }

    @Test fun pickOne_throws_exception_on_empty_collection() {
        assertFails { listOf<Any?>().pickOne() }
    }
}
