package method.ex;

public class MethodEx3 {
    /* 입금과 출금을 메서드로 만들어서 리팩토링하자
    public static void main(String[] args) {
        int balance = 10000;
        // 입금 1000
        int depositAmount = 1000;
        balance += depositAmount;
        System.out.println(depositAmount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
        // 출금 2000
        int withdrawAmount = 2000;
        if (balance >= withdrawAmount) {
            balance -= withdrawAmount;
            System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println(withdrawAmount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        System.out.println("최종 잔액: " + balance + "원");
    } */
    public static void main(String[] args) {
        int balance = 10000;
        balance = deposit(balance, 1000);
        balance = withdraw(balance, 2000);
        System.out.println("최종 잔액: " + balance);
    }

    private static int deposit(int balance, int depositAmount) {
        balance = balance + depositAmount;
        System.out.println(depositAmount + "원 입금했습니다. 잔액: " + balance + "원");
        return balance;
    }

    private static int withdraw(int balance, int withdrawAmount) {
        if (balance >= withdrawAmount) {
            balance = balance - withdrawAmount;
            System.out.println(withdrawAmount + "원 출금했습니다. 잔액: " + balance + "원");
        } else {
            System.out.println("잔액이 부족합니다. 현재 잔액: " + balance + "원");
        }
        return balance;
    }
}