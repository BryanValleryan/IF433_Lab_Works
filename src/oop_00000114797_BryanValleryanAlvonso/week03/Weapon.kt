package oop_00000114797_BryanValleryanAlvonso.week03

class Weapon(
    val name: String,
) {
    var damage: Int = 0
        set(value){
            if (value < 0) {
                println("Damage tidak boleh negatif!")
                field = value
            }
            if (value > 1000) {
                println("Damage tidak boleh lebih dari 1000!")
                field = 1000
            } else {
                field = value
            }
        }
    val tier: String
        get() = when {
            damage > 800 -> "Legendary"
            damage > 500 -> "Epic"
            else -> "Common"
        }
}