package oop_00000114797_BryanValleryanAlvonso.week10

interface Nameable {
    val name: String
}

class WalletRepository<T> where T : Nameable {

    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    fun searchByName(keyword: String): List<T> {
        return items.filter {
            it.name.contains(keyword, ignoreCase = true)
        }
    }
}