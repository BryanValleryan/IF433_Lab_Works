package oop_00000114797_BryanValleryanAlvonso.week12

class InsufficientFundsException(
    val amount: Double,
    val balance: Double
) : Exception("Attempted $amount, blance: $balance")

class BankAccount(var balance: Double) {
    fun withdraw(amount: Double) {
        if(amount < 0) {
            throw IllegalArgumentException("Amount must be positive")
        }
        if (amount > balance) {
            throw InsufficientFundsException(amount, balance)
        }
        balance -= amount
        println("Withdrawal succesful . Remainin balance: $balance")
    }
}