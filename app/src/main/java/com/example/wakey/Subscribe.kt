package com.example.wakey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Subscribe : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_subscribe)
        supportActionBar?.hide()

        val more = findViewById<ImageButton>(R.id.close)
        more.setOnClickListener {
            // Define the intent
            val intent = Intent(this, MainActivity6::class.java)
            // Start the activity using the intent
            startActivity(intent)
            finish()
        }

    }
}