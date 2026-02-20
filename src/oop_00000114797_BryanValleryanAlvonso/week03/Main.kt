package oop_00000114797_BryanValleryanAlvonso.week03

fun main() {
    val e = Employee("Budi")

    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.increasePerfomance()

    println("pajak yang harus dibayar: ${e.tax}")

    val weapon = Weapon("Excalibur")

    weapon.damage = -50
    println(weapon.damage)

    weapon.damage = 9999
    println(weapon.damage)
    println("Tier: ${weapon.tier}")
}