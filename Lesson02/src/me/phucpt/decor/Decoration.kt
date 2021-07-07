package me.phucpt.decor

import java.sql.Driver

data class Decoration(val rocks: String, val wood: String, val diver: String) {
    companion object {
        fun likeStaticInJava() {
            println("Factory function in Kotlin like static methods in Java")
        }
    }
}

fun makeDecoration() {
//    val decoration1 = Decoration("granite")
//    println(decoration1)
//
//    val decoration2 = Decoration("slate")
//    println(decoration2)
//
//    val decoration3 = Decoration("slate")
//    println(decoration3)
//
//    println(decoration1.equals(decoration2))
//    println(decoration3.equals(decoration2))

    val decoration4 = Decoration("crytal", "wood", "diver")
    println(decoration4)

    val (rock, _, diver) = decoration4
    println(rock)
    println(diver)
}

enum class Color(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF)
}

enum class Direction(val degrees: Int) {
    NORTH(0), SOUTH(180), EAST(90), WEST(270)
}

open class AquariumPlant(val color: String, private val size: Int)

class GreenLeafyPlant(size: Int) : AquariumPlant("green", size)

fun AquariumPlant.print() = println("AquariumPlant")
fun GreenLeafyPlant.print() = println("GreenLeafyPlant")


fun main() {
    val plant = GreenLeafyPlant(10)
    plant.print()
    println("\n")
    val aquariumPlant: AquariumPlant = plant
    aquariumPlant.print()

    println(Direction.SOUTH.name)
    println(Direction.SOUTH.ordinal)
    println(Direction.SOUTH.degrees)
    Decoration.likeStaticInJava()

    val list2 = listOf("abc", "phuc", "hoan")

    for (item in list2.listIterator()) {
        println("$item ")
    }

    val cures = hashMapOf("white spots" to "Ich", "red sores" to "hole disease")

    println(cures["white spots"])

    println(cures.get("red sores"))

    println(cures["phuc"])

    println(cures.getOrDefault("bloating", "Sorry, I don't know"))

    val inventory = mutableMapOf("fish net" to 1)
    inventory["tank scrubber"] = 3
    println(inventory.toString())
    inventory.remove("fish net")
    println(inventory.toString())

    fun String.hasSpace() : Boolean {
        val found = this.find { it == ' ' }
        return found != null
    }

    println("Pham Thanh Phuc".hasSpace())
}


