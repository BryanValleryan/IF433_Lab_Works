package oop_00000114797_BryanValleryanAlvonso.week03

fun main() {
    val weapon = Weapon("Excalibur")

    weapon.damage = -50
    println(weapon.damage)

    weapon.damage = 9999
    println(weapon.damage)
    println("Tier: ${weapon.tier}")
}