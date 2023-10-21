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

    val student2 = Student(
        "Draven",
        "Draven",
        "theDraven@draven.com",
        "99999",
        1
    )

    val reactCourse = Course(
        1,
        "React Developer",
        50,
        "React developer Advanced"
    )
    val javaCourse = Course(
        2,
        "Java Developer",
        70,
        "Java developer Advanced"
    )

    val platformInstance = Platform()
    // Registra Estudantes
    platformInstance.registerStudent(student1)
    platformInstance.registerStudent(student2)

    // Registra Cursos
    platformInstance.registerCourse(reactCourse)
    platformInstance.registerCourse(javaCourse)

    // Exibe todos os Cursos adicionados
    platformInstance.showAllCourses()

    // Matricula estudantes em cursos
    platformInstance.enrollStudent(student2.getEmail(), reactCourse.getID())
    platformInstance.enrollStudent(student2.getEmail(), javaCourse.getID())

    // Consultar quais cursos cada aluno está cadastrado e exibir os nomes
    platformInstance.showStudentCoursesEnrolled(student2.getEmail())

    // Consultar quais alunos cada curso possui
    platformInstance.showStudentsByCourse(reactCourse.getID())
}
