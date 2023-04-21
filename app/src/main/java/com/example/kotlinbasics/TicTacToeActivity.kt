package com.example.kotlinbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.kotlinbasics.databinding.ActivityTicTacToeBinding

class TicTacToeActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var binding: ActivityTicTacToeBinding
    var flag = 0
    var stepCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTicTacToeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener(this)
        binding.btn2.setOnClickListener(this)
        binding.btn3.setOnClickListener(this)
        binding.btn4.setOnClickListener(this)
        binding.btn5.setOnClickListener(this)
        binding.btn6.setOnClickListener(this)
        binding.btn7.setOnClickListener(this)
        binding.btn8.setOnClickListener(this)
        binding.btn9.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        val btnCurrent = v as Button

        if (btnCurrent.text.toString() == "") {

            stepCount++

            if (flag == 0) {
                btnCurrent.text = "X"
                flag = 1
            } else {
                btnCurrent.text = "0"
                flag = 0
            }

            if (stepCount > 4) {

                val b1 = binding.btn1.text.toString()
                val b2 = binding.btn2.text.toString()
                val b3 = binding.btn3.text.toString()
                val b4 = binding.btn4.text.toString()
                val b5 = binding.btn5.text.toString()
                val b6 = binding.btn6.text.toString()
                val b7 = binding.btn7.text.toString()
                val b8 = binding.btn8.text.toString()
                val b9 = binding.btn9.text.toString()

                if (b1 == b2 && b2 == b3 && b3 != "") {
                    Toast.makeText(this, "Winner is $b1", Toast.LENGTH_LONG).show()
                } else if (b4 == b5 && b5 == b6 && b6 != "") {
                    Toast.makeText(this, "Winner is $b4", Toast.LENGTH_LONG).show()
                } else if (b7 == b8 && b8 == b9 && b9 != "") {
                    Toast.makeText(this, "Winner is $b7", Toast.LENGTH_LONG).show()
                } else if (b1 == b4 && b4 == b7 && b7 != "") {
                    Toast.makeText(this, "Winner is $b1", Toast.LENGTH_LONG).show()
                } else if (b2 == b5 && b5 == b8 && b8 != "") {
                    Toast.makeText(this, "Winner is $b2", Toast.LENGTH_LONG).show()
                } else if (b3 == b6 && b6 == b9 && b9 != "") {
                    Toast.makeText(this, "Winner is $b3", Toast.LENGTH_LONG).show()
                } else if (b1 == b5 && b5 == b9 && b9 != "") {
                    Toast.makeText(this, "Winner is $b1", Toast.LENGTH_LONG).show()
                } else if (b3 == b5 && b5 == b7 && b7 != "") {
                    Toast.makeText(this, "Winner is $b3", Toast.LENGTH_LONG).show()
                } else if (stepCount == 9) {
                    Toast.makeText(this, "Match is Drawn", Toast.LENGTH_LONG).show()
                }
            }

        }

    }

}