package oop.anonymous_classes

class Car(override var name: String = "Машина") : Transport(name = name){

    override fun drive() {
        println("Машина едет...")
    }

    fun startEngine(): Boolean {
        println("Запускаю двигатель...")
        return true
    }

}