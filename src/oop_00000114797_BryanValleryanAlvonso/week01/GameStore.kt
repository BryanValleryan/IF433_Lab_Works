package oop_00000114797_BryanValleryanAlvonso.week01

fun main() {
    val gameTitle = "Object Oriented Program"
    val price = 600000
}
fun calculateDiscount(price: Int) = if (price > 500000) price - ((price * 20) / 100) else price - ((price * 10) / 100)