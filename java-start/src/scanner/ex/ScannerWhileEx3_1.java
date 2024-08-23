package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int input;
        System.out.println("숫자를 입력하세요 (-1 입력시 종료) :");
        /* while (true) {
            input = scanner.nextInt();
            if (input == -1) {
                System.out.println("입력을 종료합니다");
                break;
            }
            sum += input;
            count++;
        }
        */
        while ((input = scanner.nextInt()) != -1) {
            sum += input;
            count++;
        }
        double average = (double) sum / count;
        // double로 캐스팅하지 않으면 소숫점 날아가서 큰일남;

        System.out.println("입력한 숫자들의 합계 : " + sum);
        System.out.println("입력한 숫자들의 평균 : " + average);
    }
}
