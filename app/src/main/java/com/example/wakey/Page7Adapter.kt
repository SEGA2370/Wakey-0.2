package com.example.wakey

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Page7Adapter(private  val page7list:ArrayList<Page7>)
    : RecyclerView.Adapter<Page7Adapter.Page7ViewHolder>()
{
    class Page7ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val imageView : ImageView = itemView.findViewById(R.id.each_item_page7_graphpic)
        val textView : TextView = itemView.findViewById(R.id.each_item_page7_time)
        val textView1 : TextView = itemView.findViewById(R.id.each_item_page7_workoutime)
        val textView2 : TextView = itemView.findViewById(R.id.each_item_page7_discipline)
        val imageView1 : ImageView = itemView.findViewById(R.id.each_item_page7_flame)
        val textView3 : TextView = itemView.findViewById(R.id.each_item_page7_cal_burnt)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Page7ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.each_item_page7 , parent , false)
        return Page7ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return page7list.size
    }

    override fun onBindViewHolder(holder: Page7ViewHolder, position: Int) {
        val page7 = page7list[position]
        holder.imageView.setImageResource(page7.image)
        holder.textView.text = page7.name
        holder.textView1.text = page7.time
        holder.textView2.text = page7.workout
        holder.imageView1.setImageResource(page7.flame)
        holder.textView3.text = page7.calories
    }

}