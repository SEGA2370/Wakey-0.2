package com.example.wakey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivityProfile : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_profile)
        supportActionBar?.hide()

        val feedback = findViewById<ConstraintLayout>(R.id.menu_text2)
        feedback.setOnClickListener {
            // Define the intent
            val intent = Intent(this, FeedbackPage::class.java)
            // Start the activity using the intent
            startActivity(intent)
        }

        val goal = findViewById<ConstraintLayout>(R.id.menu_text1)
        goal.setOnClickListener {
            // Define the intent
            val intent = Intent(this, MainActivity8::class.java)
            // Start the activity using the intent
            startActivity(intent)
        }

        val edit = findViewById<TextView>(R.id.edit_query)
        edit.setOnClickListener {
            // Define the intent
            val intent = Intent(this, ThemePage::class.java)
            // Start the activity using the intent
            startActivity(intent)
        }

        val home = findViewById<ImageButton>(R.id.nav_home_button)
        home.setOnClickListener {
            // Define the intent
            val intent = Intent(this, MainActivity6::class.java)
            // Start the activity using the intent
            startActivity(intent)
        }

        val flame = findViewById<ImageButton>(R.id.nav_flame_button)
        flame.setOnClickListener {
            // Define the intent
            val intent = Intent(this, MainActivity7::class.java)
            // Start the activity using the intent
            startActivity(intent)
        }

        val alarm = findViewById<ImageButton>(R.id.nav_alarm_button)
        alarm.setOnClickListener {
            // Define the intent
            val intent = Intent(this, MainActivity8::class.java)
            // Start the activity using the intent
            startActivity(intent)
        }

        val profile = findViewById<ImageButton>(R.id.nav_profile_button)
        profile.setOnClickListener {
            // Define the intent
            val intent = Intent(this, MainActivityProfile::class.java)
            // Start the activity using the intent
            startActivity(intent)
        }

    }
}