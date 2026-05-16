/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */


fun main() {

    val name: String = "Andres"
    val lastName: String = "Criollo"

    println("Hello $name $lastName!!!")

    val student = Student(
        id = 1,
        name = "Ana",
        email = "Ana@gmail.com",
        grade = 18,
        isActive = false
    )

    println(student)

    if (student.isActive) {
        println("El estudiante ${student.name} esta activo")
    } else {
        println("El estudiante ${student.name} NO esta activo")
    }
}

data class Student(
    val id: Long,
    val name: String,
    val email: String,
    val grade: Int,
    val isActive: Boolean
)
