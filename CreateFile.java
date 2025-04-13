import java.io.File;
import java.io.IOException;

class CreateFile {
    public static void main(String args[]) {
        try {
            File f0 = new File("C:\\Users\\Lenovo\\OneDrive\\Desktop\\java\\CreateFile.txt");

            if (f0.createNewFile()) {
                System.out.println("File " + f0.getName() + " is created successfully.");
            } else {
                System.out.println("File already exists in the directory.");
            }
        } catch (IOException exception) {
            System.out.println("An unexpected error occurred.");
            exception.printStackTrace();
        }
    }
}
