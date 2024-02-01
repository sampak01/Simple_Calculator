package com.example.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar

class Dividing : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dividing)

        val calculateButton = findViewById<Button>(R.id.calculate_button)
        val num1Field = findViewById<EditText>(R.id.numField1)
        val num2Field = findViewById<EditText>(R.id.numField2)
        val outputText = findViewById<TextView>(R.id.total)

        calculateButton.setOnClickListener{ view: View ->
            if(num2Field.text.toString().toDouble() == 0.0){
                Snackbar.make(view,"Divide By Zero Error",2).show()
            }else{
                outputText.text = ((num1Field.text.toString().toDouble() / num2Field.text.toString().toDouble()).toString())
            }
        }
    }
}