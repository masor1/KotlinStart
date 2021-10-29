package oop.data_class.homework

fun main() {
    val address1 = Address("Москва", "Зеленая", 12)
    val address2 = address1.copy()

    println(address1)
    println(address2)

    println(address1.hashCode())
    println(address2.hashCode())

    println(address1 == address2)

    val (city1, street1, numberOfHouse1) = address1
    val (city2, street2, numberOfHouse2) = address2

}