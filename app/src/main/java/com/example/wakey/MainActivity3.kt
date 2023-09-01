package com.example.wakey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        supportActionBar?.hide()

        val skip: TextView = findViewById(R.id.skip)
        skip.setOnClickListener {
            // Define the intent
            val intent = Intent(this, Subscribe::class.java)
            // Start the activity using the intent
            startActivity(intent)
        }

        val more = findViewById<Button>(R.id.find_more)
        more.setOnClickListener {
            // Define the intent
            val intent = Intent(this, MainActivity4::class.java)
            // Start the activity using the intent
            startActivity(intent)
        }

    }


}