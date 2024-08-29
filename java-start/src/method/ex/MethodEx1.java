package method.ex;

public class MethodEx1 {
    /* 다음 코드를 메서드를 사용해서 리팩토링하자
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int sum = a + b + c;
        double average = sum / 3.0;
        System.out.println("평균: " + average);

        int x = 15;
        int y = 25;
        int z = 35;
        sum = x + y + z;
        average = sum / 3.0;
        System.out.println("평균: " + average);
    }*/
    public static void main(String[] args) {
        System.out.println("평균: " + average(1, 2, 3));
        System.out.println("평균: " + average(15, 25, 35));
    }

    public static double average(int a, int b, int c) {
        double sum = a + b + c;
        return sum / 3.0;
    }
}
