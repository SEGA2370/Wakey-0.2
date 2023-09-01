package com.example.wakey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainCreateProfile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_create_profile)

        val create = findViewById<Button>(R.id.create_button)

        create.setOnClickListener {
            // Define the intent
            val intent = Intent(this, MainActivity2::class.java)
            // Start the activity using the intent
            startActivity(intent)
            finish()
        }

    }
}