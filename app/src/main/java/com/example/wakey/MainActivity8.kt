package com.example.wakey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.cardview.widget.CardView

class MainActivity8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main8)
        supportActionBar?.hide()

        val alarmsetting2 = findViewById<ImageButton>(R.id.alarm_set_button)
        alarmsetting2.setOnClickListener {
            // Define the intent
            val intent = Intent(this, MainAlarmSet::class.java)
            // Start the activity using the intent
            startActivity(intent)
        }

        val alarmsetting1 = findViewById<CardView>(R.id.page_8_bar_3)
        alarmsetting1.setOnClickListener {
            // Define the intent
            val intent = Intent(this, MainAlarmSet::class.java)
            // Start the activity using the intent
            startActivity(intent)
        }

        val alarmsetting = findViewById<CardView>(R.id.page_8_bar_2)
        alarmsetting.setOnClickListener {
            // Define the intent
            val intent = Intent(this, MainAlarmSet::class.java)
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