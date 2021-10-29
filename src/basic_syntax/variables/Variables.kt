package basic_syntax.variables

fun main() {
    var nameVar: String = "Ivan"
    val nameVal = "Max" //final
    val int = 999_999_999
    val float = 9_999_999.9F
    val double = 22.2
    val long: Long = 999_999_999_999_999_999

    nameVar = nameVal //nameVar = "Max"
    //nameVal = nameVar -> error: "Kotlin: Val cannot be reassigned"

    println(
        "nameVar = $nameVar\n" +
        "nameVal = $nameVal\n" +
        "float = $float" +
        "int = $int\n" +
        "double = $double\n" +
        "long = $long\n"
    )
}