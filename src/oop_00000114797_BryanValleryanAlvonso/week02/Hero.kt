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

