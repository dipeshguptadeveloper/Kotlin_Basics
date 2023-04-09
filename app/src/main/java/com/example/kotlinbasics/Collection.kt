package com.example.kotlinbasics

class Collection {

//    1. list -> ordered data -> duplicate entries allowed
//    2. sets -> unordered data -> duplicate entries not allowed
//    3. maps -> unordered data -> data stored in key-value pair -> key should be unique but value may be duplicate

}

fun main() {
    val userList = listOf("Ram", 87, "Shyam", 87, "Raman", "Ramanujan")
    println(userList)

    val userList2 = mutableListOf("Ram", 87, "Shyam", 87, "Raman", "Ramanujan")


// add
    userList2.add("Dipesh")
    println(userList2)

//    remove
    userList2.removeAt(1)
    println(userList2)

//    set
    userList2[0] = "Ramesh"
    println(userList2)


//    iteration using while loop
    val iteration = userList2.listIterator()
    while (iteration.hasNext()) {
        println("Name is : ${iteration.next()}")
    }

//    iteration using for loop

    for (name in userList2) {
        println(name)
    }


    val totalUserList = userList + userList2

    println(totalUserList)

}