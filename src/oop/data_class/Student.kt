package oop.data_class

class Student(val name: String, val lastName: String, val id: String) {
    //destructors
    operator fun component1() = name
    operator fun component2() = lastName
    operator fun component3() = id
}