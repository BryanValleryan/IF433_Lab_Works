package oop_00000114797_BryanValleryanAlvonso.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 0.82))
    coinRepo.add(Coin("ETH", 17.67))
    coinRepo.add(Coin("USDT", 1500.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("Status Respons: ${response.status}")

    response.data.forEach {
        println("Coin: ${it.name}, Balance: ${it.balance}")
    }

    val txRepo = WalletRepository<Transaction>()

    txRepo.add(Transaction("TX001", 250000.0))
    txRepo.add(Transaction("TX002", 125000.5))
    txRepo.add(Transaction("TX003", 98000.0))

}
