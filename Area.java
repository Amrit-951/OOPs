// import java.util.Scanner;

// interface AreaInterface {
//     double pi = 3.14;

//     double calc(double x, double y);
// }

// class Rect implements AreaInterface {
//     public double calc(double x, double y) {
//         return x * y;
//     }
// }

// class Circle implements AreaInterface {
//     public double calc(double r, double unused) {
//         return pi * r * r;
//     }
// }

// public class Area {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter length & breadth of rectangle: ");
//         double l = sc.nextDouble(), b = sc.nextDouble();

//         System.out.print("Enter radius of circle: ");
//         double r = sc.nextDouble();

//         System.out.println("Area of Rectangle: " + new Rect().calc(l, b));
//         System.out.println("Area of Circle: " + new Circle().calc(r, 0));

//         sc.close();
//     }
// }
//write a java program to find the area of rectangle and circle by implementig the interface 
interface Shape {
    double getArea();
}

class Rectangle implements Shape {
    private double l, b;

    public Rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }

    public double getArea() {
        return l * b;
    }
}

class Circle implements Shape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getArea() {
        return Math.PI * r * r;
    }
}

public class Area {
    public static void main(String[] args) {
        System.out.println("Rectangle: " + new Rectangle(10, 5).getArea());
        System.out.println("Circle: " + new Circle(7).getArea());
    }
}
