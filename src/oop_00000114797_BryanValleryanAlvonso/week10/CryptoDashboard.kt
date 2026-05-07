package oop_00000114797_BryanValleryanAlvonso.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 0.82))
    coinRepo.add(Coin("ETH", 17.67))
    coinRepo.add(Coin("USDT", 1500.0))

}
