package me.phucpt.lesson01

import java.net.Inet4Address
import java.util.*
import kotlin.math.sqrt
import kotlin.text.toInt as toInt1

fun main() {
    val PI = 3.14159265359

    println("Hello!")
    println(PI)

    val isKotlinFun: Boolean = true;
    val isFishTasty: Boolean = false;

    fun sum(a: Int, b: Int): Int {
        return a + b;
    }

    fun mySum(a: Int, b: Int) = a + b

    println(sum(4, 5))
    println(mySum(5, 4))

    // Giải phương trình bậc 2
    fun solveQuadraticEquation(a: Float, b: Float, c: Float) {
        println("Your Quadratic Equation: ${a}x^2 + ${b}x + ${c} = 0")
        if (a == 0F) {
            println("Equation with solution: " + (-c / b))
        }
        else {
            val delta = b * b - 4 * a * c
            if (delta < 0) {
                println("The equation has no solution")
            } else if (delta == 0F){
                val answer = -b / 2 * a
                println("Equation has double solution: $answer")
            } else {
                val answer1 = (-b + sqrt(delta)) / (2 * a)
                val answer2 = (-b - sqrt(delta)) / (2 * a)
                println("Equation has solution: $answer1 and $answer2")
            }
        }
    }

    solveQuadraticEquation(1F, -4F,4F)

    fun isPrime(n: Int): Boolean {
        if (n < 2) {
            return false
        } else {
            for (num in 2..n / 2) {
                if (n % num == 0) return false
            }
            return true
        }
    }

    println("phuc")

    var total = 0
    var number = 45672

    println(number)
    println(total)
    while (number != 0) {
        total += number % 10
        number += number / 10
    }



//    println("Enter n: ")
//    //    val sc = Scanner(System.`in`)
//    //    n = sc.nextInt()
//    var n: Int = Integer.valueOf(readLine())
//    for (num in 0..n) {
//        if(isPrime(num)) {
//            print("$num ")
//        }
//    }
//
//    println("Enter a:")
//    val a: Int = Integer.valueOf(readLine())
//
//    println("Enter b:")
//    val b: Int = Integer.valueOf(readLine())
//
//    println("Enter c:")
//    val c: Int = Integer.valueOf(readLine())

//    var maxNumber = a
//
//    if(b > maxNumber) maxNumber = b
//    if(c > maxNumber) maxNumber = c
//
//    println(maxNumber)




//    class Car(var brand: String, var model: String, var year: Int)
//
//    val fordMustang = Car("Ford", "Mustang", 1969)
//    val bmw = Car("BMW", "X5", 1999)
//
//
//    println(fordMustang.brand)
//    println(bmw.brand)




}

