package net.kremlev.codewar.kotlin.util

object Assert {

    fun assertEquals(expected: Any, actual: Any) {
        if (expected != actual)
            throw AssertionError("expected: $expected but was: $actual ")
    }
}