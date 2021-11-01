package oop.inheritance

open class Animal(val name: String, var weight: Float, val habitat: String) {

    open fun eat() {
        println("Кушаю еду...")
    }

    open fun run() {
        println("Бегу...")
    }

}