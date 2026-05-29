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

interface PricingStrategy {
    fun calculate(price: Double): Double
}

class RegularPricing : PricingStrategy {
    override fun calculate(price: Double): Double {
        return price
    }
}

class VipPricing : PricingStrategy {
    override fun calculate(price: Double): Double {
        return price * 0.90
    }
}

class SafeOrderProcessor(
    private val repo: OrderRepository,
    private val notifier: NotificationService

) {
    fun processOrder(
        itemName: String,
        basePrice: Double,
        pricingStrategy: PricingStrategy
    ) {
        val finalPrice =
            pricingStrategy.calculate(basePrice)
        println(
            "Memproses pesanan $itemName " +
                    "seharga $finalPrice"
        )
        repo.saveOrder(
            itemName,
            finalPrice,
            pricingStrategy::class.simpleName ?: "Unknown"
        )
        notifier.sendNotification("Pesanan $itemName anda telah dikonfirmasi")
    }
}