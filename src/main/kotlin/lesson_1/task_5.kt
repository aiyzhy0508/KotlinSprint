package org.example.lesson_1

fun main() {
    val time_60: Int = 60
    val seconds: Int = 6480
    val minute: Int = seconds / time_60
    val reamainingSeconds: Int = seconds % time_60
    val hour: Int = minute / time_60
    val reamainingMinutes: Int = minute % time_60
    println(String.format("%02d:%02d:%02d", hour, reamainingMinutes, reamainingSeconds))

}