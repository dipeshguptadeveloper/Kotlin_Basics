package com.example.kotlinbasics

data class UserDataModel(
    val name: String,
    val email: String,
    val age: Int,
    val mobile_no: String
) {

}

fun main() {
    val userData = UserDataModel("Dipesh", "d@gmail.com", 28, "9867990635")
    println(userData.name)

    val userData2 = userData.copy(age = 27)
    println(userData2)
}