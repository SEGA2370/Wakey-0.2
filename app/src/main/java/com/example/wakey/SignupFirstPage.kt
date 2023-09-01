package com.example.wakey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SignupFirstPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup_first_page)

        supportActionBar?.hide()

        val signin : TextView = findViewById(R.id.first_page_signin)
        signin.setOnClickListener{
            val intent = Intent(this,SigninPage::class.java)
            startActivity(intent)
        }

        val signup: TextView = findViewById(R.id.first_page_signup)
        signup.setOnClickListener {
            // Define the intent
            val intent = Intent(this, SignupPage::class.java)
            // Start the activity using the intent
            startActivity(intent)
        }

    }
}