// class Company {
//     String name;

//     public Company() {
//         name = "Programe";
//     }

// }

// public class main {
//     public static void main(String[] args) {
//         Company obj = new Company();
//         System.out.println("Company name=" + obj.name);
//     }
// }
class Company {
    String name;

    // Default constructor
    public Company() {
        name = "Programe"; // Initializes the name field
    }
}

public class Main { // Class name updated to follow PascalCase
    public static void main(String[] args) {
        Company obj = new Company(); // Creating an instance of the Company class
        System.out.println("Company name = " + obj.name); // Printing the value of the name field
    }
}
