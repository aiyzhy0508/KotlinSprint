package org.example.lesson_2

fun main() {
    val firstStudentMark: Int = 3
    val secondStudentMark: Int = 4
    val thirdStudentMark: Int = 3
    val fourthStudentBall: Int = 5

    val averageScore: Float = (firstStudentMark + secondStudentMark + thirdStudentMark + fourthStudentBall) / 4f
    println("%.2f".format(averageScore))
}