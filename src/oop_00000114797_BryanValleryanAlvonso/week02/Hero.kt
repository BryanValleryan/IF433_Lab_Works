package oop_00000114797_BryanValleryanAlvonso.week02

import java.util.Scanner

class Hero (
    val name: String,
    val baseDamage: Int,
    var hp: Int = 100
) {
    fun attack (enemyName: String) {
        println("$name menebas $enemyName")
    }
    fun takeDamage(enemyDamage: Int) {
        println("musuh menyerangmu!")
        hp -= enemyDamage
        if (hp > 0){
            println("hp yang tersisa adalah: $hp")
        } else {
            println("kamu mati!")
        }
    }
    fun isAlive(): Boolean {
        return hp > 0
    }
}

fun main() {
    val scanner = Scanner(System.`in`)
    var enemyHp: Int = 100

    println("=== MINI RPG GAME ===")
    print("Masukkan nama: ")
    val name = scanner.nextLine()

    print("Masukkan stat damage: ")
    var damage = scanner.nextInt()
    scanner.nextLine()

    while(damage < 0) {
        if (damage < 0) {
            println("damage tidak boleh minus, kamu bukan healer!")
            print("Masukkan stat damage: ")
            damage = scanner.nextInt()
        }
    }

    val hero = Hero(name, damage)

    while (hero.isAlive() && hero.hp > 0 ) {
        println("Pilih menu: 1. serang, 2. Kabur")
        var choice = scanner.nextInt()

        when (choice) {
            1 -> {
                hero.attack("Villain")
                enemyHp -= hero.baseDamage

                if (enemyHp > 0) {
                    println("Hp musuh tersisa $enemyHp")
                    var enemyDamage = (10..20).random()
                    hero.takeDamage(enemyDamage)
                } else (break)
            }
            2 -> {
                println("kamu memilih kabur")
                (break)
            }
        }
    }
    if (hero.hp > enemyHp) {
        if (enemyHp < 0) enemyHp = 0
        println("Hp kamu yang tersisa adalah ${hero.hp}")
        println("Hp musuh yang tersisa adalah $enemyHp")
        println("Selamat kamu menang!")
    } else {
        if (hero.hp < 0) hero.hp = 0
        println("Hp kamu yang tersisa adalah ${hero.hp}")
        println("Hp musuh yang tersisa adalah $enemyHp")
        println("Kamu kalah!")
    }

}