package final_works

fun main() {
    val data = mapOf(
        "Январь" to listOf(100, 100, 100, 100),
        "Февраль" to listOf(200, 200, -190, 200),
        "Март" to listOf(300, 180, 300, 100),
        "Апрель" to listOf(250, -250, 100, 300),
        "Май" to listOf(200, 100, 400, 300),
        "Июнь" to listOf(200, 100, 300, 300)
    )
    printInfo(data)
}

fun printInfo(data: Map<String, List<Int>>) {
    val correctMap = data.filter { map -> map.value.all { it >= 0 } }
    val incorrectMap = data.filterNot { map -> map.value.all { it > 0 } }.keys.toString()
    val month = correctMap.map { Pair(it.key, it.value.sum()) }

    val averageInWeek = correctMap.flatMap { it.value }.average()
    val averageInMonth = month.map { it.second }.average()
    val maxInMonth = month.map { it.second }.maxOrNull()
    val monthWithMax = month.filter { it.second == maxInMonth }.map { it.first }.toString()
    val minInMonth = month.map { it.second }.minOrNull()
    val monthWithMin = month.filter { it.second == minInMonth }.map { it.first }.toString()

    println(
        "Средняя выручка в неделю: $averageInWeek\n" +
        "Средняя выручка в месяц: $averageInMonth\n" +
        "Максимальная выручка в месяц: $maxInMonth\n" +
        "Была в следующих месяцах: $monthWithMax\n" +
        "Минимальная выручка в месяц: $minInMonth\n" +
        "Была в следующих месяцах: $monthWithMin\n" +
        "Ошибки произошли в следующих месяцах: $incorrectMap"
    )
}
