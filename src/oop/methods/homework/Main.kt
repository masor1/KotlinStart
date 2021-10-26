package oop.methods.homework

fun main() {
    val employee = Employee("Fedor", "Android developer", 2021)

    employee.work()
    employee.showInfo()
}

fun Employee.showInfo() = println(
            "Employee(" +
            "name: $name, " +
            "position: $position, " +
            "yearOfEmployment: $yearOfEmployment, " +
            "experience: $experience" +
            ")"
)