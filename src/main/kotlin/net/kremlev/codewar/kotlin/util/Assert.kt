package net.kremlev.codewar.kotlin.util

import kotlin.math.floor

object Assert {

    fun assertEquals(expected: Any, actual: Any) {
        if (expected != actual)
            throw AssertionError("expected: $expected but was: $actual ")
    }

    fun delta(x: Double): Double = floor(x * 10.0) / 10.0
}