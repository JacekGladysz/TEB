package com.example.myapplication3

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var number = 0

    var textField = findViewById<TextView>(R.id.text_field)
    var plus = findViewById<Button>(R.id.plus_button)
    var minus = findViewById<Button>(R.id.minus_button)

    plus.setOnClickListener{
        number++
            textField.text = "$number"
    }


/*
    var button4 = findViewById<Button>(R.id.button4)
     button4.setOnClickListener{
        println("klik")

        Toast.makeText(context: this, text: "hura", Toast.LENGTH_SHORT).show()
        textField.text = "tekst wpisany z listenera"
    }

    var textField = findViewById<TextView>(R.id.text_field)
    textField = "to też jest tekst z kodu"
*/
    }
}