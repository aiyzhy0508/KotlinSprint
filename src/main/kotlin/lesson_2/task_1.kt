package org.example.lesson_2

fun main() {
    val firstStudentMark: Float = 3f
    val secondStudentMark: Float = 4f
    val thirdStudentMark: Float = 3f
    val fourthStudentMark: Float = 5f
    val countOfStudents: Int = 4

    val averageScore: Float =
        (firstStudentMark + secondStudentMark + thirdStudentMark + fourthStudentMark) / countOfStudents
    println("%.2f".format(averageScore))
}