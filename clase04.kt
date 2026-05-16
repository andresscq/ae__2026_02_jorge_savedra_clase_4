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

    val student2 = Student(
        id = 2,
        name = "Juan",
        email = "Juan@gmail.com",
        grade = 19,
        isActive = false
    )

    val student3 = Student(
        id = 3,
        name = "Tamara",
        email = "Tamara@gmail.com",
        grade = 89,
        isActive = true
    )

    val students = listOf(student, student2, student3)

    println(students)

    for (studentItem in students) {

        println("${studentItem.name}")
        println("${studentItem.grade}")
    }

    for (miVariable in students) {

        if (miVariable.isActive) {

            println("${miVariable.name} - ${miVariable.grade}")

            val status: String = if (miVariable.isActive) {
                "Activo"
            } else {
                "Inactivo"
            }

            println("El estudiante ${miVariable.name} esta $status")
        }
    }
}

data class Student(
    val id: Long,
    val name: String,
    val email: String,
    val grade: Int,
    val isActive: Boolean
)