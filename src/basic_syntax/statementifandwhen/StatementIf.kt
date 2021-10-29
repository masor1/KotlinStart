package basic_syntax.statementifandwhen


fun main() {
    //Задача: по количеству денег определить, что можно купить.
    val money = 500
    val product = if (money >= 500) {
        "pizza"
    } else if (money >= 200) {
        "shawarma"
    } else {
        "doshirak"
    }
    println("You can afford to buy $product")

    //Задача: по введенной температуре воды определить ее физическое состояние.
    val temp = -10
    val state = if (temp >= 100) {
        "Газообразное"
    } else if (temp > 0) {
        "Жидкое"
    } else {
        "Твердое"
    }
    println("Состояние воды при $temp градусах: $state")
}