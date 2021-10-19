package functional_programming

import java.util.*

fun main() {
    val res = modifyString("каеееееефф!!!") { it.uppercase(Locale.getDefault()) }
    println(res)
}

fun modifyString(string: String, modify: (String) -> String): String {
    return modify(string)
}