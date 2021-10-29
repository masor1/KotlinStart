package basic_syntax.statementifandwhen


fun main() {
    //Задача: по количеству денег определить, что можно купить.
    val money = 500
    val product = when {
        money >= 500 -> "pizza"
        money >= 200 -> "shawarma"
        else -> "doshirak"
    }
    println("You can afford to buy $product")

    //Задача: по введенному номеру месяца определить время года.
    val indexOfMonth = 3
    val season = when(indexOfMonth){
        12, 1, 2 -> "Зима"
        in 3..5 -> "Весна"
        in 6..8 -> "Лето"
        in 9..11 -> "Осень"
        else -> "Месяц не существует"
    }
    println(season)

    //Задача: по введенной температуре воды определить ее физическое состояние.
    val temp = -10
    val state = when {
        temp >= 100 -> "Газообразное"
        temp > 0 -> "Жидкое"
        else -> "Твердое"
    }
    println("Состояние воды при $temp градусах: $state")

    //Задача: дано текущее время (n часов) и состояние погоды (хорошая или плохая).
    //В зависимости от времени и погоды вывести строку:
    //1) если сейчас день и погода хорошая -> гулять
    //2) если сейчас день и погода плохая -> читать
    //3) если сейчас ночь -> спать
    val time = 12
    val weatherIsGood = false
    val action = when {
        time in 6..22 && weatherIsGood -> "гулять"
        time in 6..22 && !weatherIsGood -> "читать"
        else -> "спать"
    }
    println(action)
}