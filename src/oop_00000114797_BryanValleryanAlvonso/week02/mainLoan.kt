package oop_00000114797_BryanValleryanAlvonso.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("=== PEMINJAMAN BUKU ===")

    print("Masukkan judul buku: ")
    val bookTitle = scanner.nextLine()

    print("Masukkan nama peminjam: ")
    val borrower = scanner.nextLine()

    print("Masukkan berapa lama pinjam: ")
    var loanDuration = scanner.nextInt()

    scanner.nextLine()

    if (loanDuration < 0) {
        println("lama peminjaman tidak boleh minus!")
        loanDuration = 1
    }

    val Loan = Loan(bookTitle, borrower, loanDuration)
    println("--- detail peminjaman ---")
    println("judul buku: ${Loan.bookTitle}")
    println("nama peminjam: ${Loan.borrower}")
    println("lama pinjam: ${Loan.loanDuration}")
    println("total denda: Rp ${Loan.calculateFine()}")
}