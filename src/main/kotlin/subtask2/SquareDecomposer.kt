package subtask2

class SquareDecomposer {

    fun decomposeNumber(number: Int): Array<Int>? {
        val sumSquareNumber = number.toLong() * number.toLong()
        return calculator(sumSquareNumber, number)?.toTypedArray()
    }

    private fun calculator(sumSquareNumber: Long, number: Int): ArrayList<Int>? {
        if (sumSquareNumber < 0) return null
        if (sumSquareNumber == 0L) return arrayListOf()

        var list: ArrayList<Int>? = null
        var testNumber = number
        while (list == null && testNumber > 1) {
            testNumber--
            val newSumSquareNumber = sumSquareNumber - (testNumber.toLong() * testNumber.toLong())
            list = calculator(newSumSquareNumber, testNumber)
        }
        list?.add(testNumber)
        return list
    }
}
