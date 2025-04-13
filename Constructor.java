class Student {
    String name;
    int age;
    String course;

   
    public Student(String name) {
        this.name = name;
        this.age = 0; 
        this.course = "Not Assigned";
    }

    
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.course = "Not Assigned";
    }

    
    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

   
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

public class Constructor {
    public static void main(String[] args) {
        
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob", 20);
        Student student3 = new Student("Charlie", 22, "Computer Science");

        
        System.out.println("Student 1 Details:");
        student1.displayDetails();

        System.out.println("\nStudent 2 Details:");
        student2.displayDetails();

        System.out.println("\nStudent 3 Details:");
        student3.displayDetails();
    }
}
