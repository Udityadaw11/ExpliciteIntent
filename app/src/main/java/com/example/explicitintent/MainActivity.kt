package com.example.explicitintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // create a variable
        val btnIntent = findViewById<Button>(R.id.button)

        // action to be performed after clicking the button
        btnIntent.setOnClickListener {
            // to open a new activity
            intent = Intent(applicationContext, SecondActivity:: class.java)
            startActivity(intent)
        }
    }
}