package oop.abstract_classes_interfaces_smart_cast

class Director(name: String, age: Int) : Worker(name, age) {
    override fun work() {
        println("Слежу за процессом...")
    }
}