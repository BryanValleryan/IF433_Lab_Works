package oop_00000114797_BryanValleryanAlvonso.week14

class DiscountClculator(private val strategy: DiscountStrategy) {
    fun calculate(price: Double) = strategy.apply(price)
}