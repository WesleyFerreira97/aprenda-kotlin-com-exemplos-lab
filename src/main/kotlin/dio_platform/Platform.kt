package dio_platform

class Platform {
    private val allStudents = mutableListOf<Student>()
    private val allCourses = mutableListOf<Course>()

    fun registerStudent(newStudent: Student) {
        allStudents.add(newStudent)
    }

    fun registerCourse(newCourse: Course) {
        allCourses.add(newCourse)
    }

    fun showAllCourses() {
        for(course in allCourses) {
            println("O curso é : $course.name")
        }
    }
}