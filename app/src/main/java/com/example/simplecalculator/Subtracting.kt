package com.example.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Subtracting : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_subtracting)

        val calculateButton = findViewById<Button>(R.id.calculate_button)
        val num1Field = findViewById<EditText>(R.id.numField1)
        val num2Field = findViewById<EditText>(R.id.numField2)
        val outputText = findViewById<TextView>(R.id.total)

        calculateButton.setOnClickListener{
            outputText.text = ((num1Field.text.toString().toDouble() - num2Field.text.toString().toDouble()).toString())
        }
    }
}