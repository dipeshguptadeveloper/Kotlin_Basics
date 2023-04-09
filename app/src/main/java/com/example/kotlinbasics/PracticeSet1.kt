package com.example.kotlinbasics

fun main() {
    val number = listOf(10, 20, 30, 40, 20)
    val largestThree = number.sortedDescending().take(3)
    println(largestThree)


    val str1 = "level"
    val str2 = "radar"
    println(isPalindrome(str1))
    println(isPalindrome(str2))

}

fun isPalindrome(str: String): Boolean {
    val length = str.length
    for (i in 0 until length / 2) {
        if (str[i] != str[length - i - 1]) {
            return false
        }
    }
    return true
}
