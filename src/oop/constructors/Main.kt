package oop.constructors

fun main() {
    val russia = Country(name = "Russia", population = 146_171_015)
    println(russia.name)

    val unknown = Country(population = 100_000)
    println(unknown.name)
}