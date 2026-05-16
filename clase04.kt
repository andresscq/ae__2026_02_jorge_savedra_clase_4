data class Student(
    val id: Long,
    val name: String,
    val email: String,
    val grade: Int,
    val isActive: Boolean
)

fun getStudentResult(student: Student): String {
    return when (student.grade) {
        in 9..10 -> "Sobresaliente"
        in 7..8 -> "Aprobado"
        in 0..6 -> "Reprobado"
        else -> "Nota invalida"
    }
}

fun main() {
    val name: String = "Andres"
    val lastName: String = "Criollo"
    println("Hola $name $lastName")

    val student = Student(
        id = 1,
        name = "Ana",
        email = "Ana@gmail.com",
        grade = 8,
        isActive = false
    )
    println(student)
    
    if(student.isActive){
        println("El estudiante ${student.name} esta activo")
    } else {
        println("El estudiante ${student.name} No esta activo")
    }

    val status: String = if(student.isActive){
        "Activo"
    } else {
        "Inactivo"
    }
    println("El estudiante ${student.name} esta $status")

    val student2 = Student(
        id = 2,
        name = "Tamara",
        email = "Tamara@gmail.com",
        grade = 4,
        isActive = true
    )

    val student3 = Student(
        id = 3,
        name = "Juan",
        email = "Juan@gmail.com",
        grade = 9,
        isActive = true
    )

    val students = listOf(student, student2, student3)
    println(students)

    for (miVariable in students){
        if(miVariable.isActive){
            println("${miVariable.name} - ${miVariable.grade} - ${getStudentResult(miVariable)}")
        }
    }

}