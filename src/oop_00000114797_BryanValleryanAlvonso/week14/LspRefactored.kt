package oop_00000114797_BryanValleryanAlvonso.week14

interface Shape {
    fun area(): Int
}

class safeRectangle(var width: Int, var height: Int): Shape {
    override fun area() = width * height
}

class safeSquare(var side: Int): Shape {
    override fun area() = side * side
}