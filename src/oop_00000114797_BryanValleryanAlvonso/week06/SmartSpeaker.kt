package oop_00000114797_BryanValleryanAlvonso.week06

class SmartSpeaker(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("speaker $name dinyalakan.")

    }

    override fun turnOff() {
        println("speaker $name dimatikan.")
    }

    fun playMusic (song: String) {
        println("Memutar lagu $song dari Spotify")
    }
}