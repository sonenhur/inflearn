package scanner.ex;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("판별할 정수를 입력하세요 : ");
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.println("입력한 숫자 " + n + "(은)는 짝수입니다");
        } else System.out.println("입력한 숫자 " + n + "(은)는 홀수입니다");
    }
}
