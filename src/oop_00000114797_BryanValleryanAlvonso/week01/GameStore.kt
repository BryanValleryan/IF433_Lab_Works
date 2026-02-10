package oop_00000114797_BryanValleryanAlvonso.week01

fun main() {
    val gameTitle = "Object Oriented Programming"
    val price = 600000

    printReceipt(title = gameTitle, finalPrice = calculateDiscount(price))
}
fun calculateDiscount(price: Int) = if (price > 500000) price - ((price * 20) / 100) else price - ((price * 10) / 100)

fun printReceipt(title: String, finalPrice: Int) {
    println ("Title: $title, Final Price: $finalPrice")
}