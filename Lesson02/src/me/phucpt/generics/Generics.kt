package me.phucpt.generics

class Student<T> (val data: T) {
    fun showData() {
        println(data)
    }
}

class Duck(val name: String) {

}

fun main() {
    Student("Phúc").showData()
    Student(21).showData()

    val listDuck = listOf(Duck("Donald"), Duck("Daisy"), Duck("Daffy"))
}