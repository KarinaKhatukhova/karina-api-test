package exercises.bankAccount;

public class SavingsAccount extends BankAccount {

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(int initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("Error: Withdrawal amount must be positive");
            return;
        }

        int currentBalance = getBalance();
        int balanceAfterWithdraw = currentBalance - amount;

        if (balanceAfterWithdraw < 100) {
            System.out.println("Error: Transaction declined. Minimum balance must be at least 100.");
            System.out.println("  Current balance: " + currentBalance);
            System.out.println("  Requested: " + amount);
            System.out.println("  Balance after operation: " + balanceAfterWithdraw);
            return;
        }

        super.withdraw(amount);
    }

}
