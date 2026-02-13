package oop_00000114797_BryanValleryanAlvonso.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- APLIKASI PMB UMN ---")

    print("masukkan nama: ")
    val name = scanner.nextLine()

    print("Massukan NIM (Wajib 5 karakter): ")
    val nim = scanner.next()

    scanner.nextLine()

    if (nim.length != 5) {
        print("Error: pendaftaran dibatalkan. NIM harus 5 karakter!")
    } else {
        print("Pilih jalur (1. Reguler, 2. Umum): ")
        val type = scanner.nextInt()
        scanner.nextLine()

        if (type == 1){
            print("masukkan jurusan: ")//pilih jurusan diletakkan disini, karena aneh jika pilih jalur umum tetapi sudah memiliki jurusan
            val major = scanner.nextLine()
            val s1 = Student(name, nim, major)
            println("Terdaftar di: ${s1.major} dengan GPA awal ${s1.gpa}")
        } else if (type == 2){
            val s2 = Student(name, nim)
            println("Terdaftar di: ${s2.major} dengan GPA awal ${s2.gpa}")
        } else {
            println("Pilihan ngawur, pendaftaran batal!")
        }

    }
}
