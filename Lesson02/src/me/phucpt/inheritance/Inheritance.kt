package me.phucpt.inheritance

open class Inheritance(p: Int, h: Int, u: Double)

class SubClass : Inheritance {
    constructor(p: Int) : super(p = 10, h = 20, u = 100.0)
}


open class Shape {
    open val vertexCount: Int = 0
    open fun draw() {
        // To do
    }

    fun fill() {}
}

class Circle() : Shape() {
    override val vertexCount = 4
    override fun draw() {

    }
}