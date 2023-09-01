package com.example.wakey

import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.TextView

class MainActivity6 : AppCompatActivity() {

    private lateinit var myDialog: Dialog
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)
        supportActionBar?.hide()
        myDialog= Dialog(this)

        fun showPopup(){

            val txtClose: TextView
            val txtDelete: TextView
            val txtPreview: TextView

            myDialog.setContentView(R.layout.alarmpopup)
            txtClose = myDialog.findViewById(R.id.txtclose)
            txtDelete = myDialog.findViewById(R.id.txtdelete)
            txtPreview = myDialog.findViewById(R.id.txtpreview)

            txtClose.setOnClickListener {
                myDialog.dismiss()
            }

            txtPreview.setOnClickListener {
                val intent = Intent(this@MainActivity6, AlarmStop::class.java)
                startActivity(intent)
                myDialog.dismiss()
            }

            myDialog.show()

        }
        val popup: ImageButton = findViewById(R.id.popup)
        popup.setOnClickListener {
            showPopup()
        }

        val more = findViewById<ImageButton>(R.id.notification)
        more.setOnClickListener {
            // Define the intent
            val intent = Intent(this, Notification::class.java)
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