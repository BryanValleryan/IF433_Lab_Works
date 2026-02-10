package oop_00000114797_BryanValleryanAlvonso.week01

fun main(args: Array<String>) {
    // Variable definition
    val radius = 7.0
    val pi = 3.14
    // Calculation
    var area = pi * radius * radius
    // Output Concatenation
    println("Radius: $radius, Area: $pi")
    // Logic check
    checkSize(area)
}
fun checkSize(area: Double) {
    if (area > 100) {
        println("This is a Big Circle")
    } else {
        println("This is a Small Circle")
    }
}