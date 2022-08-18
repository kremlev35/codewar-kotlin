package net.kremlev.codewar.kotlin

import net.kremlev.codewar.kotlin.task.MultiplesOf3Or5
import net.kremlev.codewar.kotlin.task.SumOfOddNumbers
import net.kremlev.codewar.kotlin.task.TwoSum
import net.kremlev.codewar.kotlin.util.Assert.assertEquals

fun main(args: Array<String>) {
    //testTwoSum()
    //testMultiplesOf3or5()
    testSumOfOddNumbers()
}

private fun testTwoSum() {
    TwoSum.runTest(intArrayOf(1, 2, 3), 4, Pair(0, 2))
    TwoSum.runTest(intArrayOf(1234, 5678, 9012), 14690, Pair(1, 2))
    TwoSum.runTest(intArrayOf(2, 2, 3), 4, Pair(0, 1))
}

private fun testMultiplesOf3or5() {
    assertEquals(23, MultiplesOf3Or5.solution(10))
    assertEquals(78, MultiplesOf3Or5.solution(20))
    assertEquals(9168, MultiplesOf3Or5.solution(200))
    assertEquals(0, MultiplesOf3Or5.solution(0))
    assertEquals(0, MultiplesOf3Or5.solution(-5))
}

private fun testSumOfOddNumbers() {
    assertEquals(1, SumOfOddNumbers.rowSumOddNumbers(1))
    assertEquals(8, SumOfOddNumbers.rowSumOddNumbers(2))
    assertEquals(2197, SumOfOddNumbers.rowSumOddNumbers(13))
    assertEquals(6859, SumOfOddNumbers.rowSumOddNumbers(19))
    assertEquals(68921, SumOfOddNumbers.rowSumOddNumbers(41))
    assertEquals(74088, SumOfOddNumbers.rowSumOddNumbers(42))
    assertEquals(405224, SumOfOddNumbers.rowSumOddNumbers(74))
    assertEquals(636056, SumOfOddNumbers.rowSumOddNumbers(86))
    assertEquals(804357, SumOfOddNumbers.rowSumOddNumbers(93))
    assertEquals(1030301, SumOfOddNumbers.rowSumOddNumbers(101))
}