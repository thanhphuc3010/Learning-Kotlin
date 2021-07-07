package me.phucpt.lesson02

import java.lang.Math.PI

open class Aquarium(open var height: Double = 100.0, open var width: Double = 20.0, open var length: Double = 40.0) {
    open val shape  = "rectangle"
    open val water
        get() = volume * 0.9

    fun printSize() {
        println("Width: $width cm " +
                "Height: $height cm " +
                "Length: $length cm ")
        println("Volume: $volume l Water: $water l (${water/volume*100.0}% full)")
    }

    open var volume: Double
        get() = width * height * length / 1000
        set(value) {
            height = (value * 1000) / (width * length)
        }

    init {
        println("Aquarium initializing")
    }

    constructor(numberOfFish: Int): this() {
        val tank = numberOfFish * 2000 * 1.1
        height = (tank / (length * width)).toDouble()
    }
}

class TowerTank(override var height: Double, var diameter: Double): Aquarium(height = height, width = diameter, length = diameter){
    override var volume: Double
        get() = (width/2 * length/2 * height / 1000 * PI).toDouble()
        set(value) {
            height = ((value * 1000 / PI) / (width/2 * length/2)).toDouble()
        }

    override var water = volume * 0.8
    override val shape = "cylinder"


}

