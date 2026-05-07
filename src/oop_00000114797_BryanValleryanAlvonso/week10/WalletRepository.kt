package oop_00000114797_BryanValleryanAlvonso.week10

interface Nameable {
    val name: String
}

class WalletRepository<T> {

    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    fun searchByName(keyword: String): List<T> {
        return items.filter {
            (it as? Nameable)
                ?.name
                ?.contains(keyword, ignoreCase = true)
                ?: false
        }
    }
}