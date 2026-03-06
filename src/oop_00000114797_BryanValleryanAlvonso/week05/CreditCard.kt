package oop_00000114797_BryanValleryanAlvonso.week05

class CreditCard(
    accountName: String,
    val limit: Double
) : PaymentMethod(accountName) {

    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("Pembayaran sebesar $amount berhasil menggunakan kartu kredit $accountName.")
            println("Total penggunaan kartu: $usedAmount dari limit $limit")
        } else {
            println("Transaksi ditolak. Melebihi limit kartu kredit.")
        }
    }

}
