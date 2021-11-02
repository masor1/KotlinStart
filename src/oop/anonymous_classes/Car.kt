package oop.anonymous_classes

class Car(name: String) : Transport(name = name){

    override fun drive() {
        println("Машина едет...")
    }

    fun startEngine(): Boolean {
        return true
    }

}