package method.ex;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        int balance = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("--------------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.println("--------------------------------------");
            System.out.print("선택 : ");
            int menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.print("입금액을 입력하세요: ");
                    int depositAmount = sc.nextInt();
                    balance = deposit(balance, depositAmount);
                    break;
                case 2:
                    System.out.print("출금액을 입력하세요: ");
                    int withdrawAmount = sc.nextInt();
                    balance = withdraw(balance, withdrawAmount);
                    break;
                case 3:
                    System.out.println("현재 잔액: " + balance);
                    break;
                case 4:
                    System.out.println("시스템을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 입력입니다.");
                    break;
            }
        }
    }

    public static int deposit(int balance, int depositAmount) {
        balance = balance + depositAmount;
        System.out.println(depositAmount + "원 입금 완료. 잔액: " + balance + "원");
        return balance;
    }

    public static int withdraw(int balance, int withdrawAmount) {
        if (balance >= withdrawAmount) {
            balance = balance - withdrawAmount;
            System.out.println(withdrawAmount + "원 출금 완료. 잔액: " + balance + "원");
            return balance;
        } else {
            System.out.println("잔액이 부족합니다");
        }
        return balance;
    }
}
