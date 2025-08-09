package org.example.lesson_2

import kotlin.math.pow

const val ONE_HUNDRED_PERCENT = 100

fun main() {
    val initialAmountOfDeposit: Int = 70000
    val interestRate = 16.7
    val numberOfPeriods: Int = 20
    val finalAmountOfDeposit = (1 + interestRate / ONE_HUNDRED_PERCENT).pow(numberOfPeriods) * initialAmountOfDeposit

    println("The final contribution amount after $numberOfPeriods years: %.3f".format(finalAmountOfDeposit))
}