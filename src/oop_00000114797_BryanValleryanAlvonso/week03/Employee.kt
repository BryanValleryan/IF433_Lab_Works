package oop_00000114797_BryanValleryanAlvonso.week03

class Employee(val name: String) {
    var salary: Int = 0
    set(value) {
        if (value < 0) {
            println("ERROR: Gaji tidak boleh negatif! DI-set ke 0.")
            field = 0
        } else {
            field = value
        }
    }
}