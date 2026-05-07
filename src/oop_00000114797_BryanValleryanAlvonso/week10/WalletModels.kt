package oop_00000114797_BryanValleryanAlvonso.week10

data class Coin(
    override val name: String,
    val balance: Double
): Nameable

data class Transaction(
    val id: String,
    val amount: Double
)