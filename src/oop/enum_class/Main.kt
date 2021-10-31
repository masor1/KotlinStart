package oop.enum_class

import oop.enum_class.Month.*
import oop.enum_class.Season.*

fun main() {
    val month: Month = APRIL
    val season = when (month) {
        DECEMBER, JANUARY, FEBRUARY -> WINTER
        MARCH, APRIL, MAY -> SPRING
        JUNE, JULY, AUGUST -> SUMMER
        SEPTEMBER, OCTOBER, NOVEMBER -> AUTUMN
    }
    println("Season: $season. Temp average: ${season.tempAverage}°C")
}