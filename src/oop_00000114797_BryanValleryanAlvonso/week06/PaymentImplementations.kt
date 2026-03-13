package oop_00000114797_BryanValleryanAlvonso.week06

class Gopay: PaymentMethod {
    override fun pay(amount: Double) {println("Processing Rp$amount via Gopay server")}
}

class CreditCard: PaymentMethod {
    override fun pay(amount: Double) { println("Contacting bank for Rp$amount") }
}