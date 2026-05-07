package oop_00000114797_BryanValleryanAlvonso.week10

fun main() {
    println("=== TEST GENERIC CLASS ===")
    val intBox = Box(100)
    val stringBox = Box("Generic in kotlin")

    println("Isi intBox: ${intBox.value}")
    println("Isi stringBox: ${stringBox.value}")
}
