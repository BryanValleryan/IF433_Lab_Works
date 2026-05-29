package oop_00000114797_BryanValleryanAlvonso.week14

data class User(val name: String, val email: String, val age: Int)

class UserManager {
    fun saveUser(user: User): Boolean {
        return user.email.contains("@") && user.age >= 18
    }

    fun saveUserToDatabse(user: User) {
        println("INSERT INTO users VAlUES ('${user.name}', '${user.email}')")
    }

    fun sendWelcomeEmail(user: User) {
        println("Sending email to: ${user.email}")
    }
}

