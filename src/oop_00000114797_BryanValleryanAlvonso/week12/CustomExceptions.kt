package oop_00000114797_BryanValleryanAlvonso.week12

class InsufficientFundsException(
    val amount: Double,
    val balance: Double
) : Exception("Attempted $amount, blance: $balance")