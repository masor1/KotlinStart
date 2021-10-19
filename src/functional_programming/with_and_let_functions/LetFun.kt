package functional_programming.with_and_let_functions

var name: String? = "null"

fun main() {
    name?.let {
        if (it.length > 5) {
            println("GG")
        }
    }
}