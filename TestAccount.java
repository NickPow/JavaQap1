// Purpose: Test the Account class by creating two accounts and transferring money between them.
// Author: Nicholas Power
// Date: Jan, 30, 2025

public class TestAccount {
    public static void main(String[] args) {
        // Create two accounts
        Account acc1 = new Account("A001", "John Doe", 5000);
        Account acc2 = new Account("A002", "Jane Doe", 4000);

        // Display initial balances
        System.out.println("Initial Balances:");
        System.out.println("Account 1: " + acc1.getBalance());
        System.out.println("Account 2: " + acc2.getBalance());

        // Transfer $1000 from Account 1 to Account 2
        acc1.transferTo(acc2, 1000);

        // Display updated balances
        System.out.println("\nBalances After Transfer:");
        System.out.println("Account 1: " + acc1.getBalance());
        System.out.println("Account 2: " + acc2.getBalance());
    }
}
