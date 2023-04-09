package com.example.kotlinbasics

import java.util.Scanner

fun main() {
    val number = listOf(10, 20, 30, 40, 20)
    val largestThree = number.sortedDescending().take(3)
    println("The 3 Largest Numbers are $largestThree")

    val average = number.average()
    println("The average of $number is $average")


    println("Enter any name to check whether it's a Palindrome or not : ")
    val str1 = Scanner(System.`in`).next()
    println(isPalindrome(str1))


    println("Enter any year to check whether its a Leap Year or not")
    val year = Scanner(System.`in`).nextInt()

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

