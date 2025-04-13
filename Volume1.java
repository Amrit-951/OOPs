//volume of box(cube) by method overloading
class Volume {

    public int vol(int a) {
        return a*a*a;
    }

    public double vol(double a) {
        return a*a*a;
    }

}

public class Volume1 {
    public static void main(String[] args) {
        Volume calc = new Volume();

        int intVol = calc.vol(5);
        System.out.println("volume of integer: " + intVol);

        double doubleVol = calc.vol(5.5);
        System.out.println("volume of double: " + doubleVol);

    }
}
