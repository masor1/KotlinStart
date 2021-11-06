package oop.generic

fun main() {
    val list = MyArrayList()
    list.add("AAA")
    list.add("BBb")
    list.add("CcC")
    list.add("dDd")
    list.add("eeE")
    list.removeAt(4)
    list.remove("BBb")

    for (i in 0 until list.size()) {
        println(list.get(i))
    }
}