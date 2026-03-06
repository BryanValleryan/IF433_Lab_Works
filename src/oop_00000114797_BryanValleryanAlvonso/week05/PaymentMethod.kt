package oop_00000114797_BryanValleryanAlvonso.week05

abstract class PaymentMethod(
    val accountName: String
) {
    abstract fun processPayment(amount: Double)
}
