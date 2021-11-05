package oop.single_ton

fun main() {
    val db = Database.getInstance()
    db.insertData("1")
    db.insertData("2")

    val test = Test()
    test.insertTestData("3")
    test.insertTestData("4")

    db.data.forEach {
        println(it)
    }
}