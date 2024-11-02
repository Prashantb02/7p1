package java_seminar;

abstract class BankAccount {
    private double balance;

    // Constructor
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Abstract method
    public abstract void withdraw(double amount);

    // Concrete method
    public void deposit(double amount) {
        balance += amount;
    }

    // Getter method
    public double getBalance() {
        return balance;
    }
}

// Concrete subclass
class SavingsAccount extends BankAccount {
    private double interestRate;

    // Constructor
    public SavingsAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }

    // Implementing abstract method
    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            super.deposit(-amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    // Additional method
    public void addInterest() {
        double interest = getBalance() * interestRate / 100;
        super.deposit(interest);
    }
}

public class abstract_main {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount(1000, 5);
        System.out.println("Initial balance: " + account.getBalance());
        account.withdraw(500);
        System.out.println("Balance after withdrawal: " + account.getBalance());
        account.addInterest();
        System.out.println("Balance after adding interest: " + account.getBalance());
    }
}