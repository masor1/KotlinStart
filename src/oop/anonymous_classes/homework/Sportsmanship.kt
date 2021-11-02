package oop.anonymous_classes.homework

class Sportsmanship {

    fun callWaterboy(waterboy: Waterboy) {
        waterboy.bringWater()
    }

    inline fun callWaterboy(bringWater: () -> Unit) {
        return bringWater()
    }

}