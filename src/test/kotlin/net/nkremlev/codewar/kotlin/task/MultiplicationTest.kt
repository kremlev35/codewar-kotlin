package net.nkremlev.codewar.kotlin.task

import net.nkremlev.codewar.kotlin.task.Multiplication.multiply
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class MultiplicationTest {

    @Test
    @Throws(Exception::class)
    fun `Test associativity of multiplication`() {
        for (i in 0..99) {
            val a = Math.random()
            val b = Math.random()
            val c = Math.random()
            val message = String.format("(%g * %g) * %g == %g * (%g * %g)", a, b, c, a, b, c)
            assertEquals(
                multiply(multiply(a, b), c),
                multiply(a, multiply(b, c)),
                1E-14,
                message)
            assertEquals(multiply(a, b), a * b, 1e-3);
        }
    }
}