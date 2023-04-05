package com.example.kotlinbasics

import java.util.Scanner

fun main() {


    /* println("Enter the Lower Limit to find Odd/Even Number")
     val sc = Scanner(System.`in`)
     val lowerLimit = sc.nextInt()
     println("Enter the Upper Limit to find Odd/Even Number")
     val upperLimit = sc.nextInt()

     val arrOdd = ArrayList<Int>()
     val arrEven = ArrayList<Int>()

     if (lowerLimit > upperLimit) {
         println("Lower Limit should be less than Upper Limit")
     } else {

         for (i in lowerLimit..upperLimit) {
             if (i % 2 == 0) {
                 arrEven.add(i)
             } else {
                 arrOdd.add(i)
             }
         }

         println("Even nos. are $arrEven")
         println("Odd nos. are $arrOdd")
     }*/


    println("Enter the no. of terms to print :")
    val userTerm = Scanner(System.`in`).nextInt()

    var myTerms = 0
    var no = 1


    val arrEven = ArrayList<Int>()
    val arrOdd = ArrayList<Int>()

    while (myTerms < userTerm) {

//        for even no

       /* if (no % 2 == 0) {
            arrEven.add(no)
            myTerms++
        }
        no++*/

        if (no % 2 !== 0) {
            arrOdd.add(no)
            myTerms++
        }
        no++
    }
    print("First $userTerm Even No. are $arrEven \n")
    print("First $userTerm Odd No. are $arrOdd")

}