package oop_00000114797_BryanValleryanAlvonso.week08

fun main() {
    println("=== TEST SAFE CALL & ELVIS ===")
    val emptyOrder = Order(null, null)

    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kota Tidak Diketahui"
    println("Tujuan pengiriman: $destination")
}