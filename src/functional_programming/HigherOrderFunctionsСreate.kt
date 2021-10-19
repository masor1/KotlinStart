package functional_programming

import java.util.*

fun main() {
    val resString = modifyString("каеееееефф!!!") { it.uppercase(Locale.getDefault()) }
    println(resString)

    val resCollection = modifyCollection(listOf(1,4,6,78,67,23,12,0,1,1,0,45)) { println(it.sum()) }
}

inline fun modifyString(string: String, modify: (String) -> String): String {
    return modify(string)
}

inline fun modifyCollection(collection: List<Int>, modify: (List<Int>) -> Unit) {
    return modify(collection)
}