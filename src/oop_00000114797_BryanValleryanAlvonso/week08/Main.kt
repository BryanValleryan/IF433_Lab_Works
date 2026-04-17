package oop_00000114797_BryanValleryanAlvonso.week08

fun main() {
    println("=== TEST SAFE CALL & ELVIS ===")
    val emptyOrder = Order(null, null)

    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kota Tidak Diketahui"
    println("Tujuan pengiriman: $destination")

    println("\n==== TEST LET BLOCK ===")
    val validOrder = Order(null, 250000)

    val receipt = validOrder.totalPrice?.let { price ->
        val tax = price * 0.11
        "Transaksi valid. Harga: Rp$price, pajak: Rp$tax"
    } ?: "Transaksi invalid: Harga belum di-set!"

    println(receipt)
}