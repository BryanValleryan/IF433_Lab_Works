package oop_00000114797_BryanValleryanAlvonso.week08

object DatabaseMock {
    fun findUser(id: Int): UserProfile? {
        return if (id == 1) UserProfile("TestUSer", "test@test.com") else null
    }
}

fun runMockUnitTest() {
    println("\n=== RUNNING UNIT TEST ===")
    val testUSer = DatabaseMock.findUser(1)

    val initial = testUSer!!.name.substring(0, 1)

    check(initial == "T") { "Test Failed! Initial is wrong." }
    println("Test passed: Initial is T")
}