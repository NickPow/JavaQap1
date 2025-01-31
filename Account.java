// Purpose: Define the Account class with methods to credit, debit, transfer, and return a string representation of the account.
// Author: Nicholas Power
// Date: Jan, 30, 2025

public class Account {
    private String id;
    private String name;
    private int balance = 0;

    // Constructor with ID and name
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // Constructor with ID, name, and initial balance
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // Getters
    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount) {
        balance += amount;
        return balance;
    }

    // Deducts the amount from the balance if sufficient funds exist
    public int debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    // Transfers amount to another account if sufficient funds exist
    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            this.debit(amount);
            another.credit(amount);
        } else {
            System.out.println("Amount exceeded balance");
        }
        return this.balance;
    }

    // Returns a string representation of the account
    @Override
    public String toString() {
        return "Account[id=" + id + ",name=" + name + ",balance=" + balance + "]";
    }
}
