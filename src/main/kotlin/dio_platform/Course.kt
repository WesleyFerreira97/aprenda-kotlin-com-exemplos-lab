package dio_platform
enum class Nivel { INDEFINIDO, BASICO, INTERMEDIARIO, DIFICIL }

class Course (
    private val courseID: Int,
    private var name: String,
    private var duration: Int = 10,
    private var description: String = "",
    private var difficulty : Nivel = Nivel.INDEFINIDO
){

    private val enrolledStudents: MutableCollection<String?> = mutableListOf<String?>()
    fun getName(): String {
        return name
    }
    fun getID(): Int {
        return courseID
    }

    fun showAllStudentsEnrolleds(): MutableCollection<String?> {
        return enrolledStudents
    }


    fun showCourseInfo() {
        println("Course Name : $name")
        println("Course Name : $duration")
        println("Course Name : $description")
    }
}