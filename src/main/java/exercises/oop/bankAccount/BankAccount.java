package exercises.oop.bankAccount;

public class BankAccount {
    private int accountBalance;

    public BankAccount() {
        this.accountBalance = 0;
    }

    public BankAccount(int initialBalance) {
        this.accountBalance = initialBalance;
    }

    public void withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("Error: Withdrawal amount must be positive");
            return;
        }

        if (amount > accountBalance) {
            System.out.println("Error: Insufficient funds in the account");
            System.out.println("  Available: " + accountBalance + ", requested: " + amount);
            return;
        }

        accountBalance -= amount;
        System.out.println("Removed: " + amount + ". Current balance: " + accountBalance);
    }

    public void deposit(int amount) {
        if (amount <= 0) {
            System.out.println("Error: The top-up amount must be positive.");
            return;
        }

        accountBalance += amount;
        System.out.println("Contributed: " + amount + ". Current balance: " + accountBalance);
    }

    public void printBalance() {
        System.out.println("Current balance: " + accountBalance);
    }

    protected int getBalance() {
        return accountBalance;
    }

    protected void setBalance(int balance) {
        this.accountBalance = balance;
    }
}
