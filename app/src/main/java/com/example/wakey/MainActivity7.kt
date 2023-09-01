package com.example.wakey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity7 : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var page7list : ArrayList<Page7>
    private lateinit var page7adapter: Page7Adapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)
        supportActionBar?.hide()


        val streak = findViewById<TextView>(R.id.streaks)
        streak.setOnClickListener {
            // Define the intent
            val intent = Intent(this, MainActivity7Page2::class.java)
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



        recyclerView = findViewById(R.id.recyclerview_page7)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Initialize the ArrayList before adding items
        page7list = ArrayList()

        page7list.add(Page7(R.drawable.frame1 , "6:00AM","1:36:02: h", "Yoga",R.drawable.flame,"480 Cal"))
        page7list.add(Page7(R.drawable.frame1 , "6:00AM","1:36:02: h", "Yoga",R.drawable.flame,"480 Cal"))
        page7list.add(Page7(R.drawable.frame1 , "6:00AM","1:36:02: h", "Yoga",R.drawable.flame,"480 Cal"))

        page7adapter = Page7Adapter(page7list)
        recyclerView.adapter = page7adapter

    }
}