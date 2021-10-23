package oop.introduction.homework


class Dog {
    var name: String = ""
        get() = field.lowercase().replaceFirstChar(Char::uppercase)

    var age: Int = 0
        set(value) {
            if (value > 0) {
                field = value
            }
        }

    var weight: Int = 0
        set(value) {
            if (value > 0) {
                field = value
            }
        }
}