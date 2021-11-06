package oop.generic

import java.lang.IndexOutOfBoundsException


class MyArrayList : MyList{

    private var array = arrayOfNulls<String>(10)
    private var size = 0

    override fun get(index: Int): String {
        if (index in 0 until size) {
            array[index]?.let {
                return it
            }
        }
        throw IndexOutOfBoundsException()
    }

    override fun add(string: String) {
        if (size == array.size - 1) {
            array = array.copyOf(array.size * 2)
        }
        array[size] = string
        size++
    }

    override fun remove(element: String) {
        for ((index, string) in array.withIndex()) {
            if (string == element) {
                removeAt(index = index)
                return
            }
        }
    }

    override fun removeAt(index: Int) {
        if (index in 0 until size) {
            for (i in index until size - 1) {
                array[i] = array[i + 1]
            }
            size--
        } else {
            throw IndexOutOfBoundsException()
        }
    }

    override fun size() = size

}