package oop_00000114797_BryanValleryanAlvonso.week03

class Player (
    val username: String
){
    private var xp = 0

    val level: Int
        get() = (xp / 100) + 1

    fun addXp(amount: Int) {
        var oldLevel = level
        if (amount < 0) {
            println("hanya menerima angka positif")
        } else {
            xp += amount
        }
        println("xp: $xp")
        var newLevel = level
        if (newLevel > oldLevel) {
            println( "Level Up! Selamat $username naik ke level $level")
        }
    }
}