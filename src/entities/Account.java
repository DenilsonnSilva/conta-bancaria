package entities;

public class Account {
    private final int accountNumber;
    private String ownerName;
    private double balance;
    private static final double withdrawFee = 5.0;

    public Account(int accountNumber, String ownerName) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
    }

    public Account(int accountNumber, String ownerName, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        deposit(initialDeposit);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        balance -= amount + withdrawFee;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public String toString() {
        return String.format("Account %d, Holder: %s, Balance: $ %.2f",
                accountNumber,
                ownerName,
                balance
        );
    }
}
