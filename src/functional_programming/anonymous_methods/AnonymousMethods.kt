package functional_programming.anonymous_methods

fun main() {
    val sum: (Int, Int) -> Int = { a, b -> a + b }
    println(sum(1, 3))

    //Задача: создать переменную square, которая хранит в себе фун-ю.
    //Эта функция принимает число типа Int и возвращает это число в квадрате.
    val square: (Int) -> Int = { it * it }
    println(square(5))

    //Задача:  создать лямбда-выражения и сохранить их в переменные
    //1. Принимает 2 стороны прямоугольника и возвращает его периметр.
    //2. Принимает имя, возвращает "Привет, (имя)!" ничего не возвращает.
    //3. Принимает массив чисел в качестве параметра, возвращает массив, отсортированный по убыванию.

    val p: (Int, Int) -> (Int) = { a, b -> (a + b) * 2 }

    val helloName: (String) -> (Unit) = { println("Привет, $it") }

    val sort: (Array<Int>) -> (Array<Int>) = {
        for (i in 1 until it.size) {
            for (j in it.size - 1 downTo i) {
                if (it[j] > it[j - 1]) {
                    val temp = it[j]
                    it[j] = it[j - 1]
                    it[j - 1] = temp
                }
            }
        }
        it
    }
    val s = sort(arrayOf(1, 34, 12, 67, 87, 655, 44, 657, 46, 0, 0, 0, 1, 2, 3, 3, 2, 1))
    for (i in s) {
        println(i)
    }
}