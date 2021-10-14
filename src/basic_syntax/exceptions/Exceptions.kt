package basic_syntax.exceptions

fun main() {
    println(sum("10", "20ss"))
}

fun sum(a: String, b: String): Int {
    return try {
        val numA = a.toInt()
        val numB = b.toInt()
        return numA + numB
    } catch (e: Exception) {
        0
    }
}