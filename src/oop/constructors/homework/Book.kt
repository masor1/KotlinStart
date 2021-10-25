package oop.constructors.homework

class Book(val name: String, var yearOfIssue: Int? = null, var price: Int? = null) {

    override fun toString(): String {
        return "Book(name = $name, yearOfIssue = $yearOfIssue, price = $price)"
    }
}