package com.werureo.trailguide.activities

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import com.werureo.trailguide.R
import com.werureo.trailguide.adapters.CategoryItemsAdapter
import com.werureo.trailguide.models.CategoryItem
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
            launchActivity(categoryItem)
        }

        var layout = resources.configuration.screenLayout
        layout = layout and Configuration.SCREENLAYOUT_SIZE_MASK

        var spanCount = 2
        if (layout == Configuration.SCREENLAYOUT_SIZE_XLARGE) {
            spanCount = 4
        }

        val layoutManager = GridLayoutManager(this, spanCount)

        gridView.adapter = adapter
        gridView.layoutManager = layoutManager
        gridView.setHasFixedSize(true)

        categoryText?.text = getString(R.string.category_title, categoryType)
    }

    private fun launchActivity(category: CategoryItem) {
        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra(EXTRA_CATEGORY_ITEM, category)
        startActivity(intent)
    }
}
