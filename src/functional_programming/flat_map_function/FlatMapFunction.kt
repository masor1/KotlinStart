package functional_programming.flat_map_function

fun main() {
    val data = mapOf(
        "file1" to listOf(15, 20, 45, 15, 12),
        "file2" to listOf(35, -20, 45, 15, 12),
        "file3" to listOf(15, 40, 45, 15, 72)
    )
    val average1 = data.filter { it.value.all { it >= 0 }}.flatMap { it.value }.average()
    val average2 = data.filterNot { it.value.any { it < 0 }}.flatMap { it.value }.average()

    println(average1)
    println(average2)
}