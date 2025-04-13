
public class ThrowThrows {

    public static void validate(int age) throws ArithmeticException {
        if (age < 18) {
            
            throw new ArithmeticException("Person is not eligible to vote");
        } else {
            System.out.println("Person is eligible to vote!!");
        }
    }

    public static void main(String args[]) {
        try {
        
            validate(13);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Rest of the code executes normally...");
    }
}
