class Classroom {
    String className = "10th Grade";

    public void showClass() {
        System.out.println("Classroom: " + className);
    }
}

class Student extends Classroom {
    String studentName = "Amit";

    public void showStudent() {
        System.out.println("Student Name: " + studentName);
    }
}

class Exam extends Student {
    int marks = 85;

    public void showExamDetails() {
        System.out.println("Exam Marks: " + marks);
    }
}

public class MultiLevel_Inheritance {
    public static void main(String[] args) {
        Exam studentExam = new Exam();

        studentExam.showClass(); 
        studentExam.showStudent(); 
        studentExam.showExamDetails(); 
    }
}
