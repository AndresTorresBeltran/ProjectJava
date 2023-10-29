import java.util.List;

public class Student {
    int studentID;
    String studentNAme;
    int age;
    private List<Student> students;

    public int getStudentID() {
        return studentID;
    }

    public String getStudentNAme() {
        return studentNAme;
    }

    public int getAge() {
        return age;
    }

    public Student(int studentID, String studentName, int age){
        this.studentID=studentID;
        this.studentNAme=studentName;
        this.age=age;

    }public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

}
