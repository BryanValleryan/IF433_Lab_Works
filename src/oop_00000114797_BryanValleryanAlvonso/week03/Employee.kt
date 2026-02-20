package oop_00000114797_BryanValleryanAlvonso.week03

class Employee(val name: String) {
    var salary: Int = 0
    var(value) {
        println("mencoba set gaji ke: $value")

        this.salary = value
    }
}