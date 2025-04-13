import java.io.*;

public class Deserialize {
    public static void main(String args[]) {
        String filename = "studentData.ser"; 

        try (FileInputStream fin = new FileInputStream(filename);
                ObjectInputStream in = new ObjectInputStream(fin)) {

            Student s = (Student) in.readObject(); 
            System.out.println("Deserialization Successful.");
            System.out.println("Student Name: " + s.name);
            System.out.println("Student Age: " + s.age);
            System.out.println("Student ID: " + s.studentId);

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
