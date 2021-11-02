package oop.anonymous_classes

class Bike(name: String) : Transport(name = name) {

    override fun drive() {
        println("Велосипед едет...")
    }

}