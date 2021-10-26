package oop.methods.homework

import java.time.Year

class Employee(var name: String, var position: String, var yearOfEmployment: Int) {

    val experience: Int
    get() = Year.now().value - yearOfEmployment

    fun work() {
        println("Работаю...")
    }

}