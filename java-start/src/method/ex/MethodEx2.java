package method.ex;

public class MethodEx2 {
    /* 다음 코드를 메서드를 사용해서 리팩토링하자
    public static void main(String[] args) {
        String message = "Hello, world!";
        for (int i = 0; i < 3; i++) {
            System.out.println(message);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(message);
        }
        for (int i = 0; i < 7; i++) {
            System.out.println(message);
        }
    } */
    public static void main(String[] args) {
        printMessage("Hello, world!", 3);
        printMessage("Hello, world!", 5);
        printMessage("Hello, world!", 7);

    }

    public static void printMessage(String message, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(message);
        }
    }
}
