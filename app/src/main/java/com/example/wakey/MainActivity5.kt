package com.example.wakey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        supportActionBar?.hide()

        val skip: TextView = findViewById(R.id.skip3)
        skip.setOnClickListener {
            // Define the intent
            val intent = Intent(this, Subscribe::class.java)
            // Start the activity using the intent
            startActivity(intent)
            finish()
        }

        val more = findViewById<Button>(R.id.find_more3)
        more.setOnClickListener {
            // Define the intent
            val intent = Intent(this, Subscribe::class.java)
            // Start the activity using the intent
            startActivity(intent)
        }

    }
}