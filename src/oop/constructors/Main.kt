package oop.constructors

fun main() {
    val russia = Country("Russia", 146_171_015)
    println(russia.name)

    val unknown = Country()
    println(unknown.name)
}