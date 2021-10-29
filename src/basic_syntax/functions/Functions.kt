package basic_syntax.functions

fun main() {
    println(max(a = 2234, b = 456))
    println(crop("126"))
    println(sum())

    val list = sort(5, 8, 1, 9, 123, 45, 23, 67, 0, 23, 333, 5, 5, 1, 1, 1, 0)

    for (i in list) {
        println(i)
    }
}

fun max(a: Int, b: Int) = if (a > b) a else b

fun crop(string: String) = string.substring(0, 5.coerceAtMost(string.length))

fun sum(vararg numbers: Int): Int {
    var res = 0
    for (i in numbers) {
        res += i
    }
    return res
}

fun sort(sortList: MutableList<Int>): List<Int> {
    for (i in 1 until sortList.size) {
        for (j in sortList.size - 1 downTo i) {
            if (sortList[j] < sortList[j - 1]) {
                val temp = sortList[j]
                sortList[j] = sortList[j - 1]
                sortList[j - 1] = temp
            }
        }
    }
    return sortList
}


fun sort(sortArray: Array<Int>) = sort(sortArray.toMutableList())

fun sort(vararg sortArguments: Int) = sort(sortArguments.toMutableList())


