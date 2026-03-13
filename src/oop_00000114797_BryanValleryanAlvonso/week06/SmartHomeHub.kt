package oop_00000114797_BryanValleryanAlvonso.week06

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
        println("Perangkat ${device.name} berhasil ditambahkan ke Smart Home Hub.")
    }

    fun turnOffAllSwitches() {
        for (device in devices) {
            if (device is Switchable) {
                device.turnOff()
            }
        }
    }
}