package com.werureo.trailguide.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.werureo.trailguide.R
import com.werureo.trailguide.models.CategoryItem
import com.werureo.trailguide.utilities.ImageHelper
import kotlinx.android.synthetic.main.category_item_list_item.view.*


class CategoryItemsAdapter(
        private val context: Context,
        private val items: List<CategoryItem>,
        private val itemClick: (CategoryItem) -> Unit
) : RecyclerView.Adapter<CategoryItemsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent?.context).inflate(R.layout.category_item_list_item, parent, false)
        return ViewHolder(view, itemClick)
    }

    override fun getItemCount() = items.count()

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.bind(items[position])
    }

    inner class ViewHolder(
            itemView: View?,
            private val itemClick: (CategoryItem) -> Unit
    ) : RecyclerView.ViewHolder(itemView) {
        fun bind(item: CategoryItem) {
            val resourceId = ImageHelper.getImageFromName(
                    context,
                    item.image
            )
            itemView?.categoryItemImage?.setImageResource(resourceId)
            itemView.setOnClickListener { itemClick(item) }
        }
    }
}