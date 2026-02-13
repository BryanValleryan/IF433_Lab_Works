package oop_00000114797_BryanValleryanAlvonso.week02

class Student(
    val name: String,
    val nim: String,
    var major: String = "Non-Matriculated",
    var gpa : Double = 0.0
){
    init {
        if(nim.length != 5){
            println("Warning: objek tercipta dengan NIM ($nim) yang tidak valid!")
            println("Data mahasiswa $name mungkin akan bermasalah di sistem.")
        }else {
            println("LOG: Objek student $name berhasil dialokasikan di memory.")
        }
    }

    constructor(name: String, nim: String) : this(name, nim,"Non-Matriculated") {
        println("LOG: Menggunakan constructor jalur umum (Tanpa jurusan).")
    }

}