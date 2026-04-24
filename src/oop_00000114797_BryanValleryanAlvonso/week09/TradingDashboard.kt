package oop_00000114797_BryanValleryanAlvonso.week09

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 10, 14.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 7, -9.2, "CLOSED"),
        TradeLog("BTCUSDT", "LONG", 18, 29.0, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 13, -8.5, "OPEN"),
        TradeLog("BTCUSDT", "SHORT", 16, -10.2, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 8, 5.9, "CLOSED")
    )

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
}