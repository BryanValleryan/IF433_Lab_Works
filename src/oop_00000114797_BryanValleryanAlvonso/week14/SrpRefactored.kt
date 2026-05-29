package oop_00000114797_BryanValleryanAlvonso.week14

class UserValidate {
    fun validate(user: User): Boolean = user.email.contains("@") && user.age >= 10
}

class UserRepository {
    fun save(user: User) {
        println("Save user: ${user.name} to Database")
    }
}

class EmailService {
    fun sendWelcome(user: User) {
        println("Welcome email -> ${user.email}")
    }
}