package com.example.kotlinbasics

fun main() {

//    for companion

    A.add(
        5,
        6
    ) // no need to create object when we use companion object to access the functions of a class
    A().sub(4, 2) // need to create object before, to access the function of a class

//    for abstract

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