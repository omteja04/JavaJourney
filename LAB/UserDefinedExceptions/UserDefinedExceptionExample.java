/**
 * Author: omteja04
 * Description: UserDefinedExceptionExample
 */

package LAB.UserDefinedExceptions;

import java.util.Scanner;

public class UserDefinedExceptionExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            // Create a bank account with initial balance of 500
            BankAccount account = new BankAccount(500);
            System.out.println("Enter The Withdraw Amount : ");
            int amount = sc.nextInt();
            account.withdraw(amount);
        } catch (InsufficientBalanceException e) {
            // Catch the custom exception and print the error message
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}

// Custom exception: InsufficientBalanceException
class InsufficientBalanceException extends Exception {
    // Constructor with a custom error message
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// BankAccount class
class BankAccount {
    private double balance;

    // Constructor
    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    // Method to withdraw money
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance.");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }
}
