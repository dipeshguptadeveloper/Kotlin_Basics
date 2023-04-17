package com.example.kotlinbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinbasics.databinding.ActivityCalculateBinding

class CalculateActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCalculateBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalculateBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val no1 = binding.edtNo1.text.toString().toInt()
        val no2 = binding.edtNo2.text.toString().toInt()

        binding.btnAdd.setOnClickListener {

            val result = no1 + no2
            binding.txtResult.text = result.toString()
        }

        binding.btnSub.setOnClickListener {
            val result = no2 - no1
            binding.txtResult.text = result.toString()
        }

        binding.btnMulti.setOnClickListener {
            val result = no1 * no2
            binding.txtResult.text = result.toString()
        }

        binding.btnDivi.setOnClickListener {
            val result = no2 / no1
            binding.txtResult.text = result.toString()
        }
    }
}