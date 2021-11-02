package oop.anonymous_classes

fun main() {

    val car: Transport = Car()
    val bicycle: Transport = Bicycle()

    if (car is Car && car.startEngine()) {
        car.drive()
    }

    println(car.name)

}