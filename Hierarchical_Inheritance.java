class EngineeringCollege {
    String collegeName = "ABC Engineering College";

    public void showCollege() {
        System.out.println("College: " + collegeName);
    }
}

class ECS extends EngineeringCollege {
    public void showECSSubjects() {
        System.out.println("ECS Branch: Electronics + Computer Science subjects.");
        System.out.println("Core Subjects: Digital Electronics, Embedded Systems, AI, Machine Learning.");
    }
}

class CSE extends EngineeringCollege {
    public void showCSESubjects() {
        System.out.println("CSE Branch: Pure Computer Science subjects.");
        System.out.println("Core Subjects: Data Structures, Algorithms, Web Development, Cybersecurity.");
    }
}

public class Hierarchical_Inheritance{
    public static void main(String[] args) {
        ECS ecsStudent = new ECS();
        CSE cseStudent = new CSE();

        ecsStudent.showCollege();
        ecsStudent.showECSSubjects();

        System.out.println(); 

        cseStudent.showCollege();
        cseStudent.showCSESubjects();
    }
}
