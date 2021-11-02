package oop.anonymous_classes.homework

fun main() {
    val sportsmanship = Sportsmanship()
    sportsmanship.callWaterboy(object : Waterboy{
        override fun bringWater() {
            println("Несу воду...")
        }
    })
}