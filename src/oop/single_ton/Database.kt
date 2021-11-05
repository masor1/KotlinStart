package oop.single_ton

class Database private constructor() {
    val name = "main.db"
    val version = 1
    val data = mutableListOf<String>()

    fun insertData(str: String) {
        data.add(str)
    }

    companion object {
        private var db: Database? = null

        fun getInstance(): Database {
            if (db == null) {
                db = Database()
            }
            return db as Database
        }
    }

}