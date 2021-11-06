package oop.generic

interface MyList<T> {
    fun get(index: Int): T
    fun add(element: T)
    fun remove(element: T)
    fun removeAt(index: Int)
    fun size(): Int
}