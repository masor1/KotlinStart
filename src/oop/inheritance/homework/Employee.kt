package oop.inheritance.homework

open class Employee(val name: String, var age: Int) {

    open fun work() {
        println("$name работает...")
    }

}