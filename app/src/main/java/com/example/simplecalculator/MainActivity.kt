package com.example.simplecalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import android.provider.MediaStore.Audio.Radio
import android.view.View
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val addButton = findViewById<RadioButton>(R.id.add_button)
        val subtractButton = findViewById<RadioButton>(R.id.subtract_button)
        val multiplyButton = findViewById<RadioButton>(R.id.multiply_button)
        val divideButton = findViewById<RadioButton>(R.id.divide_button)
        val moduloButton = findViewById<RadioButton>(R.id.modulo_button)

        addButton.setOnClickListener{ _: View ->
            // Do something in response to the click here
            val intent = Intent(this, Adding::class.java)
            startActivity(intent)
        }
        subtractButton.setOnClickListener{ _: View ->
            // Do something in response to the click here
            val intent = Intent(this, Subtracting::class.java)
            startActivity(intent)
        }
        multiplyButton.setOnClickListener{ _: View ->
            // Do something in response to the click here
            val intent = Intent(this, Multiplying::class.java)
            startActivity(intent)
        }
        divideButton.setOnClickListener{ _: View ->
            // Do something in response to the click here
            val intent = Intent(this, Dividing::class.java)
            startActivity(intent)
        }
        moduloButton.setOnClickListener{ _: View ->
            // Do something in response to the click here
            val intent = Intent(this, Modulo::class.java)
            startActivity(intent)
        }

    }
}