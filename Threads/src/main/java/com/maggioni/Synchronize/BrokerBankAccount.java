package com.maggioni.Synchronize;

/**
 *
 * http://jeremymanson.blogspot.de/2007/08/atomicity-visibility-and-ordering.html
 */
public class BrokerBankAccount {

    private int balance;

    synchronized int getBalance() {
        return balance;
    }

    synchronized void setBalance(int x) throws IllegalStateException {
        balance = x;
        if (balance < 0) {
            throw new IllegalStateException("Negative Balance");
        }
    }

    synchronized void deposit(int x) {
        int b = getBalance();
        setBalance(b + x);
    }

    synchronized void withdraw(int x) {
        int b = getBalance();
        setBalance(b - x);
    }
}
