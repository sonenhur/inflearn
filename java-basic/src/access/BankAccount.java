package access;

public class BankAccount {
    private int balance;

    public BankAccount() {
        balance = 0;
    }

    // public 메서드: deposit
    public void deposit(int amount) {
        if (isAmountValid()) {
            balance += amount;
        } else {
            System.out.println("유효하지 않은 금액입니다");
        }
    }

    // public 메서드: withdraw
    public void withdraw(int amount) {
        if (isAmountValid() && balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("유효하지 않은 금액이거나, 잔액이 부족합니다");
        }
    }

    // public 메서드: getBalance
    public int getBalance() {
        return balance;
    }

    // 금액이 0보다 큰지 검증
    private boolean isAmountValid() {
        return true;
    }
}
