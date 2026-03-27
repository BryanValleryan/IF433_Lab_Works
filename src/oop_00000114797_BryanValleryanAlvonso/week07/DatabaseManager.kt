package oop_00000114797_BryanValleryanAlvonso.week07

object DatabaseManager {
    var connectionStatus: String = "Disconnected"

    fun connect() {
        connectionStatus = "Connected to serever"
        println("Database is ready")
    }
}