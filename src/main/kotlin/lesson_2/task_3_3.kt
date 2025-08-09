package org.example.lesson_2

const val TIME_60 = 60
const val COUNT_OF_MINUTES_IN_DAY = 1440
fun main() {
    val exitHour = 9
    val exitMinute = 39
    val tripTime = 457

    val arriveTimeInMinute = (exitHour * TIME_60 + exitMinute + tripTime) % COUNT_OF_MINUTES_IN_DAY

    val arriveHour = arriveTimeInMinute / TIME_60
    val arriveMinute = arriveTimeInMinute % TIME_60

    println("%02d:%02d".format(arriveHour, arriveMinute))


}