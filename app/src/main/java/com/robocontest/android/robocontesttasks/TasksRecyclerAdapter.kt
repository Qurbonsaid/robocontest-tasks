package com.robocontest.android.robocontesttasks

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TasksRecyclerAdapter(private val items: List<Task>) :
    RecyclerView.Adapter<TasksRecyclerAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.task_view, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        if (position % 2 == 0) holder.itemView.setBackgroundResource(R.color.darker)
        holder.idView.text = items[position].id.toString().padStart(4, '0')
        holder.nameView.text = items[position].name
        holder.complexityView.text = String.format("%d%%", items[position].complexity)
        holder.typeView.text = items[position].type
    }

    override fun getItemCount(): Int = items.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val idView: TextView = itemView.findViewById(R.id.id_text)
        val nameView: TextView = itemView.findViewById(R.id.name_text)
        val complexityView: TextView = itemView.findViewById(R.id.complexity)
        val typeView: TextView = itemView.findViewById(R.id.type_text)
    }
}