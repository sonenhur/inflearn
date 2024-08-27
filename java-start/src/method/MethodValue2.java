package method;

public class MethodValue2 {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("1. changeNumber 호출 전, number: " + number);
        changeNumber(number);
        System.out.println("4. changeNumber 호출 후, number: " + number);
    }

    public static void changeNumber(int number) {
        System.out.println("2. changeNumber 변경 전, number: " + number);
        number *= 2;
        System.out.println("3. changeNumber 변경 전, number: " + number);
    }
}
/* 실행 결과 :
1. changeNumber 호출 전, number: 5
2. changeNumber 변경 전, number: 5
3. changeNumber 변경 전, number: 10
4. changeNumber 호출 후, number: 5

 main()또한 메서드이고, 각각의 메서드 안에서 사용하는 변수는
 서로 완전히 분리된 다른 변수이다. 이름이 같아도 다른 변수이다.
 main()의 number와 changeNumber()의 number는 서로 다른 변수이다.
 */