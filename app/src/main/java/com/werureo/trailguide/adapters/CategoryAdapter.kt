package com.werureo.trailguide.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.werureo.trailguide.R
import com.werureo.trailguide.models.Category
import com.werureo.trailguide.utilities.ImageHelper
import kotlinx.android.synthetic.main.category_list_item.view.*


class CategoryAdapter(
        private val context: Context,
        private val categories: List<Category>,
        private val itemClick: (Category) -> Unit
) : RecyclerView.Adapter<CategoryAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): CategoryAdapter.ViewHolder {
        val view = LayoutInflater
                .from(parent?.context)
                .inflate(
                        R.layout.category_list_item,
                        parent,
                        false
                )
        return ViewHolder(view, itemClick)
    }

    override fun getItemCount() = categories.count()

    override fun onBindViewHolder(holder: CategoryAdapter.ViewHolder?, position: Int) {
        holder?.bind(categories[position])
    }

    inner class ViewHolder(
            itemView: View?,
            val itemClick: (Category) -> Unit
    ) : RecyclerView.ViewHolder(itemView) {

        fun bind(category: Category) {
            itemView?.categoryName?.text = category.name

            val resourceId = ImageHelper.getImageFromName(
                    context,
                    category.image
            )

            itemView?.categoryImage?.setImageResource(resourceId)
            itemView.setOnClickListener { itemClick(category) }
        }
    }
}