package oop_00000114797_BryanValleryanAlvonso.week11

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()
    SmartDevice("Philips WiZ Living Room", "Lighting").apply {
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
    }
}