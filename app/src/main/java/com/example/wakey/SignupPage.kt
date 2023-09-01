package com.example.wakey

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.cardview.widget.CardView

class SignupPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup_page)
        supportActionBar?.hide()

        val linkButton = findViewById<CardView>(R.id.apple)
        linkButton.setOnClickListener {
            val url = "https://www.apple.com/" // Replace with your URL
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        val linkButton1 = findViewById<CardView>(R.id.google)
        linkButton1.setOnClickListener {
            val url = "https://www.google.com/webhp?hl=en&sa=X&ved=0ahUKEwjKs5r01oaBAxXnYPEDHS_WDK4QPAgJ" // Replace with your URL
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        val linkButton2 = findViewById<CardView>(R.id.facebook)
        linkButton2.setOnClickListener {
            val url = "https://www.facebook.com/" // Replace with your URL
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        val signin: TextView = findViewById(R.id.signin)
        signin.setOnClickListener {
            // Define the intent
            val intent = Intent(this, SigninPage::class.java)
            // Start the activity using the intent
            startActivity(intent)
            finish()
        }

        val signupbutton = findViewById<Button>(R.id.signup_button)
        signupbutton.setOnClickListener{
            val intent = Intent(this,MainCreateProfile::class.java)
            startActivity(intent)
            finish()
        }

    }
}