package functional_programming.zip_function

fun main() {
    val users = mutableListOf<String>()
    for (i in 0..1000) {
        users.add("Фамилия$i Имя$i")
    }

    val userName = users.map { (it.substringAfter(" ")) }
    val userLastname = users.map { (it.substringBefore(" ")) }
    val userPairs = userName.zip(userLastname)

    for (user in userPairs) {
        println("Имя: ${user.first} Фамилия: ${user.second}")
    }
}