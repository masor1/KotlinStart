package functional_programming.filter_and_map

fun main() {
    val numbers = mutableListOf<Int>()
    for (i in 0 until 1000) {
        numbers.add((0..1000).random())
    }
    val chNum = numbers.filter { (it % 5 == 0) || (it % 3 == 0) }.map { it * it }.sortedDescending().map { "$it" }
    for (number in chNum) {
        println(number)
    }
}