package me.phucpt.lesson02
fun buildAquarium() {
    val myAquarium = Aquarium(25.0, 25.0, 40.0)
    myAquarium.printSize()

    val myTower = TowerTank(40.0, 25.0)
    myTower.printSize()
}

fun makeFish() {
    val myShark = Shark()
    val myPlecostomus = Plecostomus(GreyColor)
    println("Shark: ${myShark.color}")
    myShark.eat()
    println("Plecostomus: ${myPlecostomus.color}")
    myPlecostomus.eat()
}

fun main() {
    buildAquarium()
    makeFish()
    val Aquarium = Aquarium(120.2, 25.5, 40.0)
    Aquarium.volume = 123.0
}


