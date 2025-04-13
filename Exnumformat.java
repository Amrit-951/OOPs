class Exnumformat {
    void display() {
        try {
            String Str = "hello";
            int num = Integer.parseInt(Str);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
        System.out.println("Exception Handled");
    }

    public static void main(String args[]) {
        Exnumformat obj = new Exnumformat();
        obj.display();
    }
}
