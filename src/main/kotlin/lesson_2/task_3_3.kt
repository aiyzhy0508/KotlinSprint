package org.example.lesson_2

const val TIME_60 = 60
fun main() {
    val exitHour = 9
    val exitMinute = 39
    val tripTime = 457

    val arriveHour = exitHour + tripTime / TIME_60
    val arriveMinute = exitMinute + tripTime % TIME_60

    if (exitMinute + arriveMinute > 59) {
        println("%02d:%02d".format(arriveHour + 1, arriveMinute - 60))
    } else {
        println("%02d:%02d".format(arriveHour, arriveMinute))
    }


}