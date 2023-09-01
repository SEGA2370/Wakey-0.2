package com.example.wakey

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AlarmStop : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alarm_stop)

        supportActionBar?.hide()

    }
}