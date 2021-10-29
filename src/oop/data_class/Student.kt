package oop.data_class

class Student(val name: String, val lastName: String, val id: String) {

    fun copy(
        name: String = this.name,
        lastName: String = this.lastName,
        id: String = this.id
    ): Student {
        return Student(name, lastName, id)
    }

    operator fun component1() = name
    operator fun component2() = lastName
    operator fun component3() = id
}