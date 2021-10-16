package functional_programming.endless_sequences

fun main() {
    val array = (0..1000).toList()
    val employees = array.map { "Employee $it" }
    val first30 = employees.take(30)
    for (employee in first30) {
        println(employee)
    }

    val arr = generateSequence ("Employee №1") {
        val index = it.substring(10).toInt()
        "Employee №${index + 1}"
    }
    for (employee in arr.take(100)) {
        println(employee)
    }

}