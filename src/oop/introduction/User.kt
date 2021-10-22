package oop.introduction

class User {

    private var age: Int = 0
    private var name: String? = null

    fun getAge() = age

    fun setAge(age: Int) {
        this.age = age
    }

    fun getName() = name

    fun setName(name: String) {
        this.name = name
    }

}