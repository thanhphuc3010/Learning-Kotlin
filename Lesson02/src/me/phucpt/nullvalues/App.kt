package me.phucpt.nullvalues

import java.lang.NullPointerException
import java.lang.NumberFormatException

class Wolf {
    var hunger = 10
    val food = "meat"

    fun eat() {
        println("The Wolf is eating $food")
    }
}

class MyWolf {
    var wolf: Wolf? = Wolf()

    fun myFunction() {
        wolf?.eat()
    }
}

fun getAlphaWolf() : Wolf? {
    return Wolf()
}

fun main() {
    var w: Wolf? = Wolf()

    if (w != null) {
        w.eat()
    }

    var x = w?.hunger
    println("The value of x is $x")

    var y = w?.hunger ?: -1
    println("The value of y is $y")

    var myWolf: MyWolf? = MyWolf()
    myWolf?.wolf?.hunger = 8

    println("The value of myWolf?.wolf?.hunger is ${myWolf?.wolf?.hunger}")

    myWolf = null

    var myArray = arrayOf("Hi", "Hello", null)
    for (item in myArray) {
        item?.let {
            println(it)
        }
    }

    getAlphaWolf()?.let { it.eat() }

    var array = arrayOf(1, 3, 2)
    val nullArray: Array<String?> = arrayOfNulls(2)
    for (item in nullArray) {
        println(item)
    }
    array.sort()

    array.reverse()

    println(array.contains(100))

    val shopping = listOf("Tea", "Eggs", "Milk", null)

    val mShopping = mutableListOf("Tea", "Eggs")

    mShopping.add(1, "Milk")

    val toAdd = listOf("Cookies", "Sugar")

    mShopping.addAll(toAdd)

//    val toRemove = listOf("Milk", "Eggs")
//
//    mShopping.removeAll(toRemove)

//    val toRetain = listOf("Cookies", "Sugar")
//
//    mShopping.retainAll(toRetain)

//    if (mShopping.isNotEmpty()) {
//        mShopping[0] = "Coffee"
//    }

    val shoppingCopy = mShopping.toMutableList()


    for (item in mShopping) {
        println(item)
    }

    for (item in shoppingCopy) {
        println(item)
    }

    println(mShopping.any())




}