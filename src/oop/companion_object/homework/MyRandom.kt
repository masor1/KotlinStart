package oop.companion_object.homework

class MyRandom {
    companion object {
        private const val MONDAY = "MONDAY"
        private const val TUESDAY = "TUESDAY"
        private const val WEDNESDAY = "WEDNESDAY"
        private const val THURSDAY = "THURSDAY"
        private const val FRIDAY = "FRIDAY"
        private const val SATURDAY = "SATURDAY"
        private const val SUNDAY = "SUNDAY"

        fun random(numFromTo: IntRange) = numFromTo.random()
        fun randomBool() = listOf(true, false).random()
        fun randomDayOfWeek() = listOf(MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY).random()
    }
}