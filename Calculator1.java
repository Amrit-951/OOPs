//write a java program to implement calculator using multilevel inheritance for six operation

import java.util.Scanner;

class AddSub {
    double add(double a, double b) {
        return a + b;
    }

    double subtract(double a, double b) {
        return a - b;
    }
}

class MultiDiv extends AddSub {
    double multiply(double a, double b) {
        return a * b;
    }

    double divide(double a, double b) {

        return a / b;
    }
}

class Operations extends MultiDiv {
    double modulus(double a, double b) {
        return a % b;
    }

    double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}

public class Calculator1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Operations calc = new Operations();
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        System.out.println("\nSelect Operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Modulus (%)");
        System.out.println("6. Power (^)");
        System.out.print("Enter choice (1-6): ");

        int choice = input.nextInt();
        double result = 0;

        switch (choice) {
            case 1:
                result = calc.add(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 2:
                result = calc.subtract(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 3:
                result = calc.multiply(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 4:
                result = calc.divide(num1, num2);

                System.out.println("Result: " + result);

                break;
            case 5:
                result = calc.modulus(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 6:
                result = calc.power(num1, num2);
                System.out.println("Result: " + result);
                break;
            default:
                System.out.println("Invalid choice! Please enter a number between 1-6.");
        }

        input.close();
    }
}
