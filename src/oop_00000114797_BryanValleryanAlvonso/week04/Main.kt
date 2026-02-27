package oop_00000114797_BryanValleryanAlvonso.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle("Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car("Toyota", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing ElectricCar ---")
    val tesla = ElectricCar("Tesla", 4, 85)
    tesla.accelerate()
    tesla.honk()
    tesla.openTrunk()

    println("\n--- Testing Employee ---")

    val manager = Manager("Andi", 10_000_000)
    val developer = Developer("Budi", 8_000_000, "Kotlin")

    manager.work()
    println("Bonus Manager: Rp ${manager.calculateBonus()}")

    developer.work()
    println("Bonus Developer: Rp ${developer.calculateBonus()}")
}