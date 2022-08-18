package net.kremlev.codewar.kotlin.task

import net.kremlev.codewar.kotlin.util.Assert.assertEquals

/**
 * @see <a href="https://www.codewars.com/kata/52c31f8e6605bcc646000082">Two Sum</a>
 *
 * @author kremlev
 */
object TwoSum {

    /**
     * Находит индексы значений, сумма которых равна результирующему значению
     *
     * @param numbers массив целых чисел
     * @param target результирующее значение
     *
     * @return пара индексов, сумма значений которых равна результирующему значению
     */
    private fun twoSum(numbers: IntArray, target: Int): Pair<Int, Int> {
        for (x in numbers.indices) {
            for (y in x + 1 until numbers.size) {
                val numberOne = numbers[x]
                val numberTwo = numbers[y]
                if (numberOne + numberTwo == target)
                    return Pair(x, y)
            }
        }
        throw Exception("Doesn't have pair")
    }

    /**
     * Проверяет работоспособность функции [TwoSum.twoSum]
     *
     * @param r массив целых чисел для обработки функцией [TwoSum.twoSum]
     * @param n результирующее значение
     * @param refSol правильный ответ работы функции [TwoSum.twoSum]
     *
     * @throws AssertionError результат функции [TwoSum.twoSum] не равен refSoul
     */
    fun runTest(r: IntArray, n: Int, refSol: Pair<Int, Int>) {
        val userSol = twoSum(r, n).let { (x, y) -> if (x > y) Pair(y, x) else Pair(x, y) }
        assertEquals(refSol, userSol)
    }
}