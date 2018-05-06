package org.araqnid.kthings.common

import kotlin.test.Test
import kotlin.test.assertFails
import kotlin.test.assertTrue
import kotlin.test.expect

class RandomTest {

    @Test fun pickOne_returns_singleton_element() {
        expect("a") { listOf("a").pickOne() }
    }

    @Test fun pickOne_throws_exception_on_empty_collection() {
        assertFails { listOf<Any?>().pickOne() }
    }

    @Test fun pickOne_returns_element_from_list() {
        val list = listOf("a", "b", "c", "d")
        assertTrue(list.contains(list.pickOne()))
    }

    @Test fun pickOne_returns_element_from_set() {
        val set = setOf("a", "b", "c", "d")
        assertTrue(set.contains(set.pickOne()))
    }
}
