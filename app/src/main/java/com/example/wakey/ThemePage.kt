package com.example.wakey

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ThemePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_theme_page)
        supportActionBar?.hide()



    }
}