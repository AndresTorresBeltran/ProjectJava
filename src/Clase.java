import java.util.List;

public class Clase {
    String nombreClase;
    String numeroAula;
    private Teacher teacher;
    private static List<Student> students;

    public Clase(String nombreClase , String numeroAula, Teacher teacher){
        this.nombreClase=nombreClase;
        this.numeroAula= numeroAula;
        this.teacher=teacher;


    }
    public List<Student> getStudents() {
        return students;
    }
    public static void addStudent(Student student) {
        students.add(student);
    }
    public void removeStudent(Student student) {
        students.remove(student);
    }
}




