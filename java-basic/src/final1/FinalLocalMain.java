package final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        // final 지역변수
        final int data1;
        data1 = 10; // 최초 한번만 할당 가능
        // data1 = 20; // 컴파일 오류
        System.out.println(data1);

        // final 지역변수2
        final int data2 = 20;
        // data2 = 20 // 컴파일 오류
        method(20);
    }
    static void method(final int parameter){
        // parameter = 20;
    }
}
