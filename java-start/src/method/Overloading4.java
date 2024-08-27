package method;

public class Overloading4 {
    public static void main(String[] args) {
        System.out.println(add(1, 2));
        System.out.println(add(1.1, 2.2));
    }

    public static double add(double a, double b) {
        System.out.println("2번");
        return a + b;
    }
}
