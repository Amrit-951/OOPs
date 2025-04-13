import java.io.*;

class Persist {
    public static void main(String args[]) {
        String filename = "studentData.txt";

        try (FileOutputStream fout = new FileOutputStream(filename);
                ObjectOutputStream out = new ObjectOutputStream(fout)) {

            PersistStudent s1 = new PersistStudent(211, "Ravi");
            out.writeObject(s1);
            System.out.println("Serialization Successful");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
