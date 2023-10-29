import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Teacher> Teacherslist = new ArrayList<Teacher>();

        //Teachers
        Teacher teacher1 = new Teacher(1, "Cayo Perez", true, 40, 2);
        Teacherslist.add(teacher1);
        Teacher teacher2 = new Teacher(2, "Joel Torres", true, 40, 3);
        Teacherslist.add(teacher2);
        Teacher teacher3 = new Teacher(3, "Javier Arellano", false, 14, 0);
        Teacherslist.add(teacher3);
        Teacher teacher4 = new Teacher(4, "Jorge gozo", false, 20, 0);
        Teacherslist.add(teacher4);
        //Students

        ArrayList<Student> StudentsList = new ArrayList<Student>();
        Student student1 = new Student(988, "Alfredo Espinoza", 23);
        StudentsList.add(student1);
        Student student2 = new Student(983, "Kevin Sote", 20);
        StudentsList.add(student2);
        Student student3 = new Student(788, "Zoyla Quebarre", 22);
        StudentsList.add(student3);
        Student student4 = new Student(430, "Deivid Lopez", 20);
        StudentsList.add(student4);
        Student student5 = new Student(838, "Melissa Torres", 19);
        StudentsList.add(student5);
        Student student6 = new Student(333, "Alfreo Marin", 22);
        StudentsList.add(student6);
        //Classes
        ArrayList<Clase> clases = new ArrayList<Clase>();
        Clase Dibujo = new Clase("Dibujo 1", "Salon 104", teacher1);
        Dibujo.addStudent(student1);
        Dibujo.addStudent(student2);
        Dibujo.addStudent(student6);
        clases.add(Dibujo);
        Clase Python = new Clase("Python 2", "Salon 106", teacher4);
        Python.addStudent(student2);
        Python.addStudent(student3);
        Python.addStudent(student4);
        clases.add(Python);
        Clase Photo = new Clase("Photo", "Salon 201", teacher3);
        Photo.addStudent(student3);
        Photo.addStudent(student4);
        Photo.addStudent(student5);
        clases.add(Photo);
        Clase Java = new Clase("Java POO", "Salon 204", teacher1);
        Java.addStudent(student3);
        Java.addStudent(student5);
        Java.addStudent(student6);
        clases.add(Java);


        System.out.println("******** Welcome to the University System ********\n");
        boolean correr = true;

        //Uso un while para validar que siga corriendo el programa
        while (correr) {
            System.out.println("1. Teachers information");
            System.out.println("2. Classes Info");
            System.out.println("3. Add a new Student");
            System.out.println("4. Add a new Class");
            System.out.println("5. Search an student in a class"
            );
            System.out.println("6. " +
                    "End program");


            int Option = sc.nextInt();
            switch (Option) {
                // 1. Teachers Information
                case (1):
                    int i = 1;

                    for (Object teacher : Teacherslist) {
                        System.out.println("  " + i + ". " + " Teacher's Name" + teacher.getClass().getName() + "salary: " + Teacherslist.get(i).getClass());
                        i++;
                    }


                    break;

                // 2. Classes Information.
                case (2):
                    i = 1;
                    //Printing class list
                    System.out.println("Class List");
                    for (i = 0; i < clases.size(); i++) {
                        System.out.println(i + ". " + clases.get(i).getClass().getName() + "Student " + StudentsList.get(i).getClass().getName() + "Teachers: " + Teacherslist.get(i));

                    }
                    //Choosing class

                    break;

                // 3. Add new Student.
                case (3):
                    System.out.println("Add new student");
                    //Student's Information
                    System.out.println("Type Student's id:");
                    int newStudentId = sc.nextInt();
                    System.out.println("Type Student's name:");
                    String newStudentName = sc.next();
                    System.out.println("Type Student's age:");
                    int newAge = sc.nextInt();
                    Clase.addStudent(new Student(newStudentId, newStudentName, newAge));
                    //Add to a class with a list of an existing classes


                    break;


                // 4. new Class.
                case (4):
                    System.out.println("Add new Class");

                    //Student's Information
                    System.out.println("class name");
                    String newClassName = sc.next();
                    System.out.println("classroom number with the format Salon 101");
                    String newClassRoom = sc.next();


                    Clase nuevaclase = new Clase(newClassName, newClassRoom, teacher1);
                    nuevaclase.addStudent(student1);


                    // 5. Search for a student's classes.
                case (5):
                    System.out.println("Students List:");
                    for (i = 0; i < StudentsList.size(); i++) {
                        System.out.println(" " + i + ". " + StudentsList.get(i) + " - id: 0" + StudentsList.get(i));
                        i++;
                    }


                    break;
                // 6. Exit System.
                case (6):
                    System.out.println("Thanks for use this app!");
                    correr = false;
                    // wrong number
                default:
                    System.out.println("Write a valid option");
            }
        }
    }
}