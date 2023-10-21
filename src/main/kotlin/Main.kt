import dio_platform.Course
import dio_platform.Platform
import dio_platform.Student

fun main() {
    val student1 = Student(
        "Wesley",
        "Ferreira",
        "wesleyferreira@outlook.com",
        "123456",
        33041234245234
    )

    val reactCourse = Course(
        1,
        "React Developer",
        50,
        "React developer Advanced"
    )

    val platformInstance = Platform()
    platformInstance.registerStudent(student1)
    platformInstance.registerCourse(reactCourse)

    platformInstance.showAllCourses()
    println(reactCourse.getName())
}


// Prciso fazer querys para :
// Consultar quais cursos cada aluno está cadastrado
// Consultar quais alunos cada curso possui