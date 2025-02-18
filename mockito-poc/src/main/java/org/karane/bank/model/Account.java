package org.karane.bank.model;

public class Account {
    private String id;
    private String owner;
    private double balance;

    public Account(String id, String owner, double balance) {
        this.id = id;
        this.owner = owner;
        this.balance = balance;
    }

    public String getId() { return id; }
    public String getOwner() { return owner; }
    public double getBalance() { return balance; }

    public void withdraw(double amount) {
        if (amount > balance) throw new IllegalArgumentException("Insufficient funds");
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }
}
