package org.example.lesson_3

fun main() {
    val name: String = "John"
    var greeting: String = "Good Morning, $name"

    println(greeting)
    greeting = "Good Evening, $name"
    println(greeting)
}