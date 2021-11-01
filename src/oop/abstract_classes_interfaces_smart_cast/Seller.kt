package oop.abstract_classes_interfaces_smart_cast

class Seller(name: String, age: Int, var product: String) : Worker(name = name, age = age), Cleaner {
    override fun work() {
        println("$name продает $product")
    }

    override fun clean() {
        println("Продавец $name убирается...")
    }
}