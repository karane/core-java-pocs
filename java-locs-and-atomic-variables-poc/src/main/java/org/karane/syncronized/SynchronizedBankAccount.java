package org.karane.syncronized;

class BankAccount {
    private int balance = 1000;

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited $" + amount + ". New balance: $" + balance);
    }

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " insufficient funds for withdrawal.");
        }
    }
}

public class SynchronizedBankAccount {
    public static void main(String[] args) throws InterruptedException {
        BankAccount account = new BankAccount();

        Thread t1 = new Thread(() -> {
            account.deposit(500);
            account.withdraw(200);
        }, "Thread-1");

        Thread t2 = new Thread(() -> {
            account.deposit(300);
            account.withdraw(700);
        }, "Thread-2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}
