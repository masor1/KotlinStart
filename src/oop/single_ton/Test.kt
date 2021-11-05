package oop.single_ton

class Test {
    fun insertTestData(str: String) {
        Database().insertData(str)
    }
}