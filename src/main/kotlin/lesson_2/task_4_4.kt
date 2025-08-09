package org.example.lesson_2

fun main() {
    val crystalOre: Int = 7
    val ironOre: Int = 11
    val buffPercentage: Float = 0.2f

    println("Crystal Ore: %.0f".format(crystalOre * buffPercentage))
    println("Iron Ore: %.0f".format(ironOre * buffPercentage))
}