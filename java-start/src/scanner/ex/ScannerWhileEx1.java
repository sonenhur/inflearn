package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("이름을 입력하세요 (exit를 입력하면 종료) : ");
            String name = scanner.nextLine();
            if (name.equals("exit")) {
                System.out.print("프로그램을 종료합니다");
                break;
            }
            System.out.print("나이를 입력하세요 : ");
            int age = scanner.nextInt();
            scanner.nextLine(); // 숫자 입력 후의 줄바꿈 처리

            System.out.println("입력한 이름 : " + name + ", 나이 : " + age);
        }
    }
}
/*
여기서 scanner.nextLine();은 scanner.nextInt(); 이후에
남아 있는 개행 문자(\n)를 소비하기 위해 사용됩니다.
nextInt()를 사용하면 숫자 입력만 읽고,
사용자가 Enter 키를 눌렀을 때 생성되는 개행 문자는 읽지 않습니다.
이 개행 문자가 입력 버퍼에 남아 있게 됩니다.
 */