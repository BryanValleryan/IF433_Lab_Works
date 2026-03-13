package oop_00000114797_BryanValleryanAlvonso.week06

class Smartwatch: Watch(), BluetoothConnectable, Rechargeable {
    override fun showTime() {
        println("layar oled menyala: 14:00 WIB")
    }

    override fun connectToBluetooth() {
        println("mencari perangkat HP di sekitar untuk pairing...")
    }

    override fun chargeBattery() {
        println("Mengisi daya menggunakan charger magnetik 15W.")
    }
}