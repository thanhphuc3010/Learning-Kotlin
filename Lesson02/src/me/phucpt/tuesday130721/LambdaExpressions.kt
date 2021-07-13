package me.phucpt.tuesday130721

fun main() {
    val lambda = { x: Int, y: Int -> x + y }
    println(lambda.invoke(5, 7))
}