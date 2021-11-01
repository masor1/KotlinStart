package oop.inheritance.homework

class Programmer(name: String, age: Int, var programmingLanguage: String) : Employee(name, age) {

    override fun work() {
        println("Пишу код на $programmingLanguage")
    }

}