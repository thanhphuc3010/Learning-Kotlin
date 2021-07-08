package me.phucpt.recipes

data class Recipe(val title: String, val isVegetarian: Boolean) {
    var mainIngredient = ""

//    fun findRecipes(title: String = "",
//                    isVegetarian: Boolean = false) : Array<Recipe> {
//    }
}

fun main() {
    val r1 = Recipe("Thai Curry", false)
    r1.mainIngredient = "Chicken"
    val r2 = Recipe("Thai Curry", false)
    r2.mainIngredient = "Duck"

    println(r1 == r2)


    val r3 = r1.copy(title = "Chicken Bhuna")
    println("r1 hash code: ${r1.hashCode()}")
    println("r2 hash code: ${r2.hashCode()}")
    println("r3 hash code: ${r3.hashCode()}")

    println("r1 toString; ${r1.toString()}")

    println("r1 == r2? ${r1 == r2}")
    println("r1 === r2? ${r1 === r2}")
    println("r1 == r3? ${r1 == r3}")

    val (title, isVegetarian) = r1
    println("title is $title and vegetarian is $isVegetarian")

    var str: String? = "Pizza"
    println(str)
    str = null
    println(str)

    var myArray = arrayOf("Hi", "Hello", null)
    for (item in myArray) {
        println(item)
    }


}