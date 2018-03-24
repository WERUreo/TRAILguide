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
            CategoryItem(
                    name = "Backpack",
                    image = "backpack",
                    description = "This is my backpack.\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque et egestas justo. Pellentesque pretium ac mi ut ultrices. Donec ante orci, pharetra eu ipsum vitae, consequat commodo leo. Proin tellus dolor, rhoncus a mauris eget, vestibulum imperdiet leo. Etiam porta."
            ),
            CategoryItem(
                    name = "Boots",
                    image = "boots",
                    description = "These are some boots.\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque et egestas justo. Pellentesque pretium ac mi ut ultrices. Donec ante orci, pharetra eu ipsum vitae, consequat commodo leo. Proin tellus dolor, rhoncus a mauris eget, vestibulum imperdiet leo. Etiam porta."
            ),
            CategoryItem(
                    name = "Compass",
                    image = "compass",
                    description = "You know what a compass is, right?\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque et egestas justo. Pellentesque pretium ac mi ut ultrices. Donec ante orci, pharetra eu ipsum vitae, consequat commodo leo. Proin tellus dolor, rhoncus a mauris eget, vestibulum imperdiet leo. Etiam porta."
            ),
            CategoryItem(
                    name = "Map",
                    image = "map",
                    description = "Well, let's hit up Yahoo! Maps to find the dopest route.  I prefer MapQuest; that's a good one, too.  Google Maps is the best; true that; double true!\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque et egestas justo. Pellentesque pretium ac mi ut ultrices. Donec ante orci, pharetra eu ipsum vitae, consequat commodo leo. Proin tellus dolor, rhoncus a mauris eget, vestibulum imperdiet leo. Etiam porta."
            ),
            CategoryItem(
                    name = "Rope",
                    image = "rope",
                    description = "When you reach the end of your rope, tie a knot in it and hang on.\n\nFranklin D. Roosevelt\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque et egestas justo. Pellentesque pretium ac mi ut ultrices. Donec ante orci, pharetra eu ipsum vitae, consequat commodo leo. Proin tellus dolor, rhoncus a mauris eget, vestibulum imperdiet leo. Etiam porta."
            )
    )

    val camping: List<CategoryItem> = listOf(
            CategoryItem(
                    name = "Backpack",
                    image = "backpack",
                    description = "This is my backpack.\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque et egestas justo. Pellentesque pretium ac mi ut ultrices. Donec ante orci, pharetra eu ipsum vitae, consequat commodo leo. Proin tellus dolor, rhoncus a mauris eget, vestibulum imperdiet leo. Etiam porta."
            ),
            CategoryItem(
                    name = "Boots",
                    image = "boots",
                    description = "These are some boots.\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque et egestas justo. Pellentesque pretium ac mi ut ultrices. Donec ante orci, pharetra eu ipsum vitae, consequat commodo leo. Proin tellus dolor, rhoncus a mauris eget, vestibulum imperdiet leo. Etiam porta."
            ),
            CategoryItem(
                    name = "Compass",
                    image = "compass",
                    description = "You know what a compass is, right?\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque et egestas justo. Pellentesque pretium ac mi ut ultrices. Donec ante orci, pharetra eu ipsum vitae, consequat commodo leo. Proin tellus dolor, rhoncus a mauris eget, vestibulum imperdiet leo. Etiam porta."
            ),
            CategoryItem(
                    name = "Flashlight",
                    image = "flashlight",
                    description = "Flashlight!  Neon light!\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque et egestas justo. Pellentesque pretium ac mi ut ultrices. Donec ante orci, pharetra eu ipsum vitae, consequat commodo leo. Proin tellus dolor, rhoncus a mauris eget, vestibulum imperdiet leo. Etiam porta."
            ),
            CategoryItem(
                    name = "Grill",
                    image = "grill",
                    description = "A grill is just a source of heat.  Just like a stove, it is very user-friendly.\n\nBobby Flay\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque et egestas justo. Pellentesque pretium ac mi ut ultrices. Donec ante orci, pharetra eu ipsum vitae, consequat commodo leo. Proin tellus dolor, rhoncus a mauris eget, vestibulum imperdiet leo. Etiam porta."
            ),
            CategoryItem(
                    name = "Map",
                    image = "map",
                    description = "Well, let's hit up Yahoo! Maps to find the dopest route.  I prefer MapQuest; that's a good one, too.  Google Maps is the best; true that; double true!\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque et egestas justo. Pellentesque pretium ac mi ut ultrices. Donec ante orci, pharetra eu ipsum vitae, consequat commodo leo. Proin tellus dolor, rhoncus a mauris eget, vestibulum imperdiet leo. Etiam porta."
            ),
            CategoryItem(
                    name = "Rope",
                    image = "rope",
                    description = "When you reach the end of your rope, tie a knot in it and hang on.\n\nFranklin D. Roosevelt\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque et egestas justo. Pellentesque pretium ac mi ut ultrices. Donec ante orci, pharetra eu ipsum vitae, consequat commodo leo. Proin tellus dolor, rhoncus a mauris eget, vestibulum imperdiet leo. Etiam porta."
            ),
            CategoryItem(
                    name = "Tent",
                    image = "tent",
                    description = "This is a tent.\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque et egestas justo. Pellentesque pretium ac mi ut ultrices. Donec ante orci, pharetra eu ipsum vitae, consequat commodo leo. Proin tellus dolor, rhoncus a mauris eget, vestibulum imperdiet leo. Etiam porta."
            ),
            CategoryItem(
                    name = "Tools",
                    image = "tools",
                    description = "These are tools.\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque et egestas justo. Pellentesque pretium ac mi ut ultrices. Donec ante orci, pharetra eu ipsum vitae, consequat commodo leo. Proin tellus dolor, rhoncus a mauris eget, vestibulum imperdiet leo. Etiam porta."
            )
    )

    val diving: List<CategoryItem> = listOf(
            CategoryItem(
                    name = "Flippers",
                    image = "flippers",
                    description = "These are flippers.\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque et egestas justo. Pellentesque pretium ac mi ut ultrices. Donec ante orci, pharetra eu ipsum vitae, consequat commodo leo. Proin tellus dolor, rhoncus a mauris eget, vestibulum imperdiet leo. Etiam porta."
            ),
            CategoryItem(
                    name = "Knife",
                    image = "knife",
                    description = "I want the knife..... Please....\n\nThe Golden Child\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque et egestas justo. Pellentesque pretium ac mi ut ultrices. Donec ante orci, pharetra eu ipsum vitae, consequat commodo leo. Proin tellus dolor, rhoncus a mauris eget, vestibulum imperdiet leo. Etiam porta."
            ),
            CategoryItem(
                    name = "Mask",
                    image = "mask",
                    description = "M-M-M-M.A.S.K.!!  is the mighty power that can save the day!\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque et egestas justo. Pellentesque pretium ac mi ut ultrices. Donec ante orci, pharetra eu ipsum vitae, consequat commodo leo. Proin tellus dolor, rhoncus a mauris eget, vestibulum imperdiet leo. Etiam porta."
            ),
            CategoryItem(
                    name = "Oxygen",
                    image = "ox",
                    description = "Singing is like a celebration of oxygen.\n\nBjork\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque et egestas justo. Pellentesque pretium ac mi ut ultrices. Donec ante orci, pharetra eu ipsum vitae, consequat commodo leo. Proin tellus dolor, rhoncus a mauris eget, vestibulum imperdiet leo. Etiam porta."
            ),
            CategoryItem(
                    name = "Oxygen and Flippers",
                    image = "ox_flippers",
                    description = "Oxygen and flippers...\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque et egestas justo. Pellentesque pretium ac mi ut ultrices. Donec ante orci, pharetra eu ipsum vitae, consequat commodo leo. Proin tellus dolor, rhoncus a mauris eget, vestibulum imperdiet leo. Etiam porta."
            ),
            CategoryItem(
                    name = "Oxygen and Mask",
                    image = "ox_mask",
                    description = "Oxygen and mask...\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque et egestas justo. Pellentesque pretium ac mi ut ultrices. Donec ante orci, pharetra eu ipsum vitae, consequat commodo leo. Proin tellus dolor, rhoncus a mauris eget, vestibulum imperdiet leo. Etiam porta."
            )
    )

    val surfing: List<CategoryItem> = listOf()

    val fishing: List<CategoryItem> = listOf(
            CategoryItem(
                    name = "Fishing Rod",
                    image = "fishing_rod",
                    description = "Fishing rod.\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque et egestas justo. Pellentesque pretium ac mi ut ultrices. Donec ante orci, pharetra eu ipsum vitae, consequat commodo leo. Proin tellus dolor, rhoncus a mauris eget, vestibulum imperdiet leo. Etiam porta."
            ),
            CategoryItem(
                    name = "Hook",
                    image = "hook",
                    description = "Because the hook brings you back.\n\nBlues Traveler\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque et egestas justo. Pellentesque pretium ac mi ut ultrices. Donec ante orci, pharetra eu ipsum vitae, consequat commodo leo. Proin tellus dolor, rhoncus a mauris eget, vestibulum imperdiet leo. Etiam porta."
            ),
            CategoryItem(
                    name = "Knife",
                    image = "knife",
                    description = "I want the knife..... Please....\n\nThe Golden Child\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque et egestas justo. Pellentesque pretium ac mi ut ultrices. Donec ante orci, pharetra eu ipsum vitae, consequat commodo leo. Proin tellus dolor, rhoncus a mauris eget, vestibulum imperdiet leo. Etiam porta."
            ),
            CategoryItem(
                    name = "Lure",
                    image = "lure",
                    description = "Lure.\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque et egestas justo. Pellentesque pretium ac mi ut ultrices. Donec ante orci, pharetra eu ipsum vitae, consequat commodo leo. Proin tellus dolor, rhoncus a mauris eget, vestibulum imperdiet leo. Etiam porta."
            )
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