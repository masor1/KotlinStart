package functional_programming.extension_functions

fun main() {
    val age = 131
    myWith(age) {
        println(toString().length)
    }
}

fun Int.isAgeValid() = this in 6..100

fun Int.isPositive() = this >= 0

fun Int.isPrime(): Boolean {
    if (this <= 3) return true
    for (i in 2 until this) if (this % i == 0) return false
    return true
}

inline fun<T, R> myWith(obj: T, operation: T.() -> R): R {
    return obj.operation()
}

