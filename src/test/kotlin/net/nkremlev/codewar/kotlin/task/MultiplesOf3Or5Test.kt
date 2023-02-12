package net.nkremlev.codewar.kotlin.task

import net.nkremlev.codewar.kotlin.task.MultiplesOf3Or5.solution
import net.nkremlev.codewar.kotlin.task.MultiplesOf3Or5.solutionBest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class MultiplesOf3Or5Test {

    @Test
    fun `Simple test one`() {
        val expected = 23
        val testNumber = 10
        assertEquals(expected, solution(testNumber))
        assertEquals(expected, solutionBest(testNumber))
    }

    @Test
    fun `Simple test two`() {
        val expected = 78
        val testNumber = 20
        assertEquals(expected, solution(testNumber))
        assertEquals(expected, solutionBest(testNumber))
    }

    @Test
    fun `Test hundred number`() {
        val expected = 9168
        val testNumber = 200
        assertEquals(expected, solution(testNumber))
        assertEquals(expected, solutionBest(testNumber))
    }

    @Test
    fun `Test zero number`() {
        val expected = 0
        val testNumber = 0
        assertEquals(expected, solution(testNumber))
        assertEquals(expected, solutionBest(testNumber))
    }

    @Test
    fun `Test negative number`() {
        val expected = 0
        val testNumber = -5
        assertEquals(expected, solution(testNumber))
    }
}