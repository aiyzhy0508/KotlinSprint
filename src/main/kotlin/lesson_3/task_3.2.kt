package org.example.lesson_3

fun main() {
    var lastName: String = "Андреева"
    var firstName: String = "Татьяна"
    var middleName: String = "Сергеевна"
    var age = 20

    println("$lastName $firstName $middleName - $age years")

    lastName = "Сидорова"
    age = 22
    println("$lastName $firstName $middleName - $age years")
}