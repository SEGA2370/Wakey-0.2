package com.example.wakey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainAlarmSet : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_alarm_set)
        supportActionBar?.hide()

        val cancel= findViewById<TextView>(R.id.cancel)
        cancel.setOnClickListener {
            // Define the intent
            val intent = Intent(this, MainActivity8::class.java)
            // Start the activity using the intent
            startActivity(intent)
        }

        val preview= findViewById<TextView>(R.id.alarm_preview)
        preview.setOnClickListener {
            // Define the intent
            val intent = Intent(this, AlarmStop::class.java)
            // Start the activity using the intent
            startActivity(intent)
        }

    }
}