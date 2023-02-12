package net.nkremlev.codewar.kotlin.task

import net.nkremlev.codewar.kotlin.task.SumOfOddNumbers.rowSumOddNumbers
import net.nkremlev.codewar.kotlin.task.SumOfOddNumbers.rowSumOddNumbersBest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class SumOfOddNumbersTest {

    @Test
    fun `Simple tests`() {
        assertEquals(1, rowSumOddNumbers(1))
        assertEquals(8, rowSumOddNumbers(2))
        assertEquals(2197, rowSumOddNumbers(13))
        assertEquals(6859, rowSumOddNumbers(19))
        assertEquals(68921, rowSumOddNumbers(41))
        assertEquals(74088, rowSumOddNumbers(42))
        assertEquals(405224, rowSumOddNumbers(74))
        assertEquals(636056, rowSumOddNumbers(86))
        assertEquals(804357, rowSumOddNumbers(93))
        assertEquals(1030301, rowSumOddNumbers(101))
    }
    
    @Test
    fun `Test the best answer`() {
        assertEquals(1, rowSumOddNumbersBest(1))
        assertEquals(8, rowSumOddNumbersBest(2))
        assertEquals(2197, rowSumOddNumbersBest(13))
        assertEquals(6859, rowSumOddNumbersBest(19))
        assertEquals(68921, rowSumOddNumbersBest(41))
        assertEquals(74088, rowSumOddNumbersBest(42))
        assertEquals(405224, rowSumOddNumbersBest(74))
        assertEquals(636056, rowSumOddNumbersBest(86))
        assertEquals(804357, rowSumOddNumbersBest(93))
        assertEquals(1030301, rowSumOddNumbersBest(101))
    }
}