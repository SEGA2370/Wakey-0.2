package com.example.wakey

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class FeedbackPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feedback_page)

        supportActionBar?.hide()

    }
}