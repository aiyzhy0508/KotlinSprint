package org.example.lesson_2

const val TIME_60 = 60
fun main() {
    val exitHour = 9
    val exitMinute = 39
    val tripTime = 457

    val arriveTimeInMinute = (exitHour * 60 + exitMinute + tripTime) % 1440

    val arriveHour = arriveTimeInMinute / TIME_60
    val arriveMinute = arriveTimeInMinute % TIME_60

    println("%02d:%02d".format(arriveHour, arriveMinute))


}