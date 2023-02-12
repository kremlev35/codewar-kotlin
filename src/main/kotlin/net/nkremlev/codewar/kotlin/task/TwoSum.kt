package net.nkremlev.codewar.kotlin.task

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
    fun twoSum(numbers: IntArray, target: Int): Pair<Int, Int> {
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
}