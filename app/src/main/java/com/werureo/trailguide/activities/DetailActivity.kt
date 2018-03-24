package com.werureo.trailguide.activities

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.werureo.trailguide.R
import com.werureo.trailguide.models.CategoryItem
import com.werureo.trailguide.utilities.EXTRA_CATEGORY_ITEM
import com.werureo.trailguide.utilities.ImageHelper
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val categoryItem = intent.getParcelableExtra<CategoryItem>(EXTRA_CATEGORY_ITEM)

        categoryItemName.text = categoryItem.name
        categoryItemDescription.text = categoryItem.description
        categoryItemImage.setImageResource(ImageHelper.getImageFromName(this, categoryItem.image))
        amazonButton.setOnClickListener {
            openWebPage("https://www.amazon.com")
        }
    }

    fun openWebPage(url: String) {
        val webpage = Uri.parse(url)
        val intent = Intent(Intent.ACTION_VIEW, webpage)
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        }
    }
}
