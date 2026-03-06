package oop_00000114797_BryanValleryanAlvonso.week05

class EWallet (
    accountName: String,
    var balance: Double
) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("Pembayaran sebesar $amount berhasil menggunakan E-Wallet milik $accountName.")
            println("Sisa saldo: $balance")
        } else {
            println("Saldo tidak cukup.")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("Top up berhasil sebesar $amount. Saldo sekarang: $balance")
    }

}
