package com.example.kotlinbasics

fun main() {

//    for companion

    A.add(
        5,
        6
    ) // no need to create object when we use companion object to access the functions of a class
    A().sub(4, 2) // need to create object before, to access the function of a class

//    for abstract

    println(Add().calculate(5, 6))
    println(Sub().calculate(10, 5))
    println(Multiply().calculate(5, 5))
    println(Division().calculate(77, 7))

}


abstract class MyClass {

    abstract fun calculate(a: Int, b: Int): Int

    fun displayName(name: String) {
        println("Name is $name")
    }

}


class Add : MyClass() {

    override fun calculate(a: Int, b: Int): Int {
        return a + b
    }

}

class Sub : MyClass() {
    override fun calculate(a: Int, b: Int): Int {
        return a - b
    }
}

class Multiply : MyClass() {
    override fun calculate(a: Int, b: Int): Int {
        return a * b
    }
}

class Division : MyClass() {
    override fun calculate(a: Int, b: Int): Int {
        return a / b
    }
}


class A {


    companion object {
        fun add(a: Int, b: Int): Int {
            return a + b
        }
    }

    fun sub(a: Int, b: Int): Int {
        return a - b
    }
}