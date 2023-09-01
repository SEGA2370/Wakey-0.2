package com.example.wakey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Notification : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification)
        supportActionBar?.hide()

        val close = findViewById<ImageButton>(R.id.close_notify)
        close.setOnClickListener {
            // Define the intent
            val intent = Intent(this, MainActivity6::class.java)
            // Start the activity using the intent
            startActivity(intent)
        }

    }
}

