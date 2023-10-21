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
        for(course in allCourses) {
            println("O curso é : ${course}")
        }
    }

    fun showStudentCoursesEnrolled(studentEmail: String) {
        var currentStudent = allStudents.find { it.getEmail() == studentEmail}

        currentStudent?.let {
            for(course in it.showAllEnrolls()) {
                println(course)
            }
        }
    }

    fun enrollStudent(studentEmail: String, courseID: Int) {
        var currentStudent = allStudents.find { it.getEmail() == studentEmail}

        currentStudent?.let {
            it.enrollCourse(courseID)
        }
    }
}