package dio_platform

class Platform {
    private val allStudents = mutableListOf<Student>()
    private val allCourses = mutableMapOf<Int, Course>()

    fun registerStudent(newStudent: Student) {
        allStudents.add(newStudent)
    }

    fun registerCourse(newCourse: Course) {
        // Cada valor da chave de um map é unica portanto
        // O sistema não permite o cadastro de ID iguais
        val courseID = newCourse.getID()
        allCourses[courseID] = newCourse
    }

    fun showAllCourses() {
        for((key, course) in allCourses) {
            println("O curso é : ${course.getName()}")
        }
    }

    fun showStudentCoursesEnrolled(studentEmail: String) {
        var currentStudent = allStudents.find { it.getEmail() == studentEmail}

        currentStudent?.let {
            var currStudentName = currentStudent.getName()

            println("O Aluno $currStudentName, está matriculado nos seguintes cursos : ")
            for(course in it.showAllEnrolls()) {
                println(allCourses[course]?.getName())
            }
            return
        }

        println("Aluno não encontrado!")
    }

    fun showStudentsByCourse(courseID: Int) {
        var currentStudentCourses = allCourses.filter { it.key == courseID }.toMap()

        println("Os cursos matriculados são : ")
        println(allCourses[courseID]?.showAllStudentsEnrolleds())

    }

    fun enrollStudent(studentEmail: String, courseID: Int) {
        var currentStudent = allStudents.find { it.getEmail() == studentEmail}

        currentStudent?.let {
            it.enrollCourse(courseID)
        }
    }
}