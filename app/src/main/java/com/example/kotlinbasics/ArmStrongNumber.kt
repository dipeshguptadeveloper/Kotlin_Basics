package com.example.kotlinbasics

import java.util.*
import kotlin.collections.ArrayList

fun main() {


/*    println("Enter the Lower Limit to find Odd/Even Number")
    val sc = Scanner(System.`in`)
    val lowerLimit = sc.nextInt()
    println("Enter the Upper Limit to find Odd/Even Number")
    val upperLimit = sc.nextInt()

    val arrArm = ArrayList<Int>()

    if (lowerLimit > upperLimit) {
        println("Lower Limit should be less than Upper Limit")
    } else {

        for (i in lowerLimit..upperLimit) {
            if (checkArmStrongNumber(i)) {
                arrArm.add(i)
            }
        }
        println("Arm Strong no. are $arrArm")
    }*/


    println("Enter the no. of terms to print :")
    val userTerm = Scanner(System.`in`).nextInt()

    var myTerms = 0
    var no = 1


    val arrArm = ArrayList<Int>()

    while (myTerms < userTerm) {
        if (checkArmStrongNumber(no)) {
            arrArm.add(no)
            myTerms++
        }
        no++
    }

    print("First $userTerm Armstrong No. are $arrArm")

}

fun checkArmStrongNumber(orgNo: Int): Boolean {
    var count = 0
    var tempNo = orgNo
    var result = 0.0

    while (tempNo > 0) {
        tempNo /= 10
        count++
    }
    tempNo = orgNo

    while (tempNo > 0) {
        val rem = tempNo % 10
        result += Math.pow(rem.toDouble(), count.toDouble())
        tempNo /= 10
    }

    return orgNo.toDouble() == result
}