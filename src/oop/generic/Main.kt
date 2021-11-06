package oop.generic

import oop.generic.MyArrayList.Companion.myListOf


fun main() {
    val list = myListOf(1, 2, 3, 4, 5)
    list.removeAt(4)
    list.remove(2)

    for (i in 0 until list.size()) {
        println(list.get(i))
    }
}