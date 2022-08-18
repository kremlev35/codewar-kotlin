package net.kremlev.codewar.kotlin.task

/**
 * @see <a href="https://www.codewars.com/kata/514b92a657cdc65150000006">Multiples of 3 or 5</a>
 *
 * @author kremlev
 */
object MultiplesOf3Or5 {

    /**
     * Находит сумму кратных 3 и 5 чисел от 0 до крайнего числа
     *
     * @param number крайнее число
     *
     * @return сумма кратных 3 и 5 чисел
     */

    fun solution(number: Int): Int {
        var numberChecked = 0
        if (number <= 0)
            return numberChecked
        else
            numberChecked = number
        var result = 0
        for (num in 0 until numberChecked) {
            if (num % 3 == 0 || num % 5 == 0)
                result += num
        }
        return result
    }

    //Лучшее решение по мнению code-war
    fun solutionBest(number: Int): Int = (3 until if (number > 0) number else 0)
        .filter { it % 3 == 0 || it % 5 == 0 }
        .sum()
}