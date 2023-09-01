package com.example.wakey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        supportActionBar?.hide()

        val skip: TextView = findViewById(R.id.skip2)
        skip.setOnClickListener {
            // Define the intent
            val intent = Intent(this, Subscribe::class.java)
            // Start the activity using the intent
            startActivity(intent)
            finish()
        }

        val more = findViewById<Button>(R.id.find_more2)
        more.setOnClickListener {
            // Define the intent
            val intent = Intent(this, MainActivity5::class.java)
            // Start the activity using the intent
            startActivity(intent)
        }

    }
}