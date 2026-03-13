package oop_00000114797_BryanValleryanAlvonso.week06

fun processCheckout(method: PaymentMethod, amount: Double) {
    println("-> memulai checkout...")
    method.pay(amount)
}

fun main() {
    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n=== TESTING CHECKOUT ===")
    processCheckout(pay1, 50000.0)
    processCheckout(pay2, 150000.0)


    println("\n=== TESTING SMARTINTERFACE ===")
    val lamp = SmartLamp("01", "Ruang Tamu")
    val speaker = SmartSpeaker("01", "Google Nest Dapur")
    val cctv = SmartCCTV("01", "Ezviz Garasi")
}