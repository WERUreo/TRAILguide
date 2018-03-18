package com.werureo.trailguide.services

import com.werureo.trailguide.models.Category
import com.werureo.trailguide.models.CategoryItem


object DataService {

    val categories: List<Category> = listOf(
            Category("Hiking", "hiking"),
            Category("Camping", "camping"),
            Category("Diving", "diving"),
            Category("Surfing", "surfing"),
            Category("Fishing", "fishing")
    )

    val hiking: List<CategoryItem> = listOf(
            CategoryItem("Backpack", "backpack"),
            CategoryItem("Boots", "boots"),
            CategoryItem("Compass", "compass"),
            CategoryItem("Map", "map"),
            CategoryItem("Rope", "rope")
    )

    val camping: List<CategoryItem> = listOf(
            CategoryItem("Backpack", "backpack"),
            CategoryItem("Boots", "boots"),
            CategoryItem("Compass", "compass"),
            CategoryItem("Flashlight", "flashlight"),
            CategoryItem("Grill", "grill"),
            CategoryItem("Map", "map"),
            CategoryItem("Rope", "rope"),
            CategoryItem("Tent", "tent"),
            CategoryItem("Tools", "tools")
    )

    val diving: List<CategoryItem> = listOf(
            CategoryItem("Flippers", "flippers"),
            CategoryItem("Knife", "knife"),
            CategoryItem("Mask", "mask"),
            CategoryItem("Oxygen", "ox"),
            CategoryItem("Oxygen and Flippers", "ox_flippers"),
            CategoryItem("Oxygen and Mask", "ox_mask")
    )

    val surfing: List<CategoryItem> = listOf()

    val fishing: List<CategoryItem> = listOf(
            CategoryItem("Fishing Rod", "fishing_rod"),
            CategoryItem("Hook", "hook"),
            CategoryItem("Knife", "knife"),
            CategoryItem("Lure", "lure")
    )

    fun getCategoryItems(categoryType: String): List<CategoryItem> {
        return when (categoryType) {
            "Hiking" -> hiking
            "Camping" -> camping
            "Diving" -> diving
            "Surfing" -> surfing
            "Fishing" -> fishing
            else -> hiking
        }
    }
}