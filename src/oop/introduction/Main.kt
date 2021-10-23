package oop.introduction

import oop.introduction.homework.Dog

fun main() {
    val user = User()
    user.name = "Федор"
    user.age = 22
    println("${user.name} ${user.age}")

    val dog = Dog()
    dog.name = "luk"
    dog.age = 5
    dog.age = -5
    dog.weight = 20
    dog.weight = -20

    println("${dog.name} ${dog.age} ${dog.weight}")
}