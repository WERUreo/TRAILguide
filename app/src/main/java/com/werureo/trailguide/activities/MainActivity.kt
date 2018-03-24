package com.werureo.trailguide.activities

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.werureo.trailguide.R
import com.werureo.trailguide.adapters.CategoryAdapter
import com.werureo.trailguide.services.DataService.categories
import com.werureo.trailguide.utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        val adapter = CategoryAdapter(this, categories) { category ->
            val intent = Intent(this, CategoryItemsActivity::class.java)
            intent.putExtra(EXTRA_CATEGORY, category.name)
            startActivity(intent)
        }
        recyclerView.adapter = adapter

        appInfoBtn.setOnClickListener {
            val intent = Intent(this, AppInfoActivity::class.java)
            startActivity(intent)
        }
    }
}
