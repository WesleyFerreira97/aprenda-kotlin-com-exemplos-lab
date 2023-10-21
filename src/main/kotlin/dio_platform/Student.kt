package dio_platform

class Student (
    private var name: String,
    private val surName: String,
    private val email: String,
    private val password: String,
    private val phoneNumber: Long = 0,
){
    fun setName(newName: String) {
        name = newName
    }

    fun showStudentInfo() {
        println("Student name : $name")
        println("Student surName : $surName")
        println("Student email : $email")
    }
}