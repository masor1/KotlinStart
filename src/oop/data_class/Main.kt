package oop.data_class

fun main() {
    val student1 = Student("Fedor", "Turkov", "0")
    val student2 = Student("Fedor", "Turkov", "0")

    println(student1)
    println(student2)

    println(student1.hashCode())
    println(student2.hashCode())

    println(student1 == student2)
    println(student1 === student2)

    val (name, _, id) = student1 //destructor
    println(name)
    println(id)
}