package me.phucpt.collections

import javax.sound.midi.Receiver

data class Recipe(var name: String)

fun main() {
    var mShoppingList = mutableListOf("Tea", "Eggs", "Milk")
    println("mShoppingList original: $mShoppingList")
    val extraShopping = listOf("Cookies", "Sugar", "Eggs")
    mShoppingList.addAll(extraShopping)
    println("mShoppingList items added: $mShoppingList")
    if (mShoppingList.contains("Tea")) {
        mShoppingList.set(mShoppingList.indexOf("Tea"), "Coffee")
    }
    mShoppingList.sort()
    println("mShoppingList sorted: $mShoppingList")
    mShoppingList.reverse()
    println("mShoppingList reversed: $mShoppingList")
    println("=========================================")
    val mShoppingSet = mShoppingList.toMutableSet()
    println("mShoppingSet: $mShoppingSet")

    val moreShopping = setOf("Chives", "Spinach", "Milk")
    mShoppingSet.addAll(moreShopping)
    println("mShoppingSet items added: $mShoppingSet")

    mShoppingList = mShoppingSet.toMutableList()
    println("mShoppingList new version: $mShoppingList")

    val shoppingArray = mShoppingSet.toTypedArray()
    for (item in shoppingArray) {
        println(item)
    }
    val petsNoah = listOf("Dog", "Dove", "Dog", "Dove")
    println(petsNoah.toSet().size)

    val r1 = Recipe("Chicken Soup")
    val r2 = Recipe("Quinoa Salad")
    val r3 = Recipe("Thai Curry")
    val r4 = Recipe("Jambalaya")
    val r5 = Recipe("Sausage Rolls")

    val mRecipeMap = mutableMapOf("Recipe1" to r1, "Recipe2" to r2,"Recipe3" to r3)
    println("mRecipeMap origin: $mRecipeMap")

    val recipeToAdd = mapOf("Recipe4" to r4, "Recipe5" to r5)

    mRecipeMap.putAll(recipeToAdd)
    println("mRecipeMap updated: $mRecipeMap")
    if (mRecipeMap.containsKey("Recipe1")) {
        println("Recipe1 is: ${mRecipeMap.getValue("Recipe1")}")
    }

    val recipeList: MutableList<Recipe>

    recipeList = mutableListOf(r1, r2, r3, r4)

    println(recipeList)

}
