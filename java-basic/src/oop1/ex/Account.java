package oop1.ex;

public class Account {
    int balance; // 잔액

    void deposit(int amount) {
        balance += amount;
        System.out.println(amount + "원이 입금되었습니다. 잔액: " + balance + "원");
    }

    void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원이 출금되었습니다. 잔액: " + balance + "원");
        } else {
            System.out.println("잔액이 부족합니다. 현재 잔액: " + balance + "원");
        }
    }
}
