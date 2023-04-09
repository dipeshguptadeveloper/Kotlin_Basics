package com.example.kotlinbasics

import java.util.Scanner

fun main() {
    val number = listOf(10, 20, 30, 40, 20)
    val largestThree = number.sortedDescending().take(3)
    println(largestThree)

    val average = number.average()
    println(average)


    val str1 = "level"
    val str2 = "radar"
    println(isPalindrome(str1))
    println(isPalindrome(str2))


    val year = 2022

    if (year % 4 == 0) {
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                println("$year is a leap year.")
            } else {
                println("$year is not a leap year.")
            }
        } else {
            println("$year is a leap year.")
        }
    } else {
        println("$year is not a leap year.")
    }

    println("Enter any number to print its table : ")
    val tableNumber = Scanner(System.`in`).nextInt()

    for (i in 1..10) {
        val result = tableNumber * i
        println("$tableNumber x $i = $result")
    }
}


// Palindrome function

fun isPalindrome(str: String): Boolean {
    val length = str.length
    for (i in 0 until length / 2) {
        if (str[i] != str[length - i - 1]) {
            return false
        }
    }
    return true
}

