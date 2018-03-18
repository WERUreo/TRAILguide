package com.werureo.trailguide.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.werureo.trailguide.R
import com.werureo.trailguide.adapters.CategoryAdapter
import com.werureo.trailguide.models.Category
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val categories: List<Category> = listOf(
            Category("Hiking", "hiking_image"),
            Category("Camping", "camping_image"),
            Category("Diving", "diving_image"),
            Category("Surfing", "surfing_image"),
            Category("Fishing", "fishing_image")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        val adapter = CategoryAdapter(this, categories)
        recyclerView.adapter = adapter
    }
}
