package com.robocontest.android.robocontesttasks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private val items = listOf(
        Task(1, "A+B", 1, "Oson"),
        Task(2, "Katta-kichik", 3, "Oson"),
        Task(3, "A+B", 35, "Uzun sonlar arifmetikasi"),
        Task(4, "Minimum va maksimum yig'indi", 35, "Uzun sonlar arifmetikasi"),
        )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tasksRecycler = findViewById<RecyclerView>(R.id.tasks_recycler)
        tasksRecycler.layoutManager = LinearLayoutManager(this)
        tasksRecycler.adapter = TasksRecyclerAdapter(items)
    }
}