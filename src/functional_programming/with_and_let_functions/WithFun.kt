package functional_programming.with_and_let_functions

fun main() {

    val list = mutableListOf<Int>()

    with(list) {
        for (i in 0 until 1000) {
            add((1..100).random())
        }

        println(
            "Сумма: ${sum()}\n" +
            "Среднее: ${average()}\n" +
            "Максимальное: ${maxOrNull()}\n" +
            "Минимальное: ${minOrNull()}\n" +
            "Первое: ${first()}\n" +
            "Последнее: ${list.last()}"
        )
    }
}