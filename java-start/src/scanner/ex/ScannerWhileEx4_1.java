package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPrice = 0;

        while (true) {
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    scanner.nextLine(); // 개행입력 처리
                    System.out.print("상품명을 입력하세요: ");
                    String name = scanner.nextLine();
                    System.out.print("상품 가격을 입력하세요: ");
                    int price = scanner.nextInt();
                    System.out.print("구매 수량을 입력하세요 : ");
                    int quantity = scanner.nextInt();
                    totalPrice += (price * quantity);
                    System.out.println("상품명 : " + name + ", 가격 : " + price + ", 수량 : " + quantity + ", 합계 :" + price * quantity);
                    break;
                case 2:
                    System.out.println("총 비용 : " + totalPrice);
                    totalPrice = 0; // 끝났으면 초기화;
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다");
                    scanner.close();
                    return;
                default:
                    System.out.println("올바른 입력이 아닙니다");
                    break;
            }
        }
    }
}
