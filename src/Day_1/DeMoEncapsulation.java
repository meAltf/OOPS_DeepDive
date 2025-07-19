package Day_1;

class BankAccount {
    private int balance = 100000; // private data

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
}

public class DeMoEncapsulation {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(150000);
        bankAccount.withdraw(200000);
        System.out.println("The Account balance is: " + bankAccount.getBalance());
    }
}
