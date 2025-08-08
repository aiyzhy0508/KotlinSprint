package org.example.lesson_1

fun main() {
    val TIME_60: Int = 60
    val seconds: Int = 6480
    val minute: Int = seconds / TIME_60
    val reamainingSeconds: Int = seconds % TIME_60
    val hour: Int = minute / TIME_60
    val reamainingMinutes: Int = minute % TIME_60
    println("%02d:%02d:%02d".format(hour, reamainingMinutes, reamainingSeconds))

}