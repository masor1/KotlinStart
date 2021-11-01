package oop.inheritance

class Animal(val name: String, var weight: Float, val habitat: String) {

    fun eat() {
        println("Кушаю еду...")
    }

    fun run() {
        println("Бегу...")
    }

}