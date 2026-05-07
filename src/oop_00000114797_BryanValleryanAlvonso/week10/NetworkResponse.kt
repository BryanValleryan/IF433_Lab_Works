package oop_00000114797_BryanValleryanAlvonso.week10

data class ApiResponse<T>(
    val status: String,
    val data: T
)