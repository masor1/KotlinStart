package functional_programming.with_and_let_functions
//Задание:
//1) За пределами метода main() создать нулабельную коллекцию чисел.
//2) Внутри метода main(), используя функцию with(), заполнить ее 1000-ю случайными значениями.
//3) Вывести на экран первые 100 четных чисел коллеции внутри with() с использованием let.

val list: MutableList<Int>? = mutableListOf()

fun main() {
    list?.let {
        with(it) {
            for (i in 0 until 1000) {
                add((0..1000).random())
            }
            for (num in take(100)) {
                println(num)
            }
        }
    }
}
