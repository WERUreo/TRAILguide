package com.werureo.trailguide.activities

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import com.werureo.trailguide.R
import com.werureo.trailguide.adapters.CategoryItemsAdapter
import com.werureo.trailguide.services.DataService
import com.werureo.trailguide.utilities.EXTRA_CATEGORY
import com.werureo.trailguide.utilities.EXTRA_CATEGORY_ITEM
import kotlinx.android.synthetic.main.activity_category_items.*

class CategoryItemsActivity : AppCompatActivity() {

    private lateinit var adapter: CategoryItemsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category_items)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        adapter = CategoryItemsAdapter(this, DataService.getCategoryItems(categoryType)) { categoryItem ->
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(EXTRA_CATEGORY_ITEM, categoryItem)
            startActivity(intent)
        }

        val layoutManager = GridLayoutManager(this, 2)

        gridView.adapter = adapter
        gridView.layoutManager = layoutManager
        gridView.setHasFixedSize(true)

        categoryText?.text = getString(R.string.category_title, categoryType)
    }
}
