package com.werureo.trailguide.services

import com.werureo.trailguide.models.Category
import com.werureo.trailguide.models.CategoryItem


object DataService {

    // category items
    private val backpackItem = CategoryItem(
            name = "Backpack",
            image = "backpack",
            description = "This is my backpack.\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque et egestas justo. Pellentesque pretium ac mi ut ultrices. Donec ante orci, pharetra eu ipsum vitae, consequat commodo leo. Proin tellus dolor, rhoncus a mauris eget, vestibulum imperdiet leo. Etiam porta."
    )

    private val bootsItem = CategoryItem(
            name = "Boots",
            image = "boots",
            description = "These are some boots.\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque et egestas justo. Pellentesque pretium ac mi ut ultrices. Donec ante orci, pharetra eu ipsum vitae, consequat commodo leo. Proin tellus dolor, rhoncus a mauris eget, vestibulum imperdiet leo. Etiam porta."
    )

    private val compassItem = CategoryItem(
            name = "Compass",
            image = "compass",
            description = "You know what a compass is, right?\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque et egestas justo. Pellentesque pretium ac mi ut ultrices. Donec ante orci, pharetra eu ipsum vitae, consequat commodo leo. Proin tellus dolor, rhoncus a mauris eget, vestibulum imperdiet leo. Etiam porta."
    )

    private val mapItem = CategoryItem(
            name = "Map",
            image = "map",
            description = "Well, let's hit up Yahoo! Maps to find the dopest route.  I prefer MapQuest; that's a good one, too.  Google Maps is the best; true that; double true!\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque et egestas justo. Pellentesque pretium ac mi ut ultrices. Donec ante orci, pharetra eu ipsum vitae, consequat commodo leo. Proin tellus dolor, rhoncus a mauris eget, vestibulum imperdiet leo. Etiam porta."
    )

    private val ropeItem = CategoryItem(
            name = "Rope",
            image = "rope",
            description = "When you reach the end of your rope, tie a knot in it and hang on.\n\nFranklin D. Roosevelt\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque et egestas justo. Pellentesque pretium ac mi ut ultrices. Donec ante orci, pharetra eu ipsum vitae, consequat commodo leo. Proin tellus dolor, rhoncus a mauris eget, vestibulum imperdiet leo. Etiam porta."
    )

    private val flashlightItem = CategoryItem(
            name = "Flashlight",
            image = "flashlight",
            description = "Flashlight!  Neon light!\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque et egestas justo. Pellentesque pretium ac mi ut ultrices. Donec ante orci, pharetra eu ipsum vitae, consequat commodo leo. Proin tellus dolor, rhoncus a mauris eget, vestibulum imperdiet leo. Etiam porta."
    )

    private val grillItem = CategoryItem(
            name = "Grill",
            image = "grill",
            description = "A grill is just a source of heat.  Just like a stove, it is very user-friendly.\n\nBobby Flay\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque et egestas justo. Pellentesque pretium ac mi ut ultrices. Donec ante orci, pharetra eu ipsum vitae, consequat commodo leo. Proin tellus dolor, rhoncus a mauris eget, vestibulum imperdiet leo. Etiam porta."
    )

    private val tentItem = CategoryItem(
            name = "Tent",
            image = "tent",
            description = "This is a tent.\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque et egestas justo. Pellentesque pretium ac mi ut ultrices. Donec ante orci, pharetra eu ipsum vitae, consequat commodo leo. Proin tellus dolor, rhoncus a mauris eget, vestibulum imperdiet leo. Etiam porta."
    )

    private val toolsItem = CategoryItem(
            name = "Tools",
            image = "tools",
            description = "These are tools.\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque et egestas justo. Pellentesque pretium ac mi ut ultrices. Donec ante orci, pharetra eu ipsum vitae, consequat commodo leo. Proin tellus dolor, rhoncus a mauris eget, vestibulum imperdiet leo. Etiam porta."
    )

    private val flippersItem = CategoryItem(
            name = "Flippers",
            image = "flippers",
            description = "These are flippers.\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque et egestas justo. Pellentesque pretium ac mi ut ultrices. Donec ante orci, pharetra eu ipsum vitae, consequat commodo leo. Proin tellus dolor, rhoncus a mauris eget, vestibulum imperdiet leo. Etiam porta."
    )

