package me.phucpt.wed140721

data class Grocery(val name: String, val category: String,
                   val unit: String, val unitPrice: Double,
                   val quantity: Int)

fun main() {
    val groceries = listOf( Grocery("Tomatoes", "Vegetable", "lb", 3.0, 3),
                            Grocery("Mushrooms", "Vegetable", "lb", 4.0, 1),
                            Grocery("Bagels", "Bakery", "Pack", 1.5, 2),
                            Grocery("Olive oil", "Pantry", "Bottle", 6.0, 1),
                            Grocery("Ice cream", "Frozen", "Pack", 3.0, 2))

    val emptyGrocery = listOf<Grocery>()

    val highestUnitPrice = groceries.maxByOrNull { it.unitPrice }

    val sumQuantity = groceries.sumOf { it.quantity }

    val totalPrice = groceries.sumOf { it.quantity * it.unitPrice }

    println(highestUnitPrice)

    println(emptyGrocery.maxByOrNull { it.unitPrice })

    println(totalPrice)

    val groceriesMap = mapOf("item1" to Grocery("Tomatoes", "Vegetable", "lb", 3.0, 3),
                            "item2" to Grocery("Mushrooms", "Vegetable", "lb", 4.0, 1))

    val sumMap = groceriesMap.values.sumOf { it.unitPrice }

    println(sumMap)
}