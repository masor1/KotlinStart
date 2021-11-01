package oop.inheritance.homework

fun main() {

    val employees = mutableListOf(
        Programmer("Ivan", 32, "C++"),
        Employee("Petr", 23),
        Employee("Evgenia", 45),
        Employee("Denis", 35),
        Employee("Maxim", 20),
        Programmer("Fedor", 22, "Kotlin/Java"),
        Programmer("Ksenia", 22, "Python"),
        Employee("Artem", 24),
        Programmer("Anton", 21, "Java"),
    )

    employees.forEach {
        it.work()
    }

}