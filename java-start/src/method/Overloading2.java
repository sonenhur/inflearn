package method;

public class Overloading2 {
    public static void main(String[] args) {
        myMethod(1, 1.2);
        myMethod(2.1, 2);
    }

    public static void myMethod(int a, double b) {
        System.out.println("int a, double b");
    }

    public static void myMethod(double a, int b) {
        System.out.println("double a, int b");
    }

}
