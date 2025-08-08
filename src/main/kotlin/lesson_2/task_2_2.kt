package org.example.lesson_2

fun main() {
    val permanentEmployees = 50
    val employeeSalary = 30000
    val numberOfInterns = 30
    val internSalary = 20000

    val sumEmployeeSalary = permanentEmployees * employeeSalary
    val totalPayments = sumEmployeeSalary + numberOfInterns * internSalary
    val averageSalary = totalPayments / (permanentEmployees + numberOfInterns)

    println(sumEmployeeSalary)
    println(totalPayments)
    println(averageSalary)


}