package functional_programming.filter_and_map

fun main() {
    val listOfNumbers = mutableListOf<Int>()
    for (i in 0..99) {
        listOfNumbers.add(i)
    }
    val listOfEvenNumbers = listOfNumbers.filter { it % 2 == 0 }

    for (i in listOfEvenNumbers) {
        println(i)
    }

    //Задача: создать коллекцию имен и вывести имена на А
    val listOfNames = mutableListOf<String>()
    for (i in 0..20) {
        when {
            i % 3 == 0 -> {
                listOfNames.add("Aname$i")
            }
            i % 2 == 0 -> {
                listOfNames.add("Name$i")
            }
            else -> {
                listOfNames.add("Fname$i")
            }
        }
    }
    val listOfANames = listOfNames.filter { it.startsWith("A") }
    for (name in listOfANames) {
        println(name)
    }

}