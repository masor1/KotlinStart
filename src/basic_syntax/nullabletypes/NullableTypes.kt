package basic_syntax.nullabletypes


//Дано:
private var st1: String? = "null"
private var st2: String? = "k"
private var st3: String? = null

//Задача: в переменную result сохранить сумму длин всех строк и вывести результат в консоль.

fun main() {
    val result = (st1?.length ?: 0) + (st2?.length ?: 0) + (st3?.length ?: 0)
    println(result)
}