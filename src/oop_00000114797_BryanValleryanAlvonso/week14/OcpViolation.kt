package oop_00000114797_BryanValleryanAlvonso.week14

class SafeDiscountClculator(private val strategy: DiscountStrategy) {
    fun calculate(price: Double) = strategy.apply(price)
}

class SeniorDiscount: DiscountStrategy {
    override fun apply(price: Double) = price * 0.75
}