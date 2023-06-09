package com.example.kotlinbasics

import java.util.*
import kotlin.collections.ArrayList

fun main() {

/*    println("Enter the Lower Limit to find Odd/Even Number")
    val sc = Scanner(System.`in`)
    val lowerLimit = sc.nextInt()
    println("Enter the Upper Limit to find Odd/Even Number")
    val upperLimit = sc.nextInt()

    val arrPrime = ArrayList<Int>()

    if (lowerLimit > upperLimit) {
        println("Lower Limit should be less than Upper Limit")
    } else {

        for (i in lowerLimit..upperLimit) {
            if (checkPrimeNo(i)) {
                arrPrime.add(i)
            }
        }
        println("Prime no. are $arrPrime")

    }*/

    println("Enter the no. of terms to print :")
    val userTerm = Scanner(System.`in`).nextInt()

    var myTerms = 0
    var no = 1


    val arrPrime = ArrayList<Int>()

    while (myTerms < userTerm) {

        if (checkPrimeNo(no)) {
            arrPrime.add(no)
            myTerms++
        }
        no++
    }

    print("First $userTerm Prime No. are $arrPrime")

}

fun checkPrimeNo(no: Int): Boolean {
    var isPrime = true

    for (i in 2..no / 2) {
        if (no % i == 0) {
            isPrime = false
            break
        }
    }

    return isPrime
}