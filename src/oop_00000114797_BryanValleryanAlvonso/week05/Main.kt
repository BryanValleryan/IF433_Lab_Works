package oop_00000114797_BryanValleryanAlvonso.week05

fun main() {
    val dosen1 = Dosen("Pak Alex", "0123456")
    val admin1 = Admin("Bu siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()

        when(pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai ddosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("----------------------------")
    }

    println()
    val mathHelper = MathHelper()

    val luasPersegi = mathHelper.hitungLuas(4)
    println("Luas Persegi: $luasPersegi")

    val luasPersegiPanjang = mathHelper.hitungLuas(5, 3)
    println("Luas Persegi Panjang: $luasPersegiPanjang")

    val luasLingkaran = mathHelper.hitungLuas(7.0)
    println("Luas Lingkaran: $luasLingkaran")

    println()
    println()

    val EWallet = EWallet("Bryan", 50000.0)
    val CreditCard = CreditCard("Bryan", 100000.0)

    val paymentMethods: List<PaymentMethod> = listOf(EWallet, CreditCard)

    for (payment in paymentMethods) {
        payment.processPayment(75000.0)

        if (payment is EWallet) {
            println("Melakukan top up otomatis...")
            payment.topUp(50000.0)

            println("Mencoba transaksi lagi...")
            payment.processPayment(75000.0)
        }

        println("----------------------")
    }
}
