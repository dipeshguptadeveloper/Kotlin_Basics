package com.example.kotlinbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val user = UserModel(
            "Dipesh",
            "dipeshgupta0295@gmail.com",
            28, "9867990635"
        )

        val user2 = user.copy(name = "Sachin", age = 25)
        println(user)
        println(user2)

    }


}