package oop.abstract_classes_interfaces_smart_cast

class Programmer(name: String, age: Int, var programmingLanguage: String) : Worker(name, age) {

    override fun work() {
        println("$name пишет код на $programmingLanguage...")
    }

}