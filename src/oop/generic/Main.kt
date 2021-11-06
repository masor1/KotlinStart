package oop.generic

fun main() {
    val list = MyArrayList<Int>()
    list.add(1)
    list.add(2)
    list.add(3)
    list.add(4)
    list.add(5)
    list.removeAt(4)
    list.remove(2)

    for (i in 0 until list.size()) {
        println(list.get(i))
    }
}