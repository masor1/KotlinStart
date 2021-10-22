package oop.introduction

fun main() {
    val user = User()
    user.setName("Федор")
    user.setAge(22)
    println("${user.getName()} ${user.getAge()}")
}