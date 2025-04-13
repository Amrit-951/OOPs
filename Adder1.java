class Adder {

    
    public int add(int a, int b) {
        return a + b;
    }

  
    public double add(double a, double b) {
        return a + b;
    }

   
}

public class Adder1 {
    public static void main(String[] args) {
        Adder calc = new Adder();

        
        int intSum = calc.add(5, 10);
        System.out.println("Sum of integer: " + intSum); 

       
        double doubleSum = calc.add(5.5, 10.5);
        System.out.println("Sum of double: " + doubleSum); 


       
    }
} 
