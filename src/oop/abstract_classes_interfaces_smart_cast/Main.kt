package oop.abstract_classes_interfaces_smart_cast

fun main() {

    val workers = mutableListOf(
        Programmer("Ivan", 32, "C++"),
        Seller("Petr", 23, "обувь"),
        Seller("Evgenia", 45, "одежду"),
        Seller("Denis", 35, "шапки"),
        Seller("Maxim", 20, "перчатки"),
        Programmer("Fedor", 22, "Kotlin/Java"),
        Programmer("Ksenia", 22, "Python"),
        Seller("Artem", 24, "пони"),
        Programmer("Anton", 21, "Java"),
        Director("Anton", 41)
    )

    workers.forEach {
        it.work()
        if (it is Cleaner) {
            it.clean()
        }
    }

}