package basic_syntax.cycles

fun main() {
    //Задача: Создать массив чисел от 300 до 600,
    //вывести в консоль в порядке убывания значения массива делящиеся на 5 без остатка -> (600, 595, 590...).
    val arr = arrayOfNulls<Int>(301)

    for ((index, i) in (300..600).withIndex()) {
        arr[index] = i
    }

    for (i in arr.size - 1 downTo 0 step 5) {
        println(arr[i])
    }
}