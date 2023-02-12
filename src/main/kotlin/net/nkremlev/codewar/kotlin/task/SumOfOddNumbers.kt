package net.nkremlev.codewar.kotlin.task

import kotlin.math.pow

/**
 * @see <a href="https://www.codewars.com/kata/55fd2d567d94ac3bc9000064">Sum of odd numbers</a>
 *
 * @author kremlev
 */
object SumOfOddNumbers {

    /**
     * Подсчитывает сумму чисел в треугольнике нечетных чисел
     *     1        = 1
     *    3 5       = 8
     *   7 9 11     = 27
     * 13 15 17 19  = 64
     *
     * @param n номер строки треугольника
     *
     * @return сумма нечетных чисел в треугольнике
     */
    fun rowSumOddNumbers(n: Int): Int {
        return (if (n <= 0) 1 else n).toDouble().pow(3.0).toInt()
    }

    //Лучшее решение по мнению code-war
    fun rowSumOddNumbersBest(n: Int) = n * n * n
}