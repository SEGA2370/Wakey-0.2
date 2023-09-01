package com.example.wakey

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactsAdapter(private val contactsList:ArrayList<Contacts>)
    : RecyclerView.Adapter<ContactsAdapter.ContactsViewHolder>(){
    class ContactsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val imageView : ImageView = itemView.findViewById(R.id.avatar)
        val name : TextView = itemView.findViewById(R.id.name_contact)
        val stat : TextView = itemView.findViewById(R.id.stats)
        val direct : ImageView = itemView.findViewById(R.id.direct_message)
        val point : TextView = itemView.findViewById(R.id.points)
        val diamond : ImageView = itemView.findViewById(R.id.diamond)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.eachitem_contacts , parent , false)
        return ContactsViewHolder(view)
    }

    override fun getItemCount(): Int {
        return contactsList.size
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        val contact = contactsList[position]
        holder.imageView.setImageResource(contact.avatar)
        holder.name.text = contact.name
        holder.stat.text = contact.stats
        holder.direct.setImageResource(contact.dm)
        holder.point.text = contact.points
        holder.diamond.setImageResource(contact.diamond)
    }
}