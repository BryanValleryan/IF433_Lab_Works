package oop_00000114797_BryanValleryanAlvonso.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- APLIKASI PMB UMN ---")

    println("masukkan nama: ")
    val name = scanner.nextLine()

    println("Massukan NIM (Wajib 5 karakter): ")
    val nim = scanner.nextLine()

    scanner.nextLine()

    if (nim.length != 5) {
        println("Error: pendaftaran dibatalkan. NIM harus 5 karakter!")
    } else {
        print("Masukkan jurusan: ")
        val major = scanner.nextLine()

        val s1 = Student(name, nim, major)
        println("Status: pendaftaran  selesai.")

    }
}
