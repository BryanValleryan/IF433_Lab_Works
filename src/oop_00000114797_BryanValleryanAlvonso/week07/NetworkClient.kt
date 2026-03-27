package oop_00000114797_BryanValleryanAlvonso.week07

class NetworkClient private constructor(val url: String) {
    fun connect() {
        println("Connecting to $url...")
    }
}