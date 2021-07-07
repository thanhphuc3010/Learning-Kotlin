package me.phucpt.lesson02

/*abstract class AquariumFish {
    abstract val color: String
}*/

interface FishColor {
    val color: String
}

interface FishAction {
    fun eat()
}

class Shark : FishAction, FishColor {
    override val color = "grey"
    override fun eat() {
        println("hunt and eat other fish")
    }
}

class Plecostomus(fishColor: FishColor = GoldColor) : FishAction  by PrintingFishAction("eat algae"), FishColor by fishColor

object GoldColor : FishColor {
    override val color = "gold"
}

object GreyColor : FishColor {
    override val color = "grey"
}

class PrintingFishAction(val food: String) : FishAction {
    override fun eat() {
        println(food)
    }
}

