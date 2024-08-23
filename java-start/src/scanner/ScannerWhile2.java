package scanner;

import java.util.Objects;
import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("야스하지 않으면 나갈 수 없는 방");
        while (true) {
            System.out.print("(남) 야스 하겠습니까? : ");
            String input1 = scanner.nextLine();

            System.out.print("(여) 야스 하겠습니까? : ");
            String input2 = scanner.nextLine();

            if (Objects.equals(input1, input2)) {
                System.out.println("좋은 시간 보내세요");
                break;
            }
            System.out.println("안돼 보내줄 생각 없어 돌아가");
        }
    }
}
