package oop_00000114797_BryanValleryanAlvonso.week01

fun main() {
    val radius = 7.0
    val pi = 3.14

    var area = pi * radius * radius

    println("Radius: $radius, Area: $pi")

    println("${checkSize(area)}")
}
fun checkSize(area: Double) = if (area > 100) "This is a Big Circle" else "This is a Small Circle"