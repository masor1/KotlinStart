package oop.lateinit_var

class Dog {
    private lateinit var a: String

    fun printA() {
        a = "Luk"
        println(a)
    }
}

fun main() {
    val dog = Dog()
    dog.printA()
}