package org.example.lesson_1

fun main() {
    val seconds: Int = 6480
    val minute: Int = seconds / 60
    val reamainingSeconds: Int = seconds % 60
    val hour: Int = minute / 60
    val reamainingMinutes: Int = minute % 60
    println("0$hour:$reamainingMinutes:0$reamainingSeconds")

}