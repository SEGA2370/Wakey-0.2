package com.example.wakey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        supportActionBar?.hide()

        val page1: TextView = findViewById(R.id.wakeup_habit)
        page1.setOnClickListener {
            // Define the intent
            val intent = Intent(this, MainActivity3::class.java)
            // Start the activity using the intent
            startActivity(intent)
            finish()
        }

        val page2: TextView = findViewById(R.id.morning_habit)
        page2.setOnClickListener {
            // Define the intent
            val intent = Intent(this, MainActivity3::class.java)
            // Start the activity using the intent
            startActivity(intent)
            finish()
        }

        val page3: TextView = findViewById(R.id.day_habit)
        page3.setOnClickListener {
            // Define the intent
            val intent = Intent(this, MainActivity3::class.java)
            // Start the activity using the intent
            startActivity(intent)
            finish()
        }

    }

}