    private val knifeItem = CategoryItem(
            name = "Knife",
            image = "knife",
            description = "I want the knife..... Please....\n\nThe Golden Child\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque et egestas justo. Pellentesque pretium ac mi ut ultrices. Donec ante orci, pharetra eu ipsum vitae, consequat commodo leo. Proin tellus dolor, rhoncus a mauris eget, vestibulum imperdiet leo. Etiam porta."
    )

    private val maskItem = CategoryItem(
            name = "Mask",
            image = "mask",
            description = "M-M-M-M.A.S.K.!!  is the mighty power that can save the day!\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque et egestas justo. Pellentesque pretium ac mi ut ultrices. Donec ante orci, pharetra eu ipsum vitae, consequat commodo leo. Proin tellus dolor, rhoncus a mauris eget, vestibulum imperdiet leo. Etiam porta."
    )

    private val oxygenItem = CategoryItem(
            name = "Oxygen",
            image = "ox",
            description = "Singing is like a celebration of oxygen.\n\nBjork\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque et egestas justo. Pellentesque pretium ac mi ut ultrices. Donec ante orci, pharetra eu ipsum vitae, consequat commodo leo. Proin tellus dolor, rhoncus a mauris eget, vestibulum imperdiet leo. Etiam porta."
    )

    private val oxygenFlippersItem = CategoryItem(
            name = "Oxygen and Flippers",
            image = "ox_flippers",
            description = "Oxygen and flippers...\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque et egestas justo. Pellentesque pretium ac mi ut ultrices. Donec ante orci, pharetra eu ipsum vitae, consequat commodo leo. Proin tellus dolor, rhoncus a mauris eget, vestibulum imperdiet leo. Etiam porta."
    )

    private val oxygenMaskItem = CategoryItem(
            name = "Oxygen and Mask",
            image = "ox_mask",
            description = "Oxygen and mask...\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque et egestas justo. Pellentesque pretium ac mi ut ultrices. Donec ante orci, pharetra eu ipsum vitae, consequat commodo leo. Proin tellus dolor, rhoncus a mauris eget, vestibulum imperdiet leo. Etiam porta."
    )

    private val fishingRodItem = CategoryItem(
            name = "Fishing Rod",
            image = "fishing_rod",
            description = "Fishing rod.\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque et egestas justo. Pellentesque pretium ac mi ut ultrices. Donec ante orci, pharetra eu ipsum vitae, consequat commodo leo. Proin tellus dolor, rhoncus a mauris eget, vestibulum imperdiet leo. Etiam porta."
    )

    private val hookItem = CategoryItem(
            name = "Hook",
            image = "hook",
            description = "Because the hook brings you back.\n\nBlues Traveler\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque et egestas justo. Pellentesque pretium ac mi ut ultrices. Donec ante orci, pharetra eu ipsum vitae, consequat commodo leo. Proin tellus dolor, rhoncus a mauris eget, vestibulum imperdiet leo. Etiam porta."
    )

    private val lureItem = CategoryItem(
            name = "Lure",
            image = "lure",
            description = "Lure.\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque et egestas justo. Pellentesque pretium ac mi ut ultrices. Donec ante orci, pharetra eu ipsum vitae, consequat commodo leo. Proin tellus dolor, rhoncus a mauris eget, vestibulum imperdiet leo. Etiam porta."
    )

    val categories: List<Category> = listOf(
            Category("Hiking", "hiking"),
            Category("Camping", "camping"),
            Category("Diving", "diving"),
            Category("Surfing", "surfing"),
            Category("Fishing", "fishing")
    )

    val hiking: List<CategoryItem> = listOf(
            backpackItem,
            bootsItem,
            compassItem,
            mapItem,
            ropeItem
    )

    val camping: List<CategoryItem> = listOf(
            backpackItem,
            bootsItem,
            compassItem,
            flashlightItem,
            grillItem,
            mapItem,
            ropeItem,
            tentItem,
            toolsItem
    )

    val diving: List<CategoryItem> = listOf(
            flippersItem,
            knifeItem,
            maskItem,
            oxygenItem,
            oxygenFlippersItem,
            oxygenMaskItem
    )

    val surfing: List<CategoryItem> = listOf(
            maskItem
    )

    val fishing: List<CategoryItem> = listOf(
            fishingRodItem,
            hookItem,
            knifeItem,
            lureItem
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