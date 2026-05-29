package oop_00000114797_BryanValleryanAlvonso.week14

class DiscountClculator {
    fun calculate(price: Double, type: String): Double {
        return when (type) {
            "Student" -> price * 0.80
            "member" -> price * 0.85
            "employee" -> price * 0.70
            else -> price
        }
    }
}