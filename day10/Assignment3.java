package com.celcom.day10;


class BankAccount {
    private int balance;
 
    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }
 
    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " is withdrawing " + amount);
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaining balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " tried to withdraw " + amount + " but insufficient funds.");
        }
    }
 
    public int getBalance() {
        return balance;
    }
}
 
class UserThread extends Thread {
    private BankAccount account;
    private int amount;
 
    public UserThread(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }
 
    public void run() {
        account.withdraw(amount);
    }
}
 
public class Assignment3 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500);
 
        UserThread user1 = new UserThread(account, 200);
        UserThread user2 = new UserThread(account, 150);
        UserThread user3 = new UserThread(account, 100);
        UserThread user4 = new UserThread(account, 50);
 
        user1.start();
        user2.start();
        user3.start();
        user4.start();
    }
}
