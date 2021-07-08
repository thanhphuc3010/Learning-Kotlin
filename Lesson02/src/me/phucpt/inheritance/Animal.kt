package me.phucpt.inheritance

// Interface declare
interface Roamable {
    fun roam()
}

abstract class Animal : Roamable {
    abstract val image: String
    abstract val food: String
    abstract val habitat: String
    var hunger: Int = 10

    abstract fun makeNoise()

    abstract fun eat()

    override fun roam() {
        println("The Animal is roaming")
    }

    fun sleep() {
        println("The Animal is sleeping")
    }
}

class Hippo : Animal() {
    override val image = "hippo.jpg"
    override val food = "grass"
    override val habitat = "water"

    override fun makeNoise() {
        println("Grunt! Grunt!")
    }

    override fun eat() {
        println("The Hippo is eating $food")
    }
}

abstract class Canine : Animal() {
    override fun roam() {
        println("The canine is roaming")
    }
}


class Wolf : Canine() {
    override val image = "wolf.jpg"
    override val food = "meat"
    override val habitat = "forest"

    override fun makeNoise() {
        println("Hooooowl")
    }

    override fun eat() {
        println("The wolf is eating $food")
    }
}

class Vehicle : Roamable {
    override fun roam() {
        println("The Vehicle is roaming")
    }
}

class Vet {
    fun giveShot(animal: Animal) {
        animal.makeNoise()
    }
}

//class MyRoamable() {
//    var r: Roamable = Wolf()
//
//    fun myFunction() {
//        if (r is Wolf) {
//            r.eat()
//        }
//    }
//}

class MyWolf {
    var w: Wolf? = Wolf()

    fun myFunction() {
        w?.eat() // Only call Wolf's eat function when w is not null
        println(w?.hunger)
        w?.let {
            println(it.hunger)
        }

        var a = w?.hunger ?: -1
    }

}

fun main() {
    val animals = arrayOf(Hippo(), Wolf())
    for (animal in animals) {
        animal.roam()
        animal.eat()
    }

    val vet = Vet()
    val wolf = Wolf()
    val hippo = Hippo()
    vet.giveShot(wolf)
    vet.giveShot(hippo)

    val roamables = arrayOf(Hippo(), Wolf(), Vehicle())
    for (item in roamables) {
        item.roam()
        if (item is Animal) {
            item.eat()
        }
    }

    println(wolf.habitat)

    var w: Wolf? = Wolf()
    if (w != null) {
        w.eat() // Smart cast normally
    }

    val myArray = arrayOf("Hi", "Hello", null)
    for (item in myArray) {
        item?.let {
            println(it)
        }
    }

}

