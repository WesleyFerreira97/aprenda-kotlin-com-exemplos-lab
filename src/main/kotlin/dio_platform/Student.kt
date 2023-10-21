package dio_platform

class Student (
    private var name: String,
    private val surName: String,
    private val email: String,
    private val password: String,
    private val phoneNumber: Long = 0,
){
    private val enrolledCourses: MutableCollection<Int?> = mutableListOf<Int?>()

    fun setName(newName: String) {
        name = newName
    }
    fun getEmail(): String {
        return email
    }

    fun enrollCourse(courseID: Int) {
        enrolledCourses.add(courseID)
    }

    fun showAllEnrolls(): MutableCollection<Int?> {
        return enrolledCourses
    }

    fun showStudentInfo() {
        println("Student name : $name")
        println("Student surName : $surName")
        println("Student email : $email")
    }
}