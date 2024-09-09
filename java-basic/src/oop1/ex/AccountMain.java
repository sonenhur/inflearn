package oop1.ex;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(10000);
        account.withdraw(5000);
        account.withdraw(10000);
        System.out.println("현재 잔액: " + account.balance + "원");
    }
}
