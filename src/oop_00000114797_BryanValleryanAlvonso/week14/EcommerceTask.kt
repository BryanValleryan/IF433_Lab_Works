package oop_00000114797_BryanValleryanAlvonso.week14

import java.io.File

interface OrderRepository {

    fun saveOrder(
        itemName: String,
        finalPrice: Double,
        customerType: String
    )
}

class CsvOrderRepository : OrderRepository {
    private val file = File("orders.csv")

    override fun saveOrder(
        itemName: String,
        finalPrice: Double,
        customerType: String
    ) {
        file.bufferedWriter().use { writer ->
            writer.append("$itemName,$finalPrice,$customerType\n")
        }
    }
}

interface NotificationService {
    fun sendNotification(message: String)
}

class EmailNotifier : NotificationService {
    override fun sendNotification(message: String) {
        println("Email terkirim: $message")
    }
}

class SafeOrderProcessor(
    private val repo: OrderRepository,
    private val notifier: NotificationService

) {
    fun processOrder(
        itemName: String,
        finalPrice: Double,
        customerType: String
    ) {
        println("Memproses pesanan $itemName seharga $finalPrice")
        repo.saveOrder(
            itemName,
            finalPrice,
            customerType
        )
        notifier.sendNotification("Pesanan $itemName anda telah dikonfirmasi")
    }
}