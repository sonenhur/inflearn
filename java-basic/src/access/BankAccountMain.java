package access;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.deposit(10000);
        acc.withdraw(5000);
        System.out.println("balance: " + acc.getBalance());
        acc.withdraw(7000);
        System.out.println("balance: " + acc.getBalance());
    }
}
