package com.example.wakey

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity7Page2 : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var contaclist : ArrayList<Contacts>
    private lateinit var contactAdapter: ContactsAdapter // Create an instance of your adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activity7_page2)

        recyclerView = findViewById(R.id.recyclerview_contacts)
        recyclerView.layoutManager = LinearLayoutManager(this)


        // Initialize the ArrayList before adding items
        contaclist = ArrayList()

        contaclist.add(Contacts(R.drawable.pic1,"Abinaya Pillai","Shared Stats", R.drawable.dmpink,"500",R.drawable.dmdiamond))
        contaclist.add(Contacts(R.drawable.pic1,"Archana Pillai","Shared Stats", R.drawable.dmpink,"492",R.drawable.dmdiamond))
        contaclist.add(Contacts(R.drawable.pic1,"Sai","Shared Stats", R.drawable.dmpink,"200",R.drawable.dmdiamond))
        contaclist.add(Contacts(R.drawable.pic1,"Choji Akimichi","Shared Stats", R.drawable.dmpink,"96",R.drawable.dmdiamond))
        contaclist.add(Contacts(R.drawable.pic1,"Sikamaru Nara","Shared Stats", R.drawable.dmpink,"10",R.drawable.dmdiamond))
        contaclist.add(Contacts(R.drawable.pic1,"Sakura Haruno","Shared Stats", R.drawable.dmpink,"",R.drawable.blank))
        contaclist.add(Contacts(R.drawable.pic1,"Maroline Jonas","Shared Stats", R.drawable.dmpink,"500",R.drawable.blank))
        contaclist.add(Contacts(R.drawable.pic1,"Andre Adam","Shared Stats", R.drawable.dmpink,"500",R.drawable.blank))
        contaclist.add(Contacts(R.drawable.pic1,"Abinaya Pillai","Shared Stats", R.drawable.dmpink,"500",R.drawable.dmdiamond))
        contaclist.add(Contacts(R.drawable.pic1,"Archana Pillai","Shared Stats", R.drawable.dmpink,"492",R.drawable.dmdiamond))
        contaclist.add(Contacts(R.drawable.pic1,"Sai","Shared Stats", R.drawable.dmpink,"200",R.drawable.dmdiamond))
        contaclist.add(Contacts(R.drawable.pic1,"Choji Akimichi","Shared Stats", R.drawable.dmpink,"96",R.drawable.dmdiamond))
        contaclist.add(Contacts(R.drawable.pic1,"Sikamaru Nara","Shared Stats", R.drawable.dmpink,"10",R.drawable.dmdiamond))
        contaclist.add(Contacts(R.drawable.pic1,"Sakura Haruno","Shared Stats", R.drawable.dmpink,"",R.drawable.blank))
        contaclist.add(Contacts(R.drawable.pic1,"Maroline Jonas","Shared Stats", R.drawable.dmpink,"500",R.drawable.blank))
        contaclist.add(Contacts(R.drawable.pic1,"Andre Adam","Shared Stats", R.drawable.dmpink,"500",R.drawable.blank))

        // Create an instance of your adapter and pass the list
        contactAdapter = ContactsAdapter(contaclist)

        // Set the adapter to your RecyclerView
        recyclerView.adapter = contactAdapter
    }
}
