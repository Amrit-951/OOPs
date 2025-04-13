import java.io.*;


class Person implements Serializable {
    private static final long serialVersionUID = 1L; 
    String name;
    int age;

    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student extends Person {
    private static final long serialVersionUID = 1L;
    int studentId;

    public Student(String name, int age, int studentId) {
        super(name, age);
        this.studentId = studentId;
    }
}

public class Serialize {
    public static void main(String args[]) {
        String filename = "studentData.ser";

        try (FileOutputStream fout = new FileOutputStream(filename);
                ObjectOutputStream out = new ObjectOutputStream(fout)) {

            Student s1 = new Student("Ravi", 21, 101);
            out.writeObject(s1);
            System.out.println("Serialization Successful. Data saved to " + filename);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
