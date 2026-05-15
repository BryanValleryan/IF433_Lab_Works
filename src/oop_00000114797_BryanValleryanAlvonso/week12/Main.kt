package oop_00000114797_BryanValleryanAlvonso.week12

fun main() {
    println("=== TEST TRY AS EXPRESSION ===")
    val inputString = "123A"

    val result: Int = try {
        Integer.parseInt(inputString)
    } catch (e: NumberFormatException) {
        -1
    }

    println("Hasil parsing: $result")


    println("=== TEST MULTIPLE CATCH ===")
    val account = BankAccount(100.0)

    try {
        account.withdraw(150.0)
    } catch (e: InsufficientFundsException) {
        println("caught domain error: uang tidak cukup. ${e.message}")
    } catch (e: IllegalArgumentException) {
        println("caught argument error: Input tidak valid. ${e.message}")
    } catch (e: Exception) {
        println("caught general error: Terjadi kesalahan tidak terduga.")
    }
}