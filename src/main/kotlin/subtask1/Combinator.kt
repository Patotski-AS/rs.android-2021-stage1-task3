package subtask1

class Combinator {

    fun checkChooseFromArray(array: Array<Int>): Int? {
        val m = array[0]
        val n = array[1]
        if (m < 0 || n <= 0) {
            return null
        }
        for (i in 1..n) {
            if (getCombinations(i, n) == m)
                return i
        }
        return null
    }

    private fun getCombinations(i: Int, n: Int): Int {
        return (fact(n) / (fact(i) * fact(n - i))).toInt()
    }

    private fun fact(n: Int): Long {
        var result = 1L
        for (i in 1..n) {
            result *= i
        }
        return result
    }
}
