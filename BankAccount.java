import java.util.Scanner;

public class BankAccount {
    private String depositorName;
    private String accountType;
    private long accountNumber;
    private double balance;

    // Constructor to initialize the bank account
    public BankAccount(String name, String type, long number, double initialBalance) {
        depositorName = name;
        accountType = type;
        accountNumber = number;
        balance = initialBalance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Invalid amount. Deposit failed.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (balance >= amount && amount > 0) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount. Withdrawal failed.");
        }
    }

    // Method to display account information
    public void displayInfo() {
        System.out.println("Depositor Name: " + depositorName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage of the BankAccount class
        BankAccount account = new BankAccount("John Doe", "Savings", 1234567890L, 5000.0);

        // Deposit example
        System.out.println("Deposit example: Enter deposit amount:");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);

        // Withdraw example
        System.out.println("Withdraw example: Enter withdrawal amount:");
        double withdrawAmount = scanner.nextDouble();
        account.withdraw(withdrawAmount);

        // Display account information
        System.out.println("Account Information:");
        account.displayInfo();

    }
}
