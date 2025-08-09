package org.example.lesson_3

fun main() {
    var inputNumber: Byte = 7
    var counter: Byte = 0
    println(
        """
        $inputNumber * 0 = ${inputNumber * counter}
        $inputNumber * 1 = ${inputNumber * ++counter}
        $inputNumber * 2 = ${inputNumber * ++counter}
        $inputNumber * 3 = ${inputNumber * ++counter}
        $inputNumber * 4 = ${inputNumber * ++counter}
        $inputNumber * 5 = ${inputNumber * ++counter}
        $inputNumber * 6 = ${inputNumber * ++counter}
        $inputNumber * 7 = ${inputNumber * ++counter}
        $inputNumber * 8 = ${inputNumber * ++counter}
        $inputNumber * 9 = ${inputNumber * ++counter}
        $inputNumber * 10 = ${inputNumber * ++counter}
    """.trimIndent()
    )
}