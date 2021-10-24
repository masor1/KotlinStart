package oop.constructors

class Country(val name: String, var population: Long) {
    constructor(): this("", 0)
